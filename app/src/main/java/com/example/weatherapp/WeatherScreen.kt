package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class WeatherScreen : AppCompatActivity() {
    lateinit var txtMxMon : EditText
    lateinit var txtMnMon : EditText
    lateinit var txtMxTue : EditText
    lateinit var txtMnTue : EditText
    lateinit var txtMxWed : EditText
    lateinit var txtMnWed : EditText
    lateinit var txtMxThu : EditText
    lateinit var txtMnThu : EditText
    lateinit var txtMxFri : EditText
    lateinit var txtMnFri : EditText
    lateinit var txtMxSat : EditText
    lateinit var txtMnSat : EditText
    lateinit var txtMxSun : EditText
    lateinit var txtMnSun : EditText
    lateinit var spMon : Spinner
    lateinit var spTue : Spinner
    lateinit var spWed : Spinner
    lateinit var spThu : Spinner
    lateinit var spFri : Spinner
    lateinit var spSat : Spinner
    lateinit var spSun : Spinner
    lateinit var tvAvg : TextView
    lateinit var btnAvg : Button
    lateinit var btnNext : Button
    lateinit var btnExit : Button
    lateinit var btnClear : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_weather_screen)
        txtMxMon = findViewById(R.id.txtMxMon)
        txtMnMon = findViewById(R.id.txtMnMon)
        txtMxTue = findViewById(R.id.txtMxTue)
        txtMnTue = findViewById(R.id.txtMnTue)
        txtMxWed = findViewById(R.id.txtMxWed)
        txtMnWed = findViewById(R.id.txtMnWed)
        txtMxThu = findViewById(R.id.txtMxThu)
        txtMnThu = findViewById(R.id.txtMnThu)
        txtMxFri = findViewById(R.id.txtMxFri)
        txtMnFri = findViewById(R.id.txtMnFri)
        txtMxSat = findViewById(R.id.txtMxSat)
        txtMnSat = findViewById(R.id.txtMnSat)
        txtMxSun = findViewById(R.id.txtMxSun)
        txtMnSun = findViewById(R.id.txtMnSun)
        spMon = findViewById(R.id.spMon)
        spTue = findViewById(R.id.spTue)
        spWed = findViewById(R.id.spWed)
        spThu = findViewById(R.id.spThu)
        spFri = findViewById(R.id.spFri)
        spSat = findViewById(R.id.spSat)
        spSun = findViewById(R.id.spSun)
        tvAvg = findViewById(R.id.tvAvg)
        btnAvg = findViewById(R.id.btnAvg)
        btnNext = findViewById(R.id.btnNext)
        btnExit = findViewById(R.id.btnOut)
        btnClear = findViewById(R.id.btnClear)

        btnNext.setOnClickListener {
            // Handle the logic for the next button, e.g., validate input and navigate to the next screen

            val mxMon = txtMxMon.text.toString().toInt()
            val mnMon = txtMnMon.text.toString().toInt()
            val mxTue = txtMxTue.text.toString().toInt()
            val mnTue = txtMnTue.text.toString().toInt()
            val mxWed = txtMxWed.text.toString().toInt()
            val mnWed = txtMnWed.text.toString().toInt()
            val mxThu = txtMxThu.text.toString().toInt()
            val mnThu = txtMnThu.text.toString().toInt()
            val mxFri = txtMxFri.text.toString().toInt()
            val mnFri = txtMnFri.text.toString().toInt()
            val mxSat = txtMxSat.text.toString().toInt()
            val mnSat = txtMnSat.text.toString().toInt()
            val mxSun = txtMxSun.text.toString().toInt()
            val mnSun = txtMnSun.text.toString().toInt()
            val spMon = spMon.selectedItem.toString()
            val spTue = spTue.selectedItem.toString()
            val spWed = spWed.selectedItem.toString()
            val spThu = spThu.selectedItem.toString()
            val spFri = spFri.selectedItem.toString()
            val spSat = spSat.selectedItem.toString()
            val spSun = spSun.selectedItem.toString()

            if (mxMon.toString().isEmpty() || mnMon.toString().isEmpty() || mxTue.toString().isEmpty() || mnTue.toString().isEmpty() ||
                mxWed.toString().isEmpty() || mnWed.toString().isEmpty() || mxThu.toString().isEmpty() || mnThu.toString().isEmpty() ||
                mxFri.toString().isEmpty() || mnFri.toString().isEmpty() || mxSat.toString().isEmpty() || mnSat.toString().isEmpty() ||
                mxSun.toString().isEmpty() || mnSun.toString().isEmpty()) {

                // Show an error message or prompt the user to fill in all fields
                if(mxMon.toString().isEmpty()){
                    txtMxMon.error = "Please enter the maximum temperature for Monday"
                }
                if(mnMon.toString().isEmpty()){
                    txtMnMon.error = "Please enter the minimum temperature for Monday"
                }
                if(mxTue.toString().isEmpty()){
                    txtMxTue.error = "Please enter the maximum temperature for Tuesday"
                }
                if(mnTue.toString().isEmpty()){
                    txtMnTue.error = "Please enter the minimum temperature for Tuesday"
                }
                if(mxWed.toString().isEmpty()){
                    txtMxWed.error = "Please enter the maximum temperature for Wednesday"
                }
                if(mnWed.toString().isEmpty()){
                    txtMnWed.error = "Please enter the minimum temperature for Wednesday"
                }
                if(mxThu.toString().isEmpty()){
                    txtMxThu.error = "Please enter the maximum temperature for Thursday"
                }
                if(mnThu.toString().isEmpty()){
                    txtMnThu.error = "Please enter the minimum temperature for Thursday"
                }
                if(mxFri.toString().isEmpty()){
                    txtMxFri.error = "Please enter the maximum temperature for Friday"
                }
                if(mnFri.toString().isEmpty()){
                    txtMnFri.error = "Please enter the minimum temperature for Friday"
                }
                if(mxSat.toString().isEmpty()){
                    txtMxSat.error = "Please enter the maximum temperature for Saturday"
                }
                if(mnSat.toString().isEmpty()){
                    txtMnSat.error = "Please enter the minimum temperature for Saturday"
                }
                if(mxSun.toString().isEmpty()){
                    txtMxSun.error = "Please enter the maximum temperature for Sunday"
                }
                if(mnSun.toString().isEmpty()){
                    txtMnSun.error = "Please enter the minimum temperature for Sunday"
                }
            } else {
                // The array of Maximum temperatures for the week
                val maxTemp = intArrayOf(mxMon, mxTue, mxWed, mxThu, mxFri, mxSat, mxSun)

                // The array of Minimum temperatures for the week
                val minTemp = intArrayOf(mnMon, mnTue, mnWed, mnThu, mnFri, mnSat, mnSun)

                // The array of Weather conditions for the week
                val weatherCondition = arrayOf(spMon, spTue, spWed, spThu, spFri, spSat, spSun)

                // Proceed to the next screen or perform necessary actions with the input data
                val intent = Intent(this, ResultScreen::class.java)
                intent.putExtra("maxTemp", maxTemp)
                intent.putExtra("minTemp", minTemp)
                intent.putExtra("weatherCondition", weatherCondition)
                startActivity(intent)
                finish()
            }
        }
        btnAvg.setOnClickListener {
            // Handle the logic for the average button, e.g., calculate and display the average temperature
            val mxMon = txtMxMon.text.toString().toInt()
            val mnMon = txtMnMon.text.toString().toInt()
            val mxTue = txtMxTue.text.toString().toInt()
            val mnTue = txtMnTue.text.toString().toInt()
            val mxWed = txtMxWed.text.toString().toInt()
            val mnWed = txtMnWed.text.toString().toInt()
            val mxThu = txtMxThu.text.toString().toInt()
            val mnThu = txtMnThu.text.toString().toInt()
            val mxFri = txtMxFri.text.toString().toInt()
            val mnFri = txtMnFri.text.toString().toInt()
            val mxSat = txtMxSat.text.toString().toInt()
            val mnSat = txtMnSat.text.toString().toInt()
            val mxSun = txtMxSun.text.toString().toInt()
            val mnSun = txtMnSun.text.toString().toInt()

            if (mxMon.toString().isEmpty() || mnMon.toString().isEmpty() || mxTue.toString().isEmpty() || mnTue.toString().isEmpty() ||
                mxWed.toString().isEmpty() || mnWed.toString().isEmpty() || mxThu.toString().isEmpty() || mnThu.toString().isEmpty() ||
                mxFri.toString().isEmpty() || mnFri.toString().isEmpty() || mxSat.toString().isEmpty() || mnSat.toString().isEmpty() ||
                mxSun.toString().isEmpty() || mnSun.toString().isEmpty()) {

                // Show an error message or prompt the user to fill in all fields
                if(mxMon.toString().isEmpty()){
                    txtMxMon.error = "Please enter the maximum temperature for Monday"
                }
                if(mnMon.toString().isEmpty()){
                    txtMnMon.error = "Please enter the minimum temperature for Monday"
                }
                if(mxTue.toString().isEmpty()){
                    txtMxTue.error = "Please enter the maximum temperature for Tuesday"
                }
                if(mnTue.toString().isEmpty()){
                    txtMnTue.error = "Please enter the minimum temperature for Tuesday"
                }
                if(mxWed.toString().isEmpty()){
                    txtMxWed.error = "Please enter the maximum temperature for Wednesday"
                }
                if(mnWed.toString().isEmpty()){
                    txtMnWed.error = "Please enter the minimum temperature for Wednesday"
                }
                if(mxThu.toString().isEmpty()){
                    txtMxThu.error = "Please enter the maximum temperature for Thursday"
                }
                if(mnThu.toString().isEmpty()){
                    txtMnThu.error = "Please enter the minimum temperature for Thursday"
                }
                if(mxFri.toString().isEmpty()){
                    txtMxFri.error = "Please enter the maximum temperature for Friday"
                }
                if(mnFri.toString().isEmpty()){
                    txtMnFri.error = "Please enter the minimum temperature for Friday"
                }
                if(mxSat.toString().isEmpty()){
                    txtMxSat.error = "Please enter the maximum temperature for Saturday"
                }
                if(mnSat.toString().isEmpty()){
                    txtMnSat.error = "Please enter the minimum temperature for Saturday"
                }
                if(mxSun.toString().isEmpty()){
                    txtMxSun.error = "Please enter the maximum temperature for Sunday"
                }
                if(mnSun.toString().isEmpty()){
                    txtMnSun.error = "Please enter the minimum temperature for Sunday"
                }
            }else{
               val temps = intArrayOf(mxMon, mnMon, mxTue, mnTue, mxWed, mnWed, mxThu, mnThu, mxFri, mnFri, mxSat, mnSat, mxSun, mnSun)
                var sum = 0
                for(temp in temps){
                    sum += temp
                }
                val avg = sum / temps.size
                tvAvg.text = "Average Temperature: $avg"
            }
        }
        btnExit.setOnClickListener {

            // Handle the logic for the exit button, e.g., confirm exit and finish the activity
            finish()
        }
        btnClear.setOnClickListener {
            // Handle the logic for the clear button, e.g., reset all input fields and selections
            txtMxMon.text.clear()
            txtMnMon.text.clear()
            txtMxTue.text.clear()
            txtMnTue.text.clear()
            txtMxWed.text.clear()
            txtMnWed.text.clear()
            txtMxThu.text.clear()
            txtMnThu.text.clear()
            txtMxFri.text.clear()
            txtMnFri.text.clear()
            txtMxSat.text.clear()
            txtMnSat.text.clear()
            txtMxSun.text.clear()
            txtMnSun.text.clear()
            spMon.setSelection(0)
            spTue.setSelection(0)
            spWed.setSelection(0)
            spThu.setSelection(0)
            spFri.setSelection(0)
            spSat.setSelection(0)
            spSun.setSelection(0)
            tvAvg.text = ""
        }
    }
}