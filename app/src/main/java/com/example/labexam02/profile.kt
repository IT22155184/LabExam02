package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class profile : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var btn_add = findViewById<ImageButton>(R.id.btn_add_nav)
        btn_add.setOnClickListener {
            var intent = Intent(this, addTasks::class.java)
            startActivity(intent)
            finish()
        }

        var btn_calendar = findViewById<ImageButton>(R.id.btn_calendar_nav)
        btn_calendar.setOnClickListener {
            var intent = Intent(this, calendar::class.java)
            startActivity(intent)
            finish()
        }

        var btn_home = findViewById<ImageButton>(R.id.btn_home_nav)
        btn_home.setOnClickListener {
            var intent = Intent(this, homepage::class.java)
            startActivity(intent)
            finish()
        }

        var btn_profile = findViewById<ImageButton>(R.id.btn_profile_nav)
        btn_profile.setOnClickListener {
            var intent = Intent(this, profile::class.java)
            startActivity(intent)
            finish()
        }

        var btn_logout = findViewById<Button>(R.id.btn_logout)
        btn_logout.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}