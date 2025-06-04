package FichaPratica05;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int [] vetor1 = new int[3];
        int [] vetor2 = new int[3];
        int [][] matriz = new int[3][2];
        int x;

        // Ler valores do vetor1

        System.out.println("--- VETOR 1 ---");

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Insira um valor na posição [" + i + "] do vetor1: ");
            vetor1[i] = input.nextInt();
            matriz[i][0] = vetor1[i];
        }

        // Ler valores do vetor2

        System.out.println("--- VETOR 2 ---");

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Insira um valor na posição [" + i + "] do vetor2: ");
            vetor2[i] = input.nextInt();
            matriz[i][1] = vetor2[i];
        }


        // Apresentar a matriz

        System.out.println("== MATRIZ ==");

        for (int l = 0; l < matriz.length; l++) {
            for (int m = 0; m < matriz[l].length; m++) {
                System.out.print(matriz[l][m]);
            }
            System.out.println(" ");
        }

    }

    /*

    Solução professor

    não é preciso construir a matriz antes
    basta construí-la na hora de apresentá-la

    for (int i = 0; i < matriz.lenght; i++) {
        matriz[i][0] = vetor1[i]
        matriz[i][1] = vetor2[i]
    }


    */


}
