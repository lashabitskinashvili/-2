package com.example.davalebaa2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {

    lateinit var userName: TextView

    lateinit var signed: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main2)


        userName = findViewById(R.id.userName)

        signed = findViewById(R.id.Signed)

        signed.setOnClickListener{
            val userName: String = userName.text.toString()
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("Username",userName)
            startActivity(intent)
        }

    }

}