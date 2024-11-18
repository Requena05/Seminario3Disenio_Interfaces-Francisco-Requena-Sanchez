package com.example.seminario3disenio_interfaces_francisco_requena_sanchez

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ejercicio04Activity : AppCompatActivity() {
    private lateinit var casilla1: ImageView
    private lateinit var casilla2: ImageView
    private lateinit var casilla3: ImageView
    private lateinit var casilla4: ImageView
    private lateinit var casilla5: ImageView
    private lateinit var casilla6: ImageView
    private lateinit var casilla7: ImageView
    private lateinit var casilla8: ImageView
    private lateinit var casilla9: ImageView
    private lateinit var Victoria: ImageView
    private lateinit var Derrota: ImageView
    val Tablero = arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0)
    var random = (0..8).random()
    var terminar=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio04)
        casilla1 = findViewById(R.id.casilla1)
        casilla2 = findViewById(R.id.casilla2)
        casilla3 = findViewById(R.id.casilla3)
        casilla4 = findViewById(R.id.casilla4)
        casilla5 = findViewById(R.id.casilla5)
        casilla6 = findViewById(R.id.casilla6)
        casilla7 = findViewById(R.id.casilla7)
        casilla8 = findViewById(R.id.casilla8)
        casilla9 = findViewById(R.id.casilla9)
        Victoria = findViewById(R.id.victoria)
        Derrota = findViewById(R.id.derrota)

