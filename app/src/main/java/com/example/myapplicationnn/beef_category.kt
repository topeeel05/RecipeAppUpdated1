package com.example.myapplicationnn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class beef_category : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beef_category)

        val readmore1 = findViewById<TextView>(R.id.rm1)
        readmore1.setOnClickListener {
            val Intent = Intent (this,bbpr_recipe::class.java)
            startActivity(Intent)

        }

        val readmore2 = findViewById<TextView>(R.id.rm2)
        readmore2.setOnClickListener {
            val Intent = Intent (this,bc_recipe::class.java)
            startActivity(Intent)

        }

        val readmore3 = findViewById<TextView>(R.id.rm3)
        readmore3.setOnClickListener {
            val Intent = Intent (this,beefdumpling_recipe::class.java)
            startActivity(Intent)

        }

        val readmore4 = findViewById<TextView>(R.id.rm4)
        readmore4.setOnClickListener {
            val Intent = Intent (this,beeflomein_recipe::class.java)
            startActivity(Intent)

        }

        val readmore5 = findViewById<TextView>(R.id.rm5)
        readmore5.setOnClickListener {
            val Intent = Intent (this,beefmechado_recipe::class.java)
            startActivity(Intent)

        }

        val readmore6 = findViewById<TextView>(R.id.rm6)
        readmore6.setOnClickListener {
            val Intent = Intent (this,beefwellington_recipe::class.java)
            startActivity(Intent)

        }
    }
}