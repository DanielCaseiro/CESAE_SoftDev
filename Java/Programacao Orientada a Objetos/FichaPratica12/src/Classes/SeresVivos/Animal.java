package Classes.SeresVivos;

import Enumeracoes.AlimentacaoDieta;

public class Animal extends SerVivo{
    // Atributos
    // Boolean fome
    //o Double Peso (peso em Kg.)
    //o Double inteligência (0 - 100)
    //o Alimentacao dieta (Carnívoro, Herbívoro, Omnívoro)
    //o String barulho

    private boolean fome;
    private double pesoKg;
    private double inteligencia;
    private AlimentacaoDieta alimentacaoDieta;
    private String barulho;

    // Construtor

    public Animal(String nome, String especie, String pais, int idade, double pesoKg, double inteligencia, AlimentacaoDieta alimentacaoDieta, String barulho) {
        super(nome, especie, pais, idade);
        this.pesoKg = pesoKg;
        this.inteligencia = inteligencia;
        this.alimentacaoDieta = alimentacaoDieta;
        this.barulho = barulho;

        if (inteligencia < 0 || inteligencia > 100) {
            throw new IllegalArgumentException("A inteligência deve ser um valor entre 0 e 100");
        }
    }


    // Exibir Detalhes
    @Override
    public void exibirDetalhes(){
        this.exibirDetalhes();
        System.out.println(" | fome: " + this.fome +
                " | peso Kg: " + this.pesoKg +
                " | inteligência: " + this.inteligencia +
                " | alimentação/dieta: " + this.alimentacaoDieta +
                " | barulho: " + this.barulho
        );
        System.out.println(" ");
    }


    // Metodo...
}
