package com.example.meaverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import java.io.ObjectInputStream

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //test
    }

    fun convertValue(view: View) {
        val editValue = findViewById<EditText>(R.id.editTextNumberDecimal)
        val testValue = editValue.text.toString()
        val toConvert: Double? = testValue.toDouble()
        val radioSelectedInFt = findViewById<RadioButton>(R.id.radioButtonInFt)
        val radioSelectedFtIn = findViewById<RadioButton>(R.id.radioButtonFtIn)


        if (radioSelectedInFt.isChecked) {
            val newConvert = toConvert?.div(12)
            val finalResultInFt = newConvert.toString()
            val textView = findViewById<TextView>(R.id.textView).apply {
                text = finalResultInFt + "ft"
            }
        }

        if (radioSelectedFtIn.isChecked) {
            val newConvert = toConvert?.times(12)
            val finalResultFtIn = newConvert.toString()
            val textView = findViewById<TextView>(R.id.textView).apply {
                text = finalResultFtIn + "in"
            }
        }
    }
}


