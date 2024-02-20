package com.example.myapplicationnn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            val Intent = Intent(this, SecondPage::class.java)
            startActivity(Intent)

        }

        val aub = findViewById<TextView>(R.id.aboutusbtn)
        aub.setOnClickListener {
            val Intent = Intent(this, aboutuspage::class.java)
            startActivity(Intent)

        }


    }
}