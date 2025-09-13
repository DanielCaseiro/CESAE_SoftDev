package Itens;

import java.util.ArrayList;

public class Pocao extends Consumivel {

    // Atributos
    private int vidaCurar;
    private int aumentoForca;

    // Construtor
    public Pocao(String nome, int preco, int vidaCurar, int aumentoForca) {
        super(nome, preco);
        this.vidaCurar = vidaCurar;
        this.aumentoForca = aumentoForca;
    }

    // getters
    public int getVidaCurar() {
        return vidaCurar;
    }

    public int getAumentoForca() {
        return aumentoForca;
    }


    // Metodo Exibir Detalhes
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(" | classe de item: Poção");
        System.out.println(" | vida a curar: " + this.vidaCurar);
        System.out.println(" | aumento de força: " + this.aumentoForca);
    }


}
