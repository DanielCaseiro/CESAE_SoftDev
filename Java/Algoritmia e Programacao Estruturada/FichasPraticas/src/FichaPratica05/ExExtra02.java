package FichaPratica05;

import java.util.Scanner;

public class ExExtra02 {

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int [] vetor = new int[3];

        // Ler valores do vetor

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um valor na posição [" + i + "] do vetor: ");
            vetor[i] = input.nextInt();
        }

        // Imprimir os valores do vetor na ordem de inserção

        for (int j = 0; j < vetor.length; j++) {
            System.out.println("O valor do vetor na posição [" + (2-j) + "] é " + vetor[2-j]);
        }


    }

}
