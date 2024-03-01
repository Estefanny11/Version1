package com.example.version1
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

import com.example.version1.databinding.ActivityEntradaBinding

class EntradaActivity : AppCompatActivity() {

    private lateinit var bindingEntrada: ActivityEntradaBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingEntrada = ActivityEntradaBinding.inflate(layoutInflater)
        setContentView(bindingEntrada.root)

        // Inicializar SharedPreferences
        sharedPreferences = getSharedPreferences("PREFERENCES", MODE_PRIVATE)

        bindingEntrada.btnEntrar.setOnClickListener {
            // Marcar que el usuario ha pasado por EntradaActivity
            val editor = sharedPreferences.edit()
            editor.putBoolean("hasVisitedEntrada", true)
            editor.apply()

            // Ir a MainActivity
            startActivity(MainActivity.newIntent(this))
            finish() // Para cerrar esta actividad y evitar volver a ella con el botón "Atrás"
        }
        val btnRecuperar: Button = findViewById(R.id.btnrecuperarcontra)
        btnRecuperar.setOnClickListener {

            val intent: Intent = Intent(this, RecuperarActivity::class.java)
            startActivity(intent)}


        val btn: Button = findViewById(R.id.btnregistrar)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, RegistrarActivity::class.java)
            startActivity(intent)
        }




    }

}



