package com.example.swe2009867

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewCarsButton: Button = findViewById(R.id.viewCarsButton)
        viewCarsButton.setOnClickListener {
            val intent = Intent(this, carListActivity::class.java)
            startActivity(intent)
        }

        val bookCarButton: Button = findViewById(R.id.bookCarButton)
        bookCarButton.setOnClickListener {
            // Implement your navigation logic
        }

        val myBookingsButton: Button = findViewById(R.id.myBookingsButton)}}

