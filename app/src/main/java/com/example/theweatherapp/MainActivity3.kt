package com.example.theweatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val tvWeatherData = findViewById<TextView>(R.id.tvAverageTemp)
        val tvAverageTemp = findViewById<TextView>(R.id.tvAverageTemp)
        val btnReturn = findViewById<Button>(R.id.btnReturn)

        btnReturn.setOnClickListener {
            val mainRetBack = Intent(this, MainActivity2 ::class.java)
            startActivity(mainRetBack)
        }
        val weatherData = intent.getSerializableExtra("weatherData")as?
        ArrayList<MainActivity2.Weather>

            if(weatherData != null){
                var weatherinfo =""
                var totalMinTemp = 0.0
                var totalMaxTemp = 0.0

                for (weather in weatherData){
                    weatherinfo += "Day: ${weather.day}, Min Temp: ${weather.minTemp}, Max Temp: ${weather.maxTemp}, Condition: ${weather.condition}\n"
                    totalMinTemp += weather.minTemp
                    totalMaxTemp += weather.maxTemp
                }

                val avgMinTemp = totalMinTemp/weatherData.size
                val avgMaxTemp = totalMaxTemp/weatherData.size

                tvWeatherData.text = weatherinfo
                tvAverageTemp.text = "Average min temp: $avgMinTemp, Average max temp: $avgMaxTemp"
            }



    }
}