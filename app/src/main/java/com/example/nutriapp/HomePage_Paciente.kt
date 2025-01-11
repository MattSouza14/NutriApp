package com.example.nutriapp

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.nutriapp.Telas_home.Home_Fragment
import com.example.nutriapp.Telas_home.Medicos
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomePage_Paciente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page_paciente)
        //inicia a tela com Homepage_Fragment

        //Criação de uma varievel que recebe o principal constraint

        //Criação de uma variavel com Acesso a Barra Inferior
        val bottomNavigation: BottomNavigationView = findViewById(R.id.BarraInferior)

        //Case para a navegação
        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    replaceFragment(Home_Fragment())
                    true
                }
                R.id.nav_search -> {
                    replaceFragment(Medicos())
                    true

                }

            //Uso Futuro, NÃO MEXER AINDA
//               R.id.nav_profile -> {
//                    replaceFragment(ProfileFragment())
//                    true
//                }
                else -> false
            }
        }
        // Carregar o fragmento inicial
        bottomNavigation.selectedItemId = R.id.nav_home
    }
    //Função para troca de Fragments usando a Barra Inferior
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.conteudo, fragment)
            .commit()
    }
}