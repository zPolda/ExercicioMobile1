package com.example.loginaplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PrimeiraTela : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onMatch(view: View) {


        val textId = findViewById<EditText>(R.id.editTextUser)
        val textPsw = findViewById<EditText>(R.id.editTextPsw)

        val loginDesejado = "lucas"
        val senhaDesejada = "123"

        if(textId.text.toString() == loginDesejado && textPsw.text.toString() == senhaDesejada){
            Toast.makeText(this, "Login com Sucesso", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SegundaTela::class.java)
            startActivity(intent)

            limparCampos();

        }else{
            Toast.makeText(this, "Falhou ao Logar", Toast.LENGTH_SHORT).show()
        }

    }
    private fun limparCampos() {
        val textId = findViewById<EditText>(R.id.editTextUser)
        val textPsw = findViewById<EditText>(R.id.editTextPsw)


        textId.text.clear() // Limpa o campo de login
        textPsw.text.clear() // Limpa o campo de senha
    }
}