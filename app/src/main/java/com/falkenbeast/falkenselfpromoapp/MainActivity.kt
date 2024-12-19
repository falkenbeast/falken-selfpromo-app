package com.falkenbeast.falkenselfpromoapp

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Checkable
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var contactname: TextInputEditText? = null
    private var contactnumber: EditText? = null
    private var displayname: EditText? = null
    private var startdate: EditText? = null
    private var juniorcheckbox: CheckBox? = null
    private var imidtiastart: CheckBox? = null
    private var jobtitle: Spinner? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contactname = findViewById(R.id.nameid)
        contactnumber = findViewById(R.id.numberid)
        displayname = findViewById(R.id.displaynameid)
        startdate = findViewById(R.id.availabledateid)
        juniorcheckbox = findViewById(R.id.checkboxjid)
        imidtiastart = findViewById(R.id.imstartid)
        jobtitle = findViewById(R.id.listspinnerid)


        val previewbutton: Button = findViewById(R.id.buttonpreviewid)
        previewbutton.setOnClickListener {
            onPreviewClick()
        }

    }

    private fun onPreviewClick() {






        val teststring = contactname?.text.toString() + ", " + contactnumber?.text.toString()
        Toast.makeText(this, teststring, Toast.LENGTH_LONG).show()

    }
}