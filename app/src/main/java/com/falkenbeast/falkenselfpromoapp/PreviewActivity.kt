package com.falkenbeast.falkenselfpromoapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.falkenbeast.falkenselfpromoapp.databinding.ActivityPreviewBinding


class PreviewActivity : AppCompatActivity() {

    private lateinit var message : Message
   private lateinit var messagepreviewtext : String
    private lateinit var binding : ActivityPreviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        displaymessaget()
        setupbutton()

    }



    private fun displaymessaget() {
        binding = ActivityPreviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*
        val contactnamne= intent.getStringExtra("contactname")
        val contactnumber= intent.getStringExtra("contactnumber")
        val displayname= intent.getStringExtra("displayname")
        val startdat= intent.getStringExtra("startdate")
        val incjunior= intent.getBooleanExtra("addjunior", false)
        val imistart= intent.getBooleanExtra("immediatestart",false)
        val jbtitle= intent.getStringExtra("jobtitle")

        val teststring = "contact name : $contactnamne\ncontact number : $contactnumber\ndisplay name : $displayname\ninclude junior : $incjunior\nimmidiate start : $imistart\nstart date : $startdat\njob title : $jbtitle"
        binding.messagepreviewid.text = teststring */


        message = intent.getSerializableExtra("Messega") as Message
        // val messagepreviewtext = "Hello\nThis is my next paragraph"
         messagepreviewtext = """
                Hi ${message.contactName}, 
                
                My name is ${message.displayName} and I AM ${message.getFullJobDesc()}.
                
                I have a portfolio of apps to demonstrate my technical skills that i can show on request. 
                
                I am able to start a new postion ${message.getAvailability()}.
                
                Please get in touch if you have any suitable role for me.
                
                Thanks and best regards.
                
                
            """.trimIndent()

        binding.messagepreviewid.text = messagepreviewtext
    }
    private fun setupbutton() {

                binding.sendbuttonid.setOnClickListener{
                    val intent = Intent(Intent.ACTION_SENDTO).apply {
                        data = Uri.parse("smsto: ${message.contactNumber}")  // Only SMS apps respond to this.
                        putExtra("sms_body", messagepreviewtext)

                    }
                    startActivity(intent)
                }
    }
}