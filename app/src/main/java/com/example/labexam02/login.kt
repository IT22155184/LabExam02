package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btnBack = findViewById<ImageButton>(R.id.back_to_launch)
        btnBack.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        var btn_to_signup = findViewById<Button>(R.id.to_signup)
        btn_to_signup.setOnClickListener {

            var intent = Intent(this, signup::class.java)
            startActivity(intent)
            finish()
        }

        var btn_login = findViewById<Button>(R.id.btn_login)
        btn_login.setOnClickListener {

            var intent = Intent(this, homepage::class.java)
            startActivity(intent)
            finish()
        }

    }
}