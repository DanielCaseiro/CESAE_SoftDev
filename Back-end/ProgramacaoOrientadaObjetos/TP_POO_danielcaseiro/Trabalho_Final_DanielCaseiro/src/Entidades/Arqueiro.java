package Entidades;

import Itens.Consumivel;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Arqueiro extends Heroi {

    // Atributos

    // Construtor
    public Arqueiro(String nome, int maxHP, int forca, int ouro) {
        super(nome, maxHP, forca, ouro);
    }

    // Metodo atacar

    /**
     *  Metodo que gerencia o combate do jogo. É diferente para cada subclasse de Heroi. Também é este metodo que chama indiretamente o metodo fimDeJogo quando o Heroi derrota o Final Boss.
     * @param inimigo É o objeto NPC que está sendo atacado em combate pelo Heroi
     * @return retorna verdadeiro se o heroi ganha o combate e falso se perde
     * @throws FileNotFoundException Caso a mensagem de fim de jogo não seja encontrada (mensagem exibida quando se derrota o Final Boss)
     */
    public boolean atacar(NPC inimigo) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        boolean especial = false;

        while (this.hp > 0 && inimigo.getHp() > 0) {
            System.out.println(" ");
            System.out.println("--------------- Opções de Combate ---------------");
            System.out.println("1. Atacar");
            System.out.println("2. Usar ataque especial");
            System.out.println("3. Usar item consumível de combate");

            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            int dano;
            boolean critico = false;

            switch (opcao) {
                case 1:
                    dano = this.forca + this.armaPrincipal.getAtaque();
                    // arqueiros tem uma chance de causar um ataque crítico (acertar a flecha em um ponto fraco)
                    Random r = new Random();
                    double chance = r.nextInt(1,10) + (this.nivel/5);
                    if(chance >= 10) {
                        dano *= 2;
                        critico = true;
                    }
                    inimigo.setHp(inimigo.getHp() - dano);
                    if(critico) {
                        System.out.println(" ");
                        System.out.println("Tiro certeiro! Dano causado: " + dano);
                        critico = false;
                    } else {
                        System.out.println(" ");
                        System.out.println("Dano causado: " + dano);
                    }

                    break;

                case 2:
                    if (!especial) {
                        dano = this.forca + this.armaPrincipal.getAtaqueEspecial();
                        inimigo.setHp(inimigo.getHp() - dano);
                        System.out.println(" ");
                        System.out.println("Dano causado: " + dano);
                        especial = true;
                    }
                    break;

                case 3:
                    usarConsumivelCombate(inimigo);
                    break;
            }
            // Turno do inimigo
            if(inimigo.getHp() > 0) {
                System.out.println(" ");
                System.out.println("O inimigo " + inimigo.getNome() + " atacou!");
                int danoInimigo = (int) Math.round(inimigo.getForca() * 1.1); // Usar math.round para arredondar o dano e usar o casting explícito para (int)
                this.hp -= danoInimigo;
                System.out.println("Seu herói sofreu " + danoInimigo + " pontos de dano! Está agora com " + this.hp + " pontos de vida.");
            }

        }

        return resultadoCombate(inimigo);

    }

}
