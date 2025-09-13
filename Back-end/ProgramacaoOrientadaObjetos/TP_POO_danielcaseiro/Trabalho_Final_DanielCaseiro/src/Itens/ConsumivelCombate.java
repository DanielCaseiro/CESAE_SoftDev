package Itens;

import java.util.ArrayList;

public class ConsumivelCombate extends Consumivel{
    // Atributos
    private int ataqueInstantaneo;

    // Construtor
    public ConsumivelCombate(String nome, int preco, int ataqueInstantaneo) {
        super(nome, preco);
        this.ataqueInstantaneo = ataqueInstantaneo;
    }

    // getters
    public int getAtaqueInstantaneo() {
        return ataqueInstantaneo;
    }

    // Metodo Exibir Detalhes
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(" | classe de item: Consumível de Combate");
        System.out.println(" | dano em combate: " + this.ataqueInstantaneo);
    }

    // Metodo...

}
