package FichaPratica05;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int [][] matriz = new int[2][2];
        int numero, contagem;

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

        // Ler o numero
        System.out.print("Insira um numero: ");
        numero = input.nextInt();

        // Checar quantas vezes o numero se encontra na matriz

        contagem = 0;

        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[j].length; i++) {
                if (matriz[j][i] == numero) {
                    System.out.println("O numero " + numero + " aparece na posição " + "["+j+"]" + "["+i+"]");
                    contagem = contagem +1;
                }
            }
        }

        System.out.print("O numero " + numero + " aparece " + contagem + " vezes dentro da matriz");


    }
}
