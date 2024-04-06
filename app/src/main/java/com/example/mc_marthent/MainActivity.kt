package com.example.mc_marthent

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mc_marthent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainsingup.setOnClickListener {
            val signup = Intent(this, SignUp::class.java)
            startActivity(signup)
        }

        binding.mainsignin.setOnClickListener {
            val signin = Intent(this, SignIn::class.java)
            startActivity(signin)
        }

    }
}