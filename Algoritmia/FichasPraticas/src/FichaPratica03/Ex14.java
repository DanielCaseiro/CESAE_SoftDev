package FichaPratica03;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int sequencia, numero1, numero2, i;
        boolean crescente;
        sequencia = 1;
        i=1;
        crescente = true;


        // Leitura do tamanho da sequencia
        while (sequencia < 2) {
            System.out.print("Quantos numeros deseja inserir: ");
            sequencia = input.nextInt();
        }


        // Leitura do primeiro numero
        System.out.print("Insira um numero: ");
        numero1 = input.nextInt();

        // Leitura dos outros numeros
        while (i < sequencia) {
            System.out.print("Insira um numero: ");
            numero2 = input.nextInt();
            if (numero2 < numero1) {
                crescente = false;
            }
            numero1 = numero2;
            i++;
        }

        if (crescente) {
            System.out.print("A sequência é crescente");
        } else {
            System.out.print("A sequência não é crescente");
        }

        /*

         Minha solução sem boolean:

         // Leitura dos outros numeros
        while (i < sequencia) {
            System.out.print("Insira um numero: ");
            numero2 = input.nextInt();
            if (numero2 > numero1) {
                crescente++;
            } else {
                crescente--;
            }
            numero1 = numero2;
            i++;
        }

        if (crescente == i) {
            System.out.print("A sequência é crescente");
        } else {
            System.out.print("A sequência não é crescente");
        }


         */






    }

}
