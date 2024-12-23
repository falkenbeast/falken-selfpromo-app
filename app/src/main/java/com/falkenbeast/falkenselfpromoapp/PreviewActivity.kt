package com.falkenbeast.falkenselfpromoapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.falkenbeast.falkenselfpromoapp.databinding.ActivityPreviewBinding


class PreviewActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPreviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val contactnamne= intent.getStringExtra("contactname")
        val contactnumber= intent.getStringExtra("contactnumber")
        val displayname= intent.getStringExtra("displayname")
        val startdat= intent.getStringExtra("startdate")
        val incjunior= intent.getBooleanExtra("addjunior", false)
        val imistart= intent.getBooleanExtra("immediatestart",false)
        val jbtitle= intent.getStringExtra("jobtitle")



        val teststring = "contact name : $contactnamne\ncontact number : $contactnumber\ndisplay name : $displayname\ninclude junior : $incjunior\nimmidiate start : $imistart\nstart date : $startdat\njob title : $jbtitle"
        binding.messagepreviewid.text = teststring


    }
}