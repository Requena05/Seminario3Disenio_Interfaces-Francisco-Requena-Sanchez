package com.example.seminario3disenio_interfaces_francisco_requena_sanchez

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.ScrollView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class VistaAMiGustoActivity : AppCompatActivity() {
    private lateinit var boton: Button
    private lateinit var boton2:Button
    private lateinit var ejercicio1: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_vista_ami_gusto)
        boton = findViewById(R.id.MostrarEjercicios)
        boton2 = findViewById(R.id.OcultarEjercicios)
        boton.setOnClickListener {
            val layout = findViewById<ScrollView>(R.id.ElegirEjercicios)
            layout.visibility = View.VISIBLE

        }
        boton2.setOnClickListener {
            val layout = findViewById<ScrollView>(R.id.ElegirEjercicios)
            layout.visibility = View.INVISIBLE

        }
        ejercicio1 = findViewById(R.id.Ejercicio1)
        ejercicio1.setOnClickListener {
            val intent = Intent(this, Maquetacion01Activity::class.java)
            startActivity(intent)

        }

    }
}