package com.example.myapplicationnn

import android.content.ClipData.Item
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        val secondActbutton1 = findViewById<ImageView>(R.id.backbtn)
        secondActbutton1.setOnClickListener {
            val Intent = Intent (this,MainActivity::class.java)
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

        val upangdagupan = findViewById<TextView>(R.id.card1)
        upangdagupan.setOnClickListener {
            val Intent = Intent (this,BreakfastCategory::class.java)
            startActivity(Intent)

        }

        val coc = findViewById<TextView>(R.id.card2)
        coc.setOnClickListener {
            val Intent = Intent (this,beef_category::class.java)
            startActivity(Intent)

        }


        val sjc = findViewById<TextView>(R.id.card3)
        sjc.setOnClickListener {
            val Intent = Intent (this,chickencategory::class.java)
            startActivity(Intent)

        }

        val nueva = findViewById<TextView>(R.id.card4)
        nueva.setOnClickListener {
            val Intent = Intent (this,DessertCategory::class.java)
            startActivity(Intent)

        }

        val iloilo = findViewById<TextView>(R.id.card5)
        iloilo.setOnClickListener {
            val Intent = Intent (this,GoatCategory::class.java)
            startActivity(Intent)

        }

        val qcmnl = findViewById<TextView>(R.id.card6)
        qcmnl.setOnClickListener {
            val Intent = Intent (this,LambCategory::class.java)
            startActivity(Intent)

        }

        val sclaguna = findViewById<TextView>(R.id.card7)
        sclaguna.setOnClickListener {
            val Intent = Intent (this,VegetarianCategory::class.java)
            startActivity(Intent)

        }

        val cebu = findViewById<TextView>(R.id.card8)
        cebu.setOnClickListener {
            val Intent = Intent (this,PorkCategory::class.java)
            startActivity(Intent)

        }

        val rizallaguna = findViewById<TextView>(R.id.card9)
        rizallaguna.setOnClickListener {
            val Intent = Intent (this,SeafoodCategory::class.java)
            startActivity(Intent)

        }



    }
}