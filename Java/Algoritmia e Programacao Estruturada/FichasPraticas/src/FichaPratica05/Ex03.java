package FichaPratica05;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int [] vetor = new int[10];
        int maiorElemento;

        // Ler valores do vetor

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor [" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        maiorElemento = vetor[0];

        // Encontrar o maior elemento


        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] > maiorElemento) {
                maiorElemento = vetor[j];
            }
        }

        System.out.println("O maior elemento do vetor é " + maiorElemento);

    }
}
