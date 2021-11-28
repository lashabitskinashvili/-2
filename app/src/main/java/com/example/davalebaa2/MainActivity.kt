package com.example.davalebaa2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var Mail : TextView

    lateinit var Password : TextView

    lateinit var alreadyHave: TextView

    var CorrectEmail: String = "lashabitsk.1@gmail.com"
    var CorrectPassword : String = "ravirame12"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Mail = findViewById(R.id.email)
        Password = findViewById(R.id.pass)
        alreadyHave = findViewById(R.id.already)

        val button = findViewById<Button>(R.id.check)
        button.setOnClickListener{
            if(Mail.text.toString() == CorrectEmail && Password.text.toString() == CorrectPassword){
                Toast.makeText(this,"your login and password is correct ", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"your login or password is incorrect",Toast.LENGTH_LONG).show()
            }
        }
        alreadyHave.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}