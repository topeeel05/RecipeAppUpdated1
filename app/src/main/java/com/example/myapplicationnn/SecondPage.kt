package com.example.myapplicationnn

import android.content.ClipData.Item
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.TextView

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        val secondActbutton1 = findViewById<Button>(R.id.button2)
        secondActbutton1.setOnClickListener {
            val Intent = Intent (this,MainActivity::class.java)
            startActivity(Intent)

        }

        val forthActbutton = findViewById<Button>(R.id.button4)
        forthActbutton.setOnClickListener {
            val Intent = Intent (this,ThirdPage::class.java)
            startActivity(Intent)

        }



        val breakfast = findViewById<TextView>(R.id.textView8)
        breakfast.setOnClickListener {
            val Intent = Intent (this,BreakfastCategory::class.java)
            startActivity(Intent)

        }

    }
}