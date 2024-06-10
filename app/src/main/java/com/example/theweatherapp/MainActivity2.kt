package com.example.theweatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    private lateinit var edtDay : EditText
    private lateinit var edtMin : EditText
    private lateinit var edtMax : EditText
    private lateinit var edtCond : EditText
    private lateinit var btnIn : Button

    private val weatherData = mutableListOf<Weather>()


    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //declaration
        val btnExit2 = findViewById<Button>(R.id.btnExit2)
        val btnNav = findViewById<Button>(R.id.btnNav)
        val btnInput = findViewById<Button>(R.id.btnInput)
        var edtDay = findViewById<EditText>(R.id.edtDay)
        val edtMin = findViewById<EditText>(R.id.edtMin)
        val edtMax = findViewById<EditText>(R.id.edtMax)
        val edtCond = findViewById<EditText>(R.id.edtConditions)


        //coding for exit button
        btnExit2.setOnClickListener {
            finish()
            System.exit(0)
        }

        //coding for nav button to next page
        btnNav.setOnClickListener {
            val inte = Intent(this,MainActivity3 :: class.java).apply{
                putExtra("weatherData", ArrayList(weatherData))
            }
            startActivity(inte)
        }


        btnInput.setOnClickListener {
          //get the input values
          val day = edtDay.text.toString()
          val minTemp = edtMin.text.toString().toDoubleOrNull()
          val maxTemp = edtMax.text.toString().toDoubleOrNull()
          val cond= edtCond.text.toString().toDoubleOrNull()
          var avg =  Int;

            Log.d("DEBUG", "Day: $day, MinTemp: $minTemp, MaxTemp: $maxTemp, Condition: $cond")

            if (day.isNotEmpty() && minTemp != null && maxTemp != null && cond.isNotEmpty()) { //Check if all fields are checked correctly
             weatherData.add(Weather(day, minTemp, maxTemp, cond))
             Toast.makeText(this,"Data added", Toast.LENGTH_LONG).show()
                //clear the input fields
                edtDay.text.clear()
                edtMin.text.clear()
                edtMax.text.clear()
                edtCond.text.clear()
            }else{
                Toast.makeText(this,"Please enter all the fields correctly", Toast.LENGTH_LONG).show()
            }

        }
    }

    data class Weather(val day: String, val minTemp:Double, val maxTemp: Double, val condition: Double?) : java.io.Serializable
}

