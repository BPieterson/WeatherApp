package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var txtName: EditText
    lateinit var txtStudent: EditText
    lateinit var btnExit: Button
    lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        txtName = findViewById(R.id.txtName)
        txtStudent = findViewById(R.id.txtStudent)
        btnExit = findViewById(R.id.btnExit)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val name = txtName.text.toString()
            val student = txtStudent.text.toString()

            if (name.isEmpty() && student.isEmpty()) {
                // Proceed to the next screen or perform login
                if (name.isEmpty()) {
                    txtName.error = "Please enter your name"
                }
                if (student.isEmpty()) {
                    txtStudent.error = "Please enter your student number"
                }
            }else{
                // Handle successful login, e.g., navigate to the next screen
                 val intent = Intent(this, WeatherScreen::class.java)
                intent.putExtra("name", name)
                intent.putExtra("student", student)
                startActivity(intent)
                finish()
            }
        }

        btnExit.setOnClickListener {
            finish()
        }
    }
}