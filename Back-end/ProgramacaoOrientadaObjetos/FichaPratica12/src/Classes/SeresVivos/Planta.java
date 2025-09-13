package Classes.SeresVivos;

import Enumeracoes.Familia;

public class Planta extends SerVivo {
    private Familia familia;
    private int grauDefesa; // Grau de Defesa (0 - 5)
    // sendo 0 a inexistência de um mecanismo de defesa e 5 como defesa muito boa.

    // Construtor
    public Planta(String nome, String especie, String pais, int idade, Familia familia, int grauDefesa) {
        super(nome, especie, pais, idade);
        this.familia = familia;
        this.grauDefesa = grauDefesa;


        if (grauDefesa < 0 || grauDefesa > 5) {
            throw new IllegalArgumentException("O grau de defesa deve ser um valor entre 0 e 5");
        }

    }

    // Acesso

    // get
    public Familia getFamilia() {
        return familia;
    }

    public int getGrauDefesa() {
        return grauDefesa;
    }

    // Exibir Detalhes
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println(" | familia: " + this.familia +
                " | grau de defesa: " + this.grauDefesa
        );
        System.out.println(" ");

    }


    // Metodo...
}
