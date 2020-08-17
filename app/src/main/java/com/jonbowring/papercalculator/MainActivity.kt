package com.jonbowring.papercalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // When the app starts inflate the activity_main layout
        setContentView(R.layout.activity_main)
    }
}