package FichaPratica05;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {


        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][3];
        int soma = 0;

        // Ler valores da matriz

        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[j].length; i++) {
                System.out.print("Insira um valor na posição [" + i + "] [" + j + "] da matriz: ");
                matriz[j][i] = input.nextInt();
            }
        }

        // Apresentar a matriz

        System.out.println("== MATRIZ ==");

        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[j].length; i++) {
                System.out.print(matriz[j][i]);
            }
            System.out.println(" ");
        }

         // Somar os elementos da diagonal da matriz

        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[j].length; i++) {
                if (j == i) {
                    soma = soma + matriz[j][i];
                }
            }
        }

        // Solução do professor:

//        for (int j = 0; j < matriz.length; j++) {
//            soma = soma + matriz[j][j];
//        }

        // Apreentar o resultado
        System.out.println("A soma dos elementos da matriz é: " + soma);


    }
}
