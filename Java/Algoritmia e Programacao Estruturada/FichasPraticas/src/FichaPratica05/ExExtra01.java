package FichaPratica05;

import java.util.Scanner;

public class ExExtra01 {

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int [] vetor = new int[6];

        // Ler valores do vetor

        System.out.println(" ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um valor na posição [" + i + "] do vetor: ");
            vetor[i] = input.nextInt();
        }

        // Imprimir os valores do vetor na ordem de inserção

        System.out.println(" ");
        System.out.println("-------- VETOR --------");

        for (int i = 0; i < vetor.length; i++) {
            if (i < vetor.length -1) {
                System.out.print(vetor[i] + "  |  ");
            } else {
                System.out.print(vetor[i]);
            }
        }

        System.out.println(" ");

    }
}
