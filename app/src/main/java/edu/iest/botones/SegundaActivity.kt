package edu.iest.botones

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView

class SegundaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    private var cambioIcono: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        var fraseRecibida = intent.getStringExtra("frase")
        var edad = intent.getIntExtra("edad",0)

        Log.d("DATOS","Datos recibidos con exito fueron frase $fraseRecibida y edad $edad")

        var ivlogo = findViewById<ImageView>(R.id.ivLogo)
        ivlogo.setOnClickListener{
            var arregloImagen = arrayOf(R.drawable.anahuac, R.drawable.logo)
            if (cambioIcono){
                ivlogo.setImageResource(arregloImagen[0])
            }else{
                ivlogo.setImageResource(arregloImagen[1])
            }
            cambioIcono =! cambioIcono
        }

        var bnAbrirPantalla = findViewById<Button>(R.id.bn_Pantalla)
        bnAbrirPantalla.setOnClickListener{
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }

        var bnCerrar = findViewById<Button>(R.id.bn_Pantalla2)
        bnCerrar.setOnClickListener {
            finish()
        }

    }
}