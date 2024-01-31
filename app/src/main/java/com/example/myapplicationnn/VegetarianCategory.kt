package com.example.myapplicationnn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class VegetarianCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegetarian_category)

        val readmore1 = findViewById<TextView>(R.id.rm1)
        readmore1.setOnClickListener {
            val Intent = Intent (this,crispyeggplant_recipe::class.java)
            startActivity(Intent)

        }

        val readmore2 = findViewById<TextView>(R.id.rm2)
        readmore2.setOnClickListener {
            val Intent = Intent (this,fulmedames_recipe::class.java)
            startActivity(Intent)

        }

        val readmore3 = findViewById<TextView>(R.id.rm3)
        readmore3.setOnClickListener {
            val Intent = Intent (this,koshari_recipe::class.java)
            startActivity(Intent)

        }

        val readmore4 = findViewById<TextView>(R.id.rm4)
        readmore4.setOnClickListener {
            val Intent = Intent (this,oliviersalad_recipe::class.java)
            startActivity(Intent)

        }
        val readmore5 = findViewById<TextView>(R.id.rm5)
        readmore5.setOnClickListener {
            val Intent = Intent (this,shakshuka_recipe::class.java)
            startActivity(Intent)

        }
    }
}