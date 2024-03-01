package com.example.version1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RecuperarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar)

        val btn: Button = findViewById(R.id.btn_volver_inicio)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, EntradaActivity::class.java)
            startActivity(intent)}
    }
}