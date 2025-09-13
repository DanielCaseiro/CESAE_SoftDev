package Itens;

import java.util.ArrayList;

public class Arma extends ItemHeroi {

    // Atributos
    private int ataque;
    private int ataqueEspecial;

    // Construtor
    public Arma(String nome, int preco, int ataque, int ataqueEspecial) {
        super(nome, preco);
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
    }

    // getters
    public int getAtaque() {
        return ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    // Metodo Exibir Detalhes
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(" | classe de item: Arma");
        System.out.println(" | bonus de ataque: " + this.ataque);
        System.out.println(" | bonus de ataque especial: " + this.ataqueEspecial);
    }

    // Metodo...

}
