package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityFifthBirdBinding
import com.example.myapplication.databinding.ActivityFourthBirdBinding
import com.squareup.picasso.Picasso

class fifth_bird : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBirdBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnprev4.setOnClickListener {
            finish()
        }
        Picasso.get().load("https://plus.unsplash.com/premium_photo-1664304400765-8b92eba29405?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTd8fHNtYWxsJTIwYmlyZCUyMGltYWdlfGVufDB8fDB8fHww").into(binding.imageView12)

    }
}