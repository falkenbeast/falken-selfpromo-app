package com.falkenbeast.falkenselfpromoapp

import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.falkenbeast.falkenselfpromoapp.databinding.ActivityMainBinding

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /*   private var contactname: TextInputEditText? = null
       private var contactnumber: EditText? = null
       private var displayname: EditText? = null
       private var startdate: EditText? = null
       private var juniorcheckbox: CheckBox? = null
       private var imidtiastart: CheckBox? = null
       private var jobtitle: Spinner? = null*/

    private  lateinit var binding : ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*contactname = findViewById(R.id.nameid)
        contactnumber = findViewById(R.id.numberid)
        displayname = findViewById(R.id.displaynameid)
        startdate = findViewById(R.id.availabledateid)
        juniorcheckbox = findViewById(R.id.checkboxjid)
        imidtiastart = findViewById(R.id.imstartid)
        jobtitle = findViewById(R.id.listspinnerid)*/


        /*val previewbutton: Button = findViewById(R.id.buttonpreviewid)
        previewbutton.setOnClickListener {
            onPreviewClick()
        }*/

        val spinnerValue = arrayOf("Android Developer", "Web Developer", "Software Developer", "fullstack Developer", "Front-End Developer", "Back-End Developer")
        val spinnerAdapter = ArrayAdapter(this, R.layout.simple_spinner_dropdown_item, spinnerValue)
        binding.listspinnerid.adapter = spinnerAdapter


        binding.buttonpreviewid.setOnClickListener{
            onPreviewClick()
        }

    }

    private fun onPreviewClick() {

        val contactName = binding.nameid.text.toString()
        val contactNumber = binding.numberid.text.toString()
        val displayName = binding.displaynameid.text.toString()
        val startDate = binding.availabledateid.text.toString()
        val isJunior = binding.checkboxjid.isChecked
        val isImmediateStart = binding.imstartid.isChecked
      val jobTitle = binding.listspinnerid.selectedItem?.toString() //if we uncomment this without completing its action or without setting this up completely it will crash the app or put ?

        // val teststring = contactname?.text.toString() + ", " + contactnumber?.text.toString()



        val message = Message(
            binding.nameid.text.toString(),
            binding.numberid.text.toString(),
            binding.displaynameid.text.toString(),
            binding.checkboxjid.isChecked,
            binding.listspinnerid.selectedItem?.toString() ,
            binding.imstartid.isChecked,
            binding.availabledateid.text.toString()           //can have both variable as well as direct argumernts



        )

        val previewActivityIntent = Intent(this, PreviewActivity::class.java)
        previewActivityIntent.putExtra("Messega", message)

     /*   previeActivityIntent.putExtra("contactname", contactName)
       previeActivityIntent.putExtra("contactnumber", contactNumber)
        previeActivityIntent.putExtra("displayname", displayName)
        previeActivityIntent.putExtra("startdate",  startDate)
        previeActivityIntent.putExtra("addjunior", isJunior)
        previeActivityIntent.putExtra("immediatestart", isImmediateStart)
        previeActivityIntent.putExtra("jobtitle", jobTitle)*/



        startActivity(previewActivityIntent)





    }
}


//25

