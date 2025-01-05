package com.example.nutriapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class User : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user)
        val paciente = findViewById(R.id.paciente) as Button

        paciente.setOnClickListener{
         val trocaTela = Intent(this, Login::class.java)
         startActivity(trocaTela)
        }

    }
}