package com.example.myapplicationnn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_page)

        val thirdActbutton = findViewById<Button>(R.id.button3)
        thirdActbutton.setOnClickListener {
            val Intent = Intent (this,SecondPage::class.java)
            startActivity(Intent)

        }
    }
}