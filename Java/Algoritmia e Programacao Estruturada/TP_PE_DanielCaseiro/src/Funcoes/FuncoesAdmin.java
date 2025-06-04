package Funcoes;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Funcoes.FuncoesGerais.*;

public class FuncoesAdmin {

    /**
     * Função que recebe e imprime um array de Strings
     * @param arrayEstudios O array de Strings a ser impresso
     */
    public static void imprimirEstudios (String [] arrayEstudios) {

        for (int i = 0; i < arrayEstudios.length; i++) {
            System.out.println(arrayEstudios[i]);
        }
    }

/* ------------------------------------------------------------------------------------------- */


    /**
     * Função que cria o menu do Administrador para o programa Cinema Imdv
     * @throws FileNotFoundException Caso os ficheiros lidos pelas funções dentro do menu não sejam encontrados
     */
    public static void menuAdmin () throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println(" ");
            System.out.println(" ");
            System.out.println("_*_*_*_*_*_*_*_*_*_ MENU ADMIN _*_*_*_*_*_*_*_*_*_");
            System.out.println("1. Consulta de Ficheiros");
            System.out.println("2. Total de Ratings");
            System.out.println("3. Imprimir Todos os Estúdios");
            System.out.println("0. Sair");
            System.out.println(" ");

            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Consulta de Ficheiro _*_*_*_*_*_");
                    System.out.println(" ");
                    imprimirFile("Files/IMDV.csv");

                    System.out.println(" ");


                    break;

                case 2:

                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Total de Ratings _*_*_*_*_*_");
                    System.out.println(" ");
                    System.out.println(numLinhasCSV("Files/IMDV.csv"));

                    break;

                case 3:

                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Estúdios _*_*_*_*_*_");
                    System.out.println(" ");
                    imprimirEstudios(arrayColuna(csvParaMatrizString("Files/IMDV.csv",";"), 5));

                    break;

                case 0:
                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Programa Encerrado _*_*_*_*_*_ ");
                    System.out.println(" ");
                    imprimirFile("Files/IMDV_Copyright.txt");
                    System.out.println(" ");

                    break;

                default:
                    System.out.println(" ");
                    System.out.println("Opção inválida;");

            }

        } while (opcao != 0);
    }


/* ------------------------------------------------------------------------------------------- */
/* ------------------------------------------------------------------------------------------- */
/* ------------------------------------------------------------------------------------------- */
}
