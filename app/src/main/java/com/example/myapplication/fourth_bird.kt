package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityFourthBirdBinding
import com.squareup.picasso.Picasso

class fourth_bird : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnprev3.setOnClickListener {
            finish()
        }
        binding.btnnext3.setOnClickListener {
            val intent = Intent(this,fifth_bird::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://images.unsplash.com/photo-1675497219360-270db3f96e06?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8c21hbGwlMjBiaXJkJTIwaW1hZ2V8ZW58MHx8MHx8fDA%3D").into(binding.imageView8)

    }
}