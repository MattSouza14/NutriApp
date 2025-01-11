package com.example.nutriapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.nutriapp.Telas_home.Home_Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomePage_Paciente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page_paciente)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.conteudo,Home_Fragment())
            .commit()
    }
}