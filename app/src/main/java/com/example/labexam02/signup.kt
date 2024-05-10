package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class signup : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var btnBack = findViewById<ImageButton>(R.id.back_to_login)
        btnBack.setOnClickListener {
            var intent = Intent(this, login::class.java)
            startActivity(intent)
            finish()
        }

        var btn_signup = findViewById<Button>(R.id.btn_to_signup)
        btn_signup.setOnClickListener {

            var intent = Intent(this, homepage::class.java)
            startActivity(intent)
            finish()
        }

    }
}