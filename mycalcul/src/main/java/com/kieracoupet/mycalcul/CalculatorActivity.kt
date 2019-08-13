package com.kieracoupet.mycalcul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.calcul.*

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calcul)
    }

    fun sum(view: View) {
        val x = number1.text.toString().toInt()
        val y = number2.text.toString().toInt()
        val res = x + y
        resultat.text = "resultat : $res"
    }

    fun sub(view: View) {
        val x = number1.text.toString().toInt()
        val y = number2.text.toString().toInt()
        val res = x - y
        resultat.text = "resultat : $res"
    }

    fun multiple(view: View) {
    }

    fun div(view: View) {
    }
}
