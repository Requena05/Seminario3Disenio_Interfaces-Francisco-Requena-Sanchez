package com.example.seminario3disenio_interfaces_francisco_requena_sanchez

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class Ejercicio06Activity : AppCompatActivity() {
    private lateinit var intrducir: AppCompatButton
    private lateinit var iniciaractividad: AppCompatButton
    private lateinit var cadena: TextInputEditText
    var lista = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio06)
        intrducir = findViewById(R.id.datoslista)
        iniciaractividad = findViewById(R.id.iniciaractividad)
        cadena = findViewById(R.id.cadena)
        intrducir.setOnClickListener {
            lista.add(cadena.text.toString())
            cadena.text?.clear()
        }
        iniciaractividad.setOnClickListener {
            val intent = Intent(this, Ejercicio06RecibirActivity::class.java)
            intent.putExtra("lista", lista)
            startActivity(intent)
        }

    }
}