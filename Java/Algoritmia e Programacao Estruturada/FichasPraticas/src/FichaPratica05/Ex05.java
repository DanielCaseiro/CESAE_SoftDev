package FichaPratica05;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int [] vetor = new int[10];
        int soma = 0;
        int media;

        // Ler valores do vetor

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um valor no vetor [" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        // Calcular e imprimir a media dos valores do vetor

        for (int j = 0; j < vetor.length; j++) {
            soma = soma + vetor[j];
        }

        media = soma/ vetor.length;

        System.out.println("A media dos valores é " + media);


    }
}
