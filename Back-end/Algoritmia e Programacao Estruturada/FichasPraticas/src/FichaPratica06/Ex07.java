package FichaPratica06;

import java.util.Scanner;

public class Ex07 {


// -------------------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        String caracter;
        int linhas, colunas;

        // Apresentar o programa
        System.out.println(" ");
        System.out.println("====== PROGRAMA DE DESENHAR UM QUADRADO ======");
        System.out.println(" ");

        // Ler o caracter
        System.out.println(" ");
        System.out.print("Introduza um caracter: ");
        caracter = input.next();
        System.out.println(" ");

        // Ler o numero de linhas
        System.out.println(" ");
        System.out.print("Introduza o número de linhas: ");
        linhas = input.nextInt();
        System.out.println(" ");

        // Ler o numero de colunas
        System.out.println(" ");
        System.out.print("Introduza o número de colunas: ");
        colunas = input.nextInt();
        System.out.println(" ");

        // Desenhar o quadrado
        System.out.println(" ");



        // SEM USAR MATRIZ

        // Primeira linha
        for (int i = 1; i <= colunas; i++) {
            System.out.print(caracter);
        }

        System.out.println(" ");

        // Linhas do meio
        for (int i = 1; i <= linhas - 2; i++) {
            for (int j = 1; j <= colunas; j++) {
                if (j == 1) {
                    System.out.print(caracter);
                } else if (j == colunas) {
                    System.out.println(caracter);
                } else {
                    System.out.print(" ");
                }
            }
        }

        //   Ultima linha
        for (int i=0; i<colunas; i++) {
            System.out.print(caracter);
        }


        // Fim do programa

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Fim do programa.");


        // USANDO MATRIZ

////        // Apresentar a matriz
//
//        int [][] matriz = new int[linhas][colunas];
////
//        System.out.println("== MATRIZ ==");
//
//        for (linhas = 0; linhas < matriz.length; linhas++) {
//            for (int colunas = 0; colunas < matriz[0].length; colunas++) {
//                System.out.print(matriz[linhas][colunas] + "|\t");
//            }
//            System.out.println();
//        }









//
//        for (int j = 0; j < matriz.length; j++) {
//            for (int i = 0; i < matriz[j].length; i++) {
//                System.out.print(matriz[j][i]);
//            }
//            System.out.println(" ");
//        }


//        // Pensar em termos de desenhar uma matriz
//        int [][] matriz = new int[linhas][colunas];
//
//        for (int j=0; j < matriz.length; j++) {
//            for (int i=0; i < matriz[j].length; j++) {
//                if (j == 0 && i < matriz[j].length -2) {
//                    System.out.print(caracter);
//                } else if (j == matriz.length -1) {
//                    System.out.print(caracter);
//                } else if ( j > 0 && j < matriz.length -1 ) {
//                    if (i == 0) {
//                        System.out.print(caracter);
//                    } else if (i == matriz[j].length -1) {
//                        System.out.print(caracter);
//                        System.out.println(" ");
//                    }
//
//                }
//
//
//
//
//                    System.out.print(" ");
//                }
//            }
        }


    }


