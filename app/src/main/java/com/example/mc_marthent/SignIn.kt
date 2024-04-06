package com.example.mc_marthent

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mc_marthent.databinding.ActivityMainBinding
import com.example.mc_marthent.databinding.ActivitySignInBinding

class SignIn : AppCompatActivity() {

    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sign_in)

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.singin.setOnClickListener {
            val bacaan = Intent(this, Bacaan::class.java)
            startActivity(bacaan)
        }

        binding.singup.setOnClickListener {
            val signup = Intent(this, SignUp::class.java)
            startActivity(signup)
        }

    }
}