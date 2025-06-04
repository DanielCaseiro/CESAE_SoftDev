package FichaPratica05;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int [][] matriz = new int[2][2];
        int maiorElemento, menorElemento;

        // Ler valores da matriz

        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[j].length; i++) {
                System.out.print("Insira um valor na posição [" + i + "] [" + j + "] da matriz: ");
                matriz[j][i] = input.nextInt();
            }
        }

        // encontrar o maior Elemento

        maiorElemento = matriz[0][0];

        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[j].length; i++) {
                if (maiorElemento < matriz[j][i])
                maiorElemento = matriz[j][i];
            }
        }

        // Encontrar o menor elemento

        menorElemento = matriz[0][0];

        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[j].length; i++) {
                if (menorElemento > matriz[j][i])
                    menorElemento = matriz[j][i];
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

        // Apresentar o maior e o menor valor

        System.out.println("O maior elemento da matriz é " + maiorElemento + " e o menor elemento é " + menorElemento);

    }



}
