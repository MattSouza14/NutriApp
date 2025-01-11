package com.example.nutriapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_paciente)

        val telaLogin = findViewById(R.id.entrar) as Button

        telaLogin.setOnClickListener{
            val trocaTela = Intent(this, HomePage_Paciente::class.java)
            startActivity(trocaTela)
        }
    }
}