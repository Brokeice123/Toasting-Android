package com.example.toasting_android_keith

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // Instantiate - Giving it a name as variable.
    private lateinit var displayinfo:TextView
    private lateinit var user_edt:EditText
    private lateinit var btn_sub:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

displayinfo = findViewById(R.id.txtdisplay)
user_edt = findViewById(R.id.edtuserdata)
btn_sub = findViewById(R.id.btnsubmit)

    //listen for event
    btn_sub.setOnClickListener {

        var userinput = user_edt.text.toString().trim()
        Toast.makeText(this, userinput, Toast.LENGTH_SHORT).show()

        //Toast.makeText(this, "Erling Haaland", Toast.LENGTH_SHORT).show()
    }
    }
}