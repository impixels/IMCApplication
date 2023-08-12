package com.example.imcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class ActivityResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvResult = findViewById<TextView>(R.id.textview_Result)

        val tvClassificacao = findViewById<TextView>(R.id.textview_classificacao)

        val result = intent.getFloatExtra("extra_result", 0.1f)

        tvResult.text = result.toString()

        val classificacao = if (result < 18.5f){
            "Abaixo do Peso"
        } else if (result in 18.5f..24.9f){
            "Normal"
        } else if (result in 25f..29.9f){
            "Sobrepeso"
        } else if (result >= 30f && result <= 39.9){
            "Obesidade"
        } else {
            "Obesidade Grave"
        }


        tvClassificacao.text = getString(R.string.message_classificacao, classificacao)

    }
}