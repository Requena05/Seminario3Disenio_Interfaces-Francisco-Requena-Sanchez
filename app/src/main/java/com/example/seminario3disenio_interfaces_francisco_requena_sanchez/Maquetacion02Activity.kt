package com.example.seminario3disenio_interfaces_francisco_requena_sanchez

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Maquetacion02Activity : AppCompatActivity() {
    private lateinit var botonopcion1: ImageButton
    private lateinit var botonopcion2: ImageButton
    private lateinit var botonopcion3: ImageButton
    private lateinit var botonopcion4: ImageButton
    private lateinit var vertexto: TextView
    private lateinit var vertexto2: TextView
    private lateinit var vertexto3: TextView
    private lateinit var vertexto4: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_maquetacion02)
        botonopcion1 = findViewById(R.id.opcion1)
        botonopcion2 = findViewById(R.id.opcion2)
        botonopcion3 = findViewById(R.id.opcion3)
        botonopcion4 = findViewById(R.id.opcion4)
        vertexto = findViewById(R.id.mensajeopcion1)
        vertexto2 = findViewById(R.id.mensajeopcion2)
        vertexto3 = findViewById(R.id.mensajeopcion3)
        vertexto4 = findViewById(R.id.mensajeopcion4)

        botonopcion1.setOnClickListener {

            if(vertexto.visibility == TextView.VISIBLE){
                vertexto.visibility = TextView.INVISIBLE

            }else{
                vertexto.visibility = TextView.VISIBLE
            }
        }






        botonopcion2.setOnClickListener {

            if(vertexto2.visibility == TextView.VISIBLE){
                vertexto2.visibility = TextView.INVISIBLE

            }else{
                vertexto2.visibility = TextView.VISIBLE
            }
        }

        botonopcion3.setOnClickListener {

            if(vertexto3.visibility == TextView.VISIBLE){
                vertexto3.visibility = TextView.INVISIBLE

            }else{
                vertexto3.visibility = TextView.VISIBLE
            }
        }

        botonopcion4.setOnClickListener {

            if(vertexto4.visibility == TextView.VISIBLE){
                vertexto4.visibility = TextView.INVISIBLE

            }else{
                vertexto4.visibility = TextView.VISIBLE
            }
        }


        }
    }
