package com.example.theweatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btnStart)
        val btnExit = findViewById<Button>(R.id.btnExit)

        btnStart.setOnClickListener {//Navigation code to main screen
            val intent = Intent(this,MainActivity2 :: class.java)
            startActivity(intent)
        }

        btnExit.setOnClickListener {
            finish()
            System.exit(0)
        }
    }
}