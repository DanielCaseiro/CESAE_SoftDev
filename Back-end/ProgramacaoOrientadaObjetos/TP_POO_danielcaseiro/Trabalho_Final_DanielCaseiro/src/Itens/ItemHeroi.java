package Itens;

import java.util.ArrayList;

public class ItemHeroi {
    // Atributos
    protected String nome;
    protected int preco;
    protected ArrayList<String> heroisPermitidos;

    // Construtor
    public ItemHeroi(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        this.heroisPermitidos = new ArrayList<String>();
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public ArrayList<String> getHeroisPermitidos() {
        return heroisPermitidos;
    }

    // Inserir herói permitido
    public void inserirHeroiPermitido(String novoHeroiPermitido){
        this.heroisPermitidos.add(novoHeroiPermitido);
    }


    // Remover herói permitido
    public void removerHeroiPermitido(String novoHeroiPermitido){
        this.heroisPermitidos.remove(novoHeroiPermitido);
    }

    // Metodo Exibir Detalhes
    public void exibirDetalhes() {
        System.out.println(" ");
        System.out.println("--------------- " + this.nome + " ---------------");
        System.out.println("  | preço: " + this.preco);
        System.out.println(" | heróis que podem usar este item: ");
        for (String classeDeHeroi : this.heroisPermitidos) {
            System.out.println(". " + classeDeHeroi);
        }

        System.out.println(" ");
    }
}
