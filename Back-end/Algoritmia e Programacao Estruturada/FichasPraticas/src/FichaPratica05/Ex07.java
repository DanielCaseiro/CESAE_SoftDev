package FichaPratica05;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int [] vetor = new int[4];
        int maiorElemento;

        // Ler valores do vetor

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um valor na posição [" + i + "] do vetor: ");
            vetor[i] = input.nextInt();
        }


        // Encontrar qualquer valor par no vetor

        maiorElemento = vetor[0];

        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] % 2 == 0) {
                maiorElemento = vetor[j];
            }
        }


        // Encontrar o maior elemento


        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] > maiorElemento && vetor[j] % 2 == 0) {
                maiorElemento = vetor[j];
            }
        }



        // apresentar resultados

        if (maiorElemento % 2 == 0) {
            System.out.println("O maior elemento par do vetor é " + maiorElemento);
        } else {
            System.out.println("Não há elemento par do vetor");
        }


    }
}
