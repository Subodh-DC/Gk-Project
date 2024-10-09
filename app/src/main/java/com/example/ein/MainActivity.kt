package com.example.ein

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Delay for 3 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            // Start HomeActivity after 3 seconds
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
            finish() // Close SplashActivity so the user cannot go back to it
        }, 3000) // 3000 milliseconds = 3 seconds

    }
}