package com.example.ein

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.Layout
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ein.databinding.ActivityHomepageBinding

class Homepage : AppCompatActivity() {
    lateinit var binding: ActivityHomepageBinding
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.paragraph.setOnClickListener {
            Toast.makeText(this, "para", Toast.LENGTH_SHORT).show()
            val intent= Intent(this, Subject::class.java)
            //intent.putExtra("homepagedata","Paragraphs")
            startActivity(intent)
        }

        binding.QandA.setOnClickListener {
            Toast.makeText(this, "QandA", Toast.LENGTH_SHORT).show()
            val intent= Intent(this, Subject::class.java)
            //intent.putExtra("homepagedata","QandA")
            startActivity(intent)
        }

        binding.Quiz.setOnClickListener {
            Toast.makeText(this, "quiz", Toast.LENGTH_SHORT).show()
            val intent= Intent(this, Subject::class.java)
            //intent.putExtra("homepagedata","Quiz")
            startActivity(intent)
        }

        binding.Tricks.setOnClickListener {
            Toast.makeText(this, "trick", Toast.LENGTH_SHORT).show()
            val intent= Intent(this, Subject::class.java)
           // intent.putExtra("homepagedata","Trick")
            startActivity(intent)
        }
    }
}