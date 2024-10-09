package com.example.ein

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Subject : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_subject)

        val mainView = findViewById<View>(R.id.main)
        if (mainView != null) {
            ViewCompat.setOnApplyWindowInsetsListener(mainView) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        } else {
            // Handle the situation where the view with ID "main" is not found
            Log.e("Subject", "View with ID 'main' not found in layout")
        }
        val data = intent.extras?.getString("homepagedata")

        if (data == "Paragraphs") {
            gototopics(data)
        } else if (data == "QandA") {
            gototopics(data)
        } else if (data == "Quiz") {
            gototopics(data)
        } else if (data == "Trick") {
            gototopics(data)

        }
    }

    private fun gototopics(data: String) {
        val his = findViewById<ImageView>(R.id.his_cata)
        val geo = findViewById<ImageView>(R.id.imageView16)
        val cons = findViewById<ImageView>(R.id.cons_cata)
        val sci = findViewById<ImageView>(R.id.sci_cata)
        val eco = findViewById<ImageView>(R.id.eco_cata)
        val comp = findViewById<ImageView>(R.id.copm_cata)
        val reg = findViewById<ImageView>(R.id.reg_cta)


        his.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            Toast.makeText(this, "his", Toast.LENGTH_SHORT).show()
            //intent.putExtra("data", "$data History")
            startActivity(intent)
        }
        geo.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            Toast.makeText(this, "geo", Toast.LENGTH_SHORT).show()
            //intent.putExtra("data", "$data Geography")
            startActivity(intent)
        }
        cons.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            //intent.putExtra("data", "$data Constitution")
            startActivity(intent)
        }
        sci.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            //intent.putExtra("data", "$data Science")
            startActivity(intent)
        }
        eco.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            //intent.putExtra("data", "$data Economics")
            startActivity(intent)
        }
        comp.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            //intent.putExtra("data", "$data Computer")
            startActivity(intent)
        }
        reg.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            //intent.putExtra("data", "$data Reasoning")
            startActivity(intent)
        }
    }

}
