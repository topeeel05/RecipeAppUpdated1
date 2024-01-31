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

        val beef = findViewById<TextView>(R.id.textView9)
        beef.setOnClickListener {
            val Intent = Intent (this,beef_category::class.java)
            startActivity(Intent)

        }


        val chicken = findViewById<TextView>(R.id.textView13)
        chicken.setOnClickListener {
            val Intent = Intent (this,chickencategory::class.java)
            startActivity(Intent)

        }

        val dessert = findViewById<TextView>(R.id.textView3)
        dessert.setOnClickListener {
            val Intent = Intent (this,DessertCategory::class.java)
            startActivity(Intent)

        }

        val goat = findViewById<TextView>(R.id.textView10)
        goat.setOnClickListener {
            val Intent = Intent (this,GoatCategory::class.java)
            startActivity(Intent)

        }

        val lamb = findViewById<TextView>(R.id.textView14)
        lamb.setOnClickListener {
            val Intent = Intent (this,LambCategory::class.java)
            startActivity(Intent)

        }

        val vege = findViewById<TextView>(R.id.textView4)
        vege.setOnClickListener {
            val Intent = Intent (this,VegetarianCategory::class.java)
            startActivity(Intent)

        }

        val pork = findViewById<TextView>(R.id.textView11)
        pork.setOnClickListener {
            val Intent = Intent (this,PorkCategory::class.java)
            startActivity(Intent)

        }

        val sf = findViewById<TextView>(R.id.textView15)
        sf.setOnClickListener {
            val Intent = Intent (this,SeafoodCategory::class.java)
            startActivity(Intent)

        }



    }
}