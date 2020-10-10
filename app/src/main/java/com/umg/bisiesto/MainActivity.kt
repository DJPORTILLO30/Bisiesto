package com.umg.bisiesto

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var year : TextView? = null
    private var res : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        year = findViewById(R.id.year)
        res = findViewById(R.id.res)
    }

    fun verificar(view: View){
        val y = year?.text.toString().toInt()
        if (y.rem(4).equals(0)){
            res?.setText("Es bisiesto")
            res?.setTextColor(Color.GREEN)
        }else{
            res?.setText("No es bisiesto")
            res?.setTextColor(Color.RED)
        }
    }
}