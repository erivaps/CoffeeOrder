package com.kotlin.order.coffee.coffeeorder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ordenarTaza(view: View){
        var txtNroTazas: TextView = findViewById<TextView>(R.id.txtNroRazas)

        var resultado :TextView = findViewById<TextView>(R.id.resultado)

        resultado.setText("Usted ordenó ${txtNroRazas.text} taza, pinche cabron.")

    }
}
