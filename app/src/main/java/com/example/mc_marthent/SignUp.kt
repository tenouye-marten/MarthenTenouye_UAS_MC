package com.example.mc_marthent

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import com.example.mc_marthent.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sign_up)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.singin.setOnClickListener {
            val signin = Intent(this, SignIn::class.java)
            startActivity(signin)
        }

        binding.singup.setOnClickListener {
            val signup = Intent(this, SignUp::class.java)
            startActivity(signup)
        }
    }
}