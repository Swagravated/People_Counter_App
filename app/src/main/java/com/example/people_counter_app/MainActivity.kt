package com.example.people_counter_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMeNo = findViewById<Button>(R.id.sadButton)
        val tvMyTextViewNo = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickMeNo.setOnClickListener {
            timesClicked += 1
            tvMyTextViewNo.text = timesClicked.toString() + getString(R.string.buttonNoPressed)
        }

        val btnClickMeYes = findViewById<Button>(R.id.amazingButton)
        val tvMyTextViewYes = findViewById<TextView>(R.id.textView)
        btnClickMeYes.setOnClickListener {
            tvMyTextViewYes.text = getString(R.string.buttonYesPressed)
            Toast.makeText(this, "Hey! Welcome to the Glad Gang!", Toast.LENGTH_LONG).show()
        }

        val btnClickMeReset = findViewById<Button>(R.id.resetButton)
        val tvMyTextViewReset = findViewById<TextView>(R.id.textView)
        btnClickMeReset.setOnClickListener {
            tvMyTextViewReset.text = getString(R.string.textViewMain)
            timesClicked = 0
        }

    }
}