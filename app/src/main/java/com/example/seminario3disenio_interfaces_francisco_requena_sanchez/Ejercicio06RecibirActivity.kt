package com.example.seminario3disenio_interfaces_francisco_requena_sanchez

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ejercicio06RecibirActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio06_recibir)
        val lista = intent.getStringArrayListExtra("lista")
        val textView = findViewById<TextView>(R.id.contenidocadenas)
        textView.text = lista.toString()



    }
}