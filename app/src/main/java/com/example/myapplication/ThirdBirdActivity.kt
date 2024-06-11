package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBirdBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnprev2.setOnClickListener {
            finish()
        }
        binding.btnnext2.setOnClickListener {
            val intent = Intent(this,fourth_bird::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://plus.unsplash.com/premium_photo-1666370195971-127a185d0491?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8c21hbGwlMjBiaXJkJTIwaW1hZ2V8ZW58MHx8MHx8fDA%3D").into(binding.imageView9)

    }
}