package edu.iest.botones

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var  tvFrase : TextView
    private lateinit var  etFrase : EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvFrase = findViewById(R.id.textView)
        etFrase = findViewById(R.id.editTextFrase)
        var bnMostrar = findViewById<Button>(R.id.Mostrar)
        bnMostrar.setOnClickListener{
            val frase = etFrase.text.toString()
            Snackbar.make(tvFrase,"Su frase $frase", Snackbar.LENGTH_LONG).show()
        }
        var bnCambiar = findViewById<Button>(R.id.Regresar)
        bnCambiar.setOnClickListener {
            val y = Intent(this,SegundaActivity::class.java)
            y.putExtra("frase", obtenerFrase())
            y.putExtra("edad", 21)
            startActivity(y)
            finish()
        }

    }
    private fun obtenerFrase():String{
        return etFrase.text.toString()
    }


}