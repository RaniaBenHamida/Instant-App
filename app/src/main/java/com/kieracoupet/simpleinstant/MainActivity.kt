package com.kieracoupet.simpleinstant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kieracoupet.mycalcul.CalculatorActivity
import com.kieracoupet.simpleinstant.app.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun change (view: View){
        val intent = Intent(this, CalculatorActivity::class.java)
        startActivity(intent)
    }
}
