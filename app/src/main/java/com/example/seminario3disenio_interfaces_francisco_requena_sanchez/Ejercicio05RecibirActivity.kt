package com.example.seminario3disenio_interfaces_francisco_requena_sanchez

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ejercicio05RecibirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio05_recibir)
        val numero = intent.getStringExtra("numero")
        val nombre = intent.getStringExtra("nombre")
        val textView = findViewById<TextView>(R.id.verdatos)
        textView.text = "Número: $numero, Nombre: $nombre"

    }
}