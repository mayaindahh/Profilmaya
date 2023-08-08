package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnprofile: CardView = findViewById(R.id.profile)
        val btnfortofolio: CardView = findViewById(R.id.fortofolio)
        val btnskile:  CardView = findViewById(R.id.skile)
        val btneducation: CardView = findViewById(R.id.education)
        val btnhoby: CardView = findViewById(R.id.hobi)

        btnprofile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        btnfortofolio.setOnClickListener {
           val intent = Intent(this, PortofolioActivity::class.java)
            startActivity(intent)
        }

        btnskile.setOnClickListener {
            val intent = Intent(this, SkilleActivity::class.java)
            startActivity(intent)
        }

        btneducation.setOnClickListener {
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }

        btnhoby.setOnClickListener {
            val intent = Intent(this, HobbyActivity::class.java)
            startActivity(intent)
        }
    }
}