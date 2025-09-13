package Entidades;

import Itens.Consumivel;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Feiticeiro extends Heroi {
    // Atributos

    // Construtor
    public Feiticeiro(String nome, int maxHP, int forca, int ouro) {
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
        // Feiticeiros podem utilizar o ataque especial mais vezes
        int especial = 3 + this.nivel/3;

        while (this.hp > 0 && inimigo.getHp() > 0) {
            System.out.println(" ");
            System.out.println("--------------- Opções de Combate ---------------");
            System.out.println("1. Atacar");
            System.out.println("2. Usar ataque especial");
            System.out.println("3. Usar item consumível de combate");

            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            int dano;

            switch (opcao) {
                case 1:
                    // Feiticeiros são mais fracos com ataques normais
                    dano = (int) Math.round((this.forca * 0.5) + this.armaPrincipal.getAtaque());
                    inimigo.setHp(inimigo.getHp() - dano);
                    System.out.println(" ");
                    System.out.println("Dano causado: " + dano);
                    break;

                case 2:
                    if (especial > 0) {
                        dano = this.forca + this.armaPrincipal.getAtaqueEspecial();
                        inimigo.setHp(inimigo.getHp() - dano);
                        System.out.println(" ");
                        System.out.println("Dano causado: " + dano);
                        especial --;
                        break;
                    } else {
                        System.out.println(" ");
                        System.out.print("Não pode mais usar o ataque especial neste combate. escolha outra opção: ");
                        opcao = sc.nextInt();
                    }


                case 3:
                    usarConsumivelCombate(inimigo);
                    break;
            }
            // Turno do inimigo
            if(inimigo.getHp() > 0) {
                System.out.println(" ");
                System.out.println("O inimigo " + inimigo.getNome() + " atacou!");
                int danoInimigo = inimigo.getForca();
                this.hp -= danoInimigo;
                System.out.println("Seu herói sofreu " + danoInimigo + " pontos de dano! Está agora com " + this.hp + " pontos de vida.");
            }

        }

        return resultadoCombate(inimigo);

    }


}
