package com.example.myapplicationnn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class crispyeggplant_recipe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crispyeggplant_recipe)
        val secondActbutton1 = findViewById<ImageView>(R.id.backbtn)
        secondActbutton1.setOnClickListener {
            val Intent = Intent (this,SecondPage::class.java)
            startActivity(Intent)

        }

        val aub = findViewById<TextView>(R.id.aboutusbtn)
        aub.setOnClickListener {
            val Intent = Intent(this, aboutuspage::class.java)
            startActivity(Intent)

        }

        val set = findViewById<TextView>(R.id.settingsbtn)
        set.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)

        }
    }
}