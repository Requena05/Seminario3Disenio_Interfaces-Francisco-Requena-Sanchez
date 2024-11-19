package com.example.seminario3disenio_interfaces_francisco_requena_sanchez

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ejercicio05Activity : AppCompatActivity() {

    private lateinit var introducirdatos: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio05)

        introducirdatos=findViewById(R.id.introducirdatos)

        introducirdatos.setOnClickListener {
            //Acción al pulsar el botón inicia la actividad Ejercicio05RecibirActivity
            val intent = Intent(this, Ejercicio05RecibirActivity::class.java)
            val numero = findViewById<EditText>(R.id.numero)
            val nombre = findViewById<EditText>(R.id.nombre)
            intent.putExtra("numero", numero.text.toString())
            intent.putExtra("nombre", nombre.text.toString())
            startActivity(intent)

        }

    }
}