package com.example.recifefit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.recifefit.databinding.ActivityMainBinding
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerButton.setOnClickListener {
            val intentsegundatela = Intent(this, Segundatela::class.java)
            startActivity(intentsegundatela)
        }

        val lognome = binding.emailEditText
        val login = binding.passwordEditText
        login.setOnClickListener {
            if (lognome.text.toString() == "arthur") {
                val inten = Intent(this, ListaEventosActivity::class.java)
                val texto = lognome.text.toString()
                inten.putExtra("nome", texto)
                startActivity(inten)
            } else {
                Toast.makeText(this, R.string.msgError, Toast.LENGTH_SHORT).show()
            }

        }
        val lognome1 = binding.emailEditText
        login.setOnClickListener {
            if (lognome1.text.toString() == "admin") {
                val inten = Intent(this, CadastroCorpoMovimento::class.java)
                val texto = lognome1.text.toString()
                inten.putExtra("nome", texto)
                startActivity(inten)


            } else {
                val inten = Intent(this, ListaEventosActivity::class.java)
                startActivity(inten)
            }
        }
        val lognome2 = binding.emailEditText
        login.setOnClickListener {
            if (lognome2.text.toString() == "admin") {
                val inten = Intent(this, CadastroCorpoMovimento::class.java)
                val texto = lognome2.text.toString()
                inten.putExtra("nome", texto)
                startActivity(inten)


            } else {
                val inten = Intent(this, ListaEventosActivity::class.java)
                startActivity(inten)

            }
        }
    }
}