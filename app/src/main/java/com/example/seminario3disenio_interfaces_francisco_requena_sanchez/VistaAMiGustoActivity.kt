package com.example.seminario3disenio_interfaces_francisco_requena_sanchez

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class VistaAMiGustoActivity : AppCompatActivity() {
    private lateinit var boton: Button
    private lateinit var boton2:Button
    private lateinit var ejercicio1: ImageButton
    private lateinit var ejercicio2: ImageButton
    private lateinit var ejercicio3: ImageButton
    private lateinit var ejercicio4: ImageButton
    private lateinit var ejercicio5: ImageButton
    private lateinit var boton3: Button
    private lateinit var contenido: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_vista_ami_gusto)
        boton = findViewById(R.id.MostrarEjercicios)
        boton2 = findViewById(R.id.OcultarEjercicios)
        ejercicio2 = findViewById(R.id.Ejercicio2)
        boton3 = findViewById(R.id.BorrarBuscador)
        contenido = findViewById(R.id.Contenido)
        ejercicio3 = findViewById(R.id.Ejercicio3)
        ejercicio4 = findViewById(R.id.Ejercicio4)
        ejercicio5 = findViewById(R.id.Ejercicio5)




        boton.setOnClickListener {
            val layout = findViewById<ScrollView>(R.id.ElegirEjercicios)
            layout.visibility = View.VISIBLE
            contenido.visibility = View.VISIBLE
        }
        boton2.setOnClickListener {
            val layout = findViewById<ScrollView>(R.id.ElegirEjercicios)
            layout.visibility = View.INVISIBLE
            contenido.visibility = View.GONE

        }
        ejercicio1 = findViewById(R.id.Ejercicio1)
        boton3.setOnClickListener {
            //Haz que cuando se pulse el boton se borre solo el texto del buscador
            val layout = findViewById<TextInputEditText>(R.id.introducirBusca)
            layout.text = null
        }


        ejercicio2.setOnClickListener {
            val intent = Intent(this, Maquetacion02Activity::class.java)
            startActivity(intent)


        }
        ejercicio1.setOnClickListener {
            val intent = Intent(this, Maquetacion01Activity::class.java)
            startActivity(intent)

        }
        ejercicio3.setOnClickListener {
            val intent = Intent(this, Maquetacion03Activity::class.java)
            startActivity(intent)
        }
        ejercicio4.setOnClickListener {
            val intent = Intent(this, Ejercicio04Activity::class.java)
            startActivity(intent)
        }
        ejercicio5.setOnClickListener {
            val intent = Intent(this, Ejercicio05Activity::class.java)
            startActivity(intent)
        }

    }
}