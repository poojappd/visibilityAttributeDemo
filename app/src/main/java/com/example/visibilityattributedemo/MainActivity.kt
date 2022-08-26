package com.example.visibilityattributedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        val view = findViewById<Button>(R.id.button)
        view.postDelayed({
            view.visibility = View.VISIBLE
        },3000)
        startActivity(Intent(this, VerticalBarrier::class.java))

    }
}