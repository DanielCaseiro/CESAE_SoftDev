package FichaPratica05;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int [] vetor = new int[10];

        // Ler valores do vetor

        /* for (int i = 0; i < 10; i++) {
            System.out.print("Insira no vetor [" + i + "]: ");
            vetor[i] = input.nextInt();
        } */

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor [" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        // imprimir o vetor

        for (int j = 0; j < vetor.length; j++) {
            System.out.println("O valor do vetor na posição [" + j + "] é " + vetor[j]);
        }

        /* for (int j = 0; j < 10; j++) {
            System.out.println("O valor do vetor na posição [" + j + "] é " + vetor[j]);
        } */

    }

}