//Parte de animacion de las casillas para el jugador

        casilla1.setOnClickListener {
            if(Tablero[0]!=1 && Tablero[0]!=2) {
                flipCard(casilla1)
                Tablero[0] = 1
                checktablero()
                checkvictoria()
            }

        }



        casilla2.setOnClickListener {

            if(Tablero[1]!=1 && Tablero[1]!=2) {
                flipCard(casilla2)
                Tablero[1] = 1
                checktablero()
                checkvictoria()
            }
        }



        casilla3.setOnClickListener {
            if(Tablero[2]!=1 && Tablero[2]!=2) {
                flipCard(casilla3)
                Tablero[2] = 1
                checktablero()
                checkvictoria()
            }
        }



        casilla4.setOnClickListener {
            if(Tablero[3]!=1 && Tablero[3]!=2) {
                flipCard(casilla4)
                Tablero[3] = 1
                checktablero()
                checkvictoria()
            }
        }



        casilla5.setOnClickListener {
            if(Tablero[4]!=1 && Tablero[4]!=2) {
                flipCard(casilla5)
                Tablero[4] = 1
                checktablero()
                checkvictoria()
            }
        }


        casilla6.setOnClickListener {
            if(Tablero[5]!=1 && Tablero[5]!=2) {
                flipCard(casilla6)
                Tablero[5] = 1
                checktablero()
                checkvictoria()
            }
        }



        casilla7.setOnClickListener {
            if(Tablero[6]!=1 && Tablero[6]!=2) {
                flipCard(casilla7)
                Tablero[6] = 1
                checktablero()
                checkvictoria()
            }
        }



        casilla8.setOnClickListener {
            if(Tablero[7]!=1 && Tablero[7]!=2) {
                flipCard(casilla8)
                Tablero[7] = 1
                checktablero()
                checkvictoria()
            }
        }



        casilla9.setOnClickListener {
            if(Tablero[8]!=1 && Tablero[8]!=2) {
                flipCard(casilla9)
                Tablero[8] = 1
                checktablero()
                checkvictoria()
            }


        }


    }


    private fun flipCard(card: ImageView) {
        if (card.rotationY == 0f) {
            card.animate().rotationY(180F).setDuration(500).start()
            card.setImageResource(R.drawable.x)
            card.scaleType = ImageView.ScaleType.FIT_XY


        }

    }

    private fun flipCard3(card: ImageView) {
        if (card.rotationY == 0f) {
            card.animate().rotationY(180F).setDuration(500).start()
            card.setImageResource(R.drawable.circulo)
            card.scaleType = ImageView.ScaleType.FIT_XY
        }

    }

    fun checktablero() {
        var vuelta=false
        var auxrandom = random
        while(!vuelta || terminar) {
            if (random == 0) {
                if (Tablero[random] != 1 && Tablero[random] != 2) {
                    flipCard3(casilla1)
                    Tablero[random] = 2
                    vuelta=true
                }else {
                    random = (0..8).random()

                }
            }
            if (random == 1) {
                if (Tablero[random] != 1 && Tablero[random] != 2) {
                    flipCard3(casilla2)
                    Tablero[random] = 2
                    vuelta=true
                }else {
                    random = (0..8).random()

                }
            }
            if (random == 2) {
                if (Tablero[random]!= 1 && Tablero[random]!= 2) {
                    flipCard3(casilla3)
                    Tablero[random] = 2
                    vuelta=true
                }else {
                    random = (0..8).random()

                }
            }
            if (random == 3) {
                if (Tablero[random]!= 1 && Tablero[random]!= 2) {
                    flipCard3(casilla4)
                    Tablero[random] = 2
                    vuelta=true
                }else {
                    random = (0..8).random()

                }
            }
            if (random == 4) {
                if (Tablero[random]!= 1 && Tablero[random]!= 2) {
                    flipCard3(casilla5)
                    Tablero[random] = 2
                    vuelta=true
                }else {
                    random = (0..8).random()

                }
            }
            if (random == 5) {
                if (Tablero[random] != 1 && Tablero[random] != 2) {
                    flipCard3(casilla6)
                    Tablero[random] = 2
                    vuelta=true
                }else {
                    random = (0..8).random()

                }
            }
            if (random == 6) {
                if (Tablero[random] != 1 && Tablero[random] != 2) {
                    flipCard3(casilla7)
                    Tablero[random] = 2
                    vuelta=true
                }else {
                    random = (0..8).random()

                }
            }
            if (random == 7) {
                if (Tablero[random] != 1 && Tablero[random] != 2) {
                    flipCard3(casilla8)
                    Tablero[random] = 2
                    vuelta=true
                }else {
                    random = (0..8).random()

                }
            }
            if (random == 8) {
                if (Tablero[random] != 1 && Tablero[random] != 2) {
                    flipCard3(casilla9)
                    Tablero[random] = 2
                    vuelta=true
                }else {
                    random = (0..8).random()

                }
            }
        }
    }





    fun checkvictoria() {

        if (Tablero[0] == 1 && Tablero[1] == 1 && Tablero[2] == 1) {
            Victoria.visibility = View.VISIBLE
            terminar=true
        }
        if (Tablero[0] == 2 && Tablero[1] == 2 && Tablero[2] == 2) {
            Derrota.visibility = View.VISIBLE
            terminar=true
        }


        if (Tablero[3] == 1 && Tablero[4] == 1 && Tablero[5] == 1) {
            Victoria.visibility = View.VISIBLE
            terminar=true
        }

        if (Tablero[3] == 2 && Tablero[4] == 2 && Tablero[5] == 2) {
            Derrota.visibility = View.VISIBLE
            terminar=true
        }


        if (Tablero[6] == 1 && Tablero[7] == 1 && Tablero[8] == 1) {
            Victoria.visibility = View.VISIBLE
            terminar=true
        }

        if (Tablero[6] == 2 && Tablero[7] == 2 && Tablero[8] == 2) {
            Derrota.visibility = View.VISIBLE
            terminar=true
        }

        //Hasta aqui todo bien

        if (Tablero[0] == 1 && Tablero[3] == 1 && Tablero[6] == 1) {
            Victoria.visibility = View.VISIBLE
            terminar=true
        }

        if (Tablero[0] == 2 && Tablero[3] == 2 && Tablero[6] == 2) {
            Derrota.visibility = View.VISIBLE
            terminar=true
        }


        if (Tablero[1] == 1 && Tablero[4] == 1 && Tablero[7] == 1) {
            Victoria.visibility = View.VISIBLE
            terminar=true
        }
        if (Tablero[1] == 2 && Tablero[4] == 2 && Tablero[7] == 2) {
            Derrota.visibility = View.VISIBLE
            terminar=true
        }

        if (Tablero[0] == 1 && Tablero[4] == 1 && Tablero[8] == 1) {
            Victoria.visibility = View.VISIBLE
            terminar=true
        }
        if (Tablero[0] == 2 && Tablero[4] == 2 && Tablero[8] == 2) {
            Derrota.visibility = View.VISIBLE
            terminar=true
        }

        if (Tablero[2] == 1 && Tablero[4] == 1 && Tablero[6] == 1) {
            Victoria.visibility = View.VISIBLE
            terminar=true
        }
        if (Tablero[2] == 2 && Tablero[4] == 2 && Tablero[6] == 2) {
            Derrota.visibility = View.VISIBLE
            terminar=true
        }
        if(Tablero[2]==1 && Tablero[5]==1 && Tablero[8]==1){
            Victoria.visibility = View.VISIBLE
            terminar=true
        }
        if(Tablero[2]==2 && Tablero[5]==2 && Tablero[8]==2){
            Derrota.visibility = View.VISIBLE
            terminar=true
        }
    }



}