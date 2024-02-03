package com.example.myapplicationnn

import android.content.ClipData.Item
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplicationnn.databinding.ActivityMainBinding
import com.example.myapplicationnn.fragments.AboutusFragment
import com.example.myapplicationnn.fragments.HomeFragment
import com.example.myapplicationnn.fragments.SettingsFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val Intent = Intent(this, SecondPage::class.java)
            startActivity(Intent)

        }
    }

}
