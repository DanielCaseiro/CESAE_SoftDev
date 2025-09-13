package com.example.tp_listacompras_danielcaseiro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tp_listacompras_danielcaseiro.databinding.ActivitySobreBinding

class SobreActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySobreBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.buttonVoltar.setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }



    }
}