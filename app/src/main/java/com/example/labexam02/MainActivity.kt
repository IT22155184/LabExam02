package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnLaunch = findViewById<Button>(R.id.btn_launch)
        btnLaunch.setOnClickListener {

        var intent = Intent(this, login::class.java)
        startActivity(intent)
        finish()
        }
    }



}