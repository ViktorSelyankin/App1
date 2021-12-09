// package com.example.app1
//
//import android.os.Bundle
//import android.util.Log
//import androidx.appcompat.app.AppCompatActivity
//
//private const val Tag = "MainActivity"
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        Log.d(Tag, "onCreate(Bundle?) called")
//        setContentView(R.layout.activity_main)
//    }
//
//    override fun onStart() {
//        super.onStart()
//        Log.d(Tag, "Privet onStart(Bundle?) called")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.d(Tag, "Privet onResume(Bundle?) called")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.d(Tag, "Privet onPause(Bundle?) called")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.d(Tag, "onStop(Bundle?) called")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.d(Tag, "onDestroy(Bundle?) called")
//    }
//}
package com.example.app1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btnOne)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, ActivityTwo::class.java)
            startActivity(intent)
        }
    }
}
