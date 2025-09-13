package com.example.tp_listacompras_danielcaseiro

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tp_listacompras_danielcaseiro.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Array list de utilizadores
        val arrayUsers=ArrayList<Utilizador>()

        arrayUsers.add(Utilizador ("admin", "pass","Daniel", 1987))
        arrayUsers.add(Utilizador ("kotlin", "kotlin2025","Joaquim", 2001))
        arrayUsers.add(Utilizador ("splashScreen", "123456","Maria", 2005))
        arrayUsers.add(Utilizador ("gradle", "7891011","João", 1992))
        arrayUsers.add(Utilizador ("androidManifest", "pass001","Martim", 1985))
        arrayUsers.add(Utilizador ("drawable", "passPass","Ana", 2010))



        // evento clicar no botão
        binding.buttonEntrar.setOnClickListener {

            // ler o username e a password
            var username = binding.editUsername.text.toString()
            var password = binding.editPassword.text.toString()

            // Booleano para modular a mensagem/toast caso o login falhe
            var utilizadorEncontrado = false
            var loginValido = false

            // Iterar o array de Utilizadores
            for (user in arrayUsers) {

                // Checar se o username e password fornecidos são iguais aos atributos de algum dos objetos Utilizador
                if(username.equals(user.username) && password.equals(user.password)){

                    // Em caso positivo, exibir toast de login válido, limpar os editText e passar o usuário para a MainActivity
                    Toast.makeText(applicationContext, "Login válido!", Toast.LENGTH_SHORT).show()

                    binding.editUsername.setText("")
                    binding.editPassword.setText("")

                    loginValido = true

                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)

                } else {

                    // Em caso de login negativo, checar se errou o username ou a password e exibir o toast correspondente

                    if(username.equals(user.username)) {
                        utilizadorEncontrado = true
                    }

                }

            }

            if(utilizadorEncontrado && !loginValido) {
                Toast.makeText(applicationContext, "Password inválida.", Toast.LENGTH_SHORT).show()
                binding.editPassword.setText("")
            }

            if(!utilizadorEncontrado && !loginValido) {

                Toast.makeText(applicationContext, "Username inválido.", Toast.LENGTH_SHORT).show()
                binding.editUsername.setText("")
                binding.editPassword.setText("")

            }

        }

        binding.buttonSobre.setOnClickListener {

            val intent = Intent(this, SobreActivity::class.java)
            startActivity(intent)

        }






    }
}