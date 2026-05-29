package com.example.weatherapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultScreen : AppCompatActivity() {
    lateinit var tvResults : TextView
    lateinit var btnGG : Button
    lateinit var btnHome : Button

    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result_screen)
        tvResults = findViewById(R.id.tvResults)
        btnGG = findViewById(R.id.btnGG)
        btnHome = findViewById(R.id.btnHome)

        val maxTemp = intent.getIntExtra("maxTemp", 0)
        val minTemp = intent.getIntExtra("minTemp", 0)
        val weatherConditions = intent.getStringExtra("weatherConditions")

        tvResults.text = "Days \tMax Temp \tMin Temp \tWeather\n" +
                "${days.joinToString(", ")} \t$maxTemp \t$minTemp \t$weatherConditions"

    }
}