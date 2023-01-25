package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    lateinit var text_input_peso : EditText
    lateinit var text_input_altura : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        text_input_altura = findViewById(R.id.text_input_altura)
        text_input_peso = findViewById(R.id.text_input_peso)

        button.setOnClickListener {
            val intent = Intent(this, ResultadoActivity::class.java)
            val peso = text_input_peso.text.toString()
            val altura = text_input_altura.text.toString()

            if (peso.isNotEmpty() && altura.isNotEmpty()){
                intent.putExtra("peso", peso.toDouble())
                intent.putExtra("altura", altura.toDouble())
                startActivity(intent)
            }else{
                Toast.makeText(this@MainActivity, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            }



        }
    }
}