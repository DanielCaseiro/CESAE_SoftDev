package FichaPratica04;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero1, numero2, i;
        numero1 = 101;
        numero2 = -1;
        i = 0;


        // Ler o numero do jogador 1
        while (numero1 > 100 || numero1 < 0){
            System.out.print("Jogador 1 - Insira um número de 0 a 100: ");
            numero1 = input.nextInt();
        }

        // Ler o numero do jogador 2
        while (numero2 != numero1) {
            System.out.print("Jogador 2 - Adivinhe o numero do jogador 1: ");
            numero2 = input.nextInt();
            if (numero2 > numero1) {
                System.out.println("O numero que você escolheu é maior que o numero do jogador 1");
            } else {
                System.out.println("O numero que você escolheu é menor que o numero do jogador 1");
            }
        }

        // Apresentar a mensagem de fim de jogo
        System.out.println("Parabéns!");
        System.out.println("O numero secreto era: " + numero1);
        System.out.print("Você acertou o numero do jogador 1!");

    }
}
