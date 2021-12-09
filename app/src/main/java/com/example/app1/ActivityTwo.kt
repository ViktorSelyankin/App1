package com.example.app1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ActivityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
        val button: Button = findViewById(R.id.btnOne)
        button.setOnClickListener {
            val intent = Intent(this@ActivityTwo, ActivityThree::class.java)
            startActivity(intent)
        }
    }
}
