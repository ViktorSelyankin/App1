package com.example.app1

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityFour : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btnFour)
        button.setOnClickListener {
            val text = "@string/about_text"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.setGravity(Gravity.CENTER, 0, 0)
        }
    }
}