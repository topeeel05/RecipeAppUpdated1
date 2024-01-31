package com.example.myapplicationnn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class chickencategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chickencategory)

        val readmore1 = findViewById<TextView>(R.id.rm1)
        readmore1.setOnClickListener {
            val Intent = Intent (this,ap_recipe::class.java)
            startActivity(Intent)

        }

        val readmore2 = findViewById<TextView>(R.id.rm2)
        readmore2.setOnClickListener {
            val Intent = Intent (this,brownstewchicken_recipe::class.java)
            startActivity(Intent)

        }

        val readmore3 = findViewById<TextView>(R.id.rm3)
        readmore3.setOnClickListener {
            val Intent = Intent (this,chickenbasquaise_recipe::class.java)
            startActivity(Intent)

        }

        val readmore4 = findViewById<TextView>(R.id.rm4)
        readmore4.setOnClickListener {
            val Intent = Intent (this,chickencouscous_recipe::class.java)
            startActivity(Intent)

        }

        val readmore5 = findViewById<TextView>(R.id.rm5)
        readmore5.setOnClickListener {
            val Intent = Intent (this,chickenhandi_recipe::class.java)
            startActivity(Intent)

        }
    }
}