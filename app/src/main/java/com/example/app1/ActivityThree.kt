package com.example.app1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
        val button: Button = findViewById(R.id.btnThree)
        button.setOnClickListener {
            val intent = Intent(this@ActivityThree, ActivityFour::class.java)
            startActivity(intent)
        }
    }
}