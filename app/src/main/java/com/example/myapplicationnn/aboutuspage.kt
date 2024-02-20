package com.example.myapplicationnn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class aboutuspage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutuspage)

        val homebtn = findViewById<ImageView>(R.id.backbtn)
        homebtn.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }

        val homebtn2 = findViewById<ImageView>(R.id.backbtn2)
        homebtn2.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }

        val homebtn3 = findViewById<ImageView>(R.id.backbtn3)
        homebtn3.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }

        val homebtn4 = findViewById<ImageView>(R.id.backbtn4)
        homebtn4.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }

        val homebtn5 = findViewById<ImageView>(R.id.backbtn5)
        homebtn5.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }


    }
}