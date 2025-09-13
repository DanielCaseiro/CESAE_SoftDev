package com.example.tp_listacompras_danielcaseiro

import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.tp_listacompras_danielcaseiro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Criar o array list de produtos com indice vazio
        val arrayListProdutosSemIndice = ArrayList<String>()

        // Criar o array list de produtos com indice vazio
        val arrayListProdutosComIndice = ArrayList<String>()


        // Criar o adapter
        var arrayAdapterProdutos =
            ArrayAdapter(this, R.layout.simple_list_item_1, arrayListProdutosComIndice)
        binding.listProdutos.adapter = arrayAdapterProdutos



        // Adicionar

        binding.buttonAdicionar.setOnClickListener {

            //Limpa a Lista com índice (para não adicionar duplicados)
            arrayListProdutosComIndice.clear()

            // Ler o produto adicionado pelo utilizador
            var produtoAdicionar = binding.editAdicionar.text.toString().trim()


            // adicionar o produto no array list sem indice e depois no array list com indice
            if (!produtoAdicionar.isNullOrEmpty()) {

                arrayListProdutosSemIndice.add(produtoAdicionar)

                var i = 1
                for(produto in arrayListProdutosSemIndice) {
                    var produtoComIndice = i.toString() + ". " + produto

                    arrayListProdutosComIndice.add(produtoComIndice)

                    i++
                }

                // adicionar o produto à Listview pelo adapter
                arrayAdapterProdutos =
                ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayListProdutosComIndice)
                binding.listProdutos.adapter = arrayAdapterProdutos

            }

            // limpar o edit_text de adicionar produtos
            binding.editAdicionar.setText("")

        }

        // Remover

        binding.buttonRemover.setOnClickListener {

            //Limpa a Lista com índice (para não adicionar duplicados)
            arrayListProdutosComIndice.clear()

            // Ler o índice do produto removido pelo utilizador
            var produtoRemover = binding.editRemover.text.toString().trim()

            // Remover o produto do array list
            if(!produtoRemover.isNullOrEmpty()) {

               var indiceRemover = produtoRemover.toInt() -1

                arrayListProdutosSemIndice.remove(arrayListProdutosSemIndice.get(indiceRemover))

                // Reconstruir a lista com indice

                var i = 1
                for(produto in arrayListProdutosSemIndice) {
                    var produtoComIndice = i.toString() + ". " + produto

                    arrayListProdutosComIndice.add(produtoComIndice)

                    i++
                }

                    // reconstruir a ListView
                    arrayAdapterProdutos =
                        ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayListProdutosComIndice)

                    binding.listProdutos.adapter = arrayAdapterProdutos


            }

            // limpar o edit_text de remover produtos
            binding.editRemover.setText("")

        }

        binding.buttonVoltar.setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }



    }
}