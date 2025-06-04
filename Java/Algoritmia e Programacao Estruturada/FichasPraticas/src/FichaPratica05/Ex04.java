package FichaPratica05;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int [] vetor = new int[10];
        int menorElemento;
        int elementoAnterior;


        // Ler valores do vetor

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor [" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        menorElemento = vetor[0];

        elementoAnterior = vetor[0];

        // Encontrar o menor elemento

        for (int k = 0; k < vetor.length; k++) {
            if (vetor[k] < elementoAnterior) {
                menorElemento = vetor[k];
                elementoAnterior = vetor [k];
            }
        }

        System.out.println("O menor elemento do vetor é " + menorElemento);


    }
}
