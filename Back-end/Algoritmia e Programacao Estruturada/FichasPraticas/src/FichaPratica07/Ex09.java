package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica06.Ex05.maiorElementoVetor;
import static Funcoes.FuncoesArraysEMatrizes.*;
import static Funcoes.FuncoesFicheiros.numLinhasCSV;

public class Ex09 {

    /**
     * Função que conta o número de colunas em um ficheiro CSV
     * @param caminho Caminho para o ficheiro
     * @param delimitador String que representa o caracter usado como delimitador no ficheiro CSV
     * @return Um número inteiro que representa o total de linhas no ficheiro
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static int numColunasCSV (String caminho, String delimitador) throws FileNotFoundException {

        File myFile = new File(caminho);
        Scanner sc = new Scanner(myFile);

        String linha = sc.nextLine(); //linha do cabecalho
        String[ ] tokensDaLinha = linha.split(delimitador);

        int totalColunas = tokensDaLinha.length;

        sc.close();

        return totalColunas;
    }


    /**
     * Função que pega um ficheiro CSV e transforma-o em uma matriz String (sem o cabeçalho!) e depois imprime a matriz + o cabeçalho
     * @param caminho Caminho para o ficheiro
     * @param delimitador String que representa o caracter usado como delimitador no ficheiro CSV
     * @return Uma matriz do tipo String com os valores do ficheiro CSV (sem o cabeçalho!)
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static String[][] csvParaMatrizString (String caminho, String delimitador) throws FileNotFoundException {

        // Scanner para ler ficheiro
        File myFile = new File(caminho);
        Scanner sc = new Scanner(myFile);

        // Criar a matriz

        String[ ][ ] matriz = new String[numLinhasCSV(caminho)-1][numColunasCSV(caminho,delimitador)];

        // Imprimir o cabeçalho
        String linha = sc.nextLine();
        String[ ] tokensDaLinha = linha.split(delimitador);

        for(int i = 0; i < tokensDaLinha.length; i++){
            System.out.print(" " + tokensDaLinha[i] + " ");
        }


        int k = 0; // index da linha

        while (sc.hasNextLine()) {
           linha = sc.nextLine();
           tokensDaLinha = linha.split(delimitador);

           for (int i = k; i < matriz.length; i++) {
               for(int j = 0; j < matriz[i].length; j++) {
                   matriz[i][j] = tokensDaLinha[j];
               }
           }
           k++;
        }

       // Imprimir a matriz

        imprimirMatrizString(matriz);

        return matriz;
    }

    /**
     * Função que cria um menu para o Ex09 da FichaPratica07
     * @param matriz A matriz que será utilizada como parâmetro nos cases do Switch
     */
    public static void menuMusica (String[ ][ ] matriz) {

        // Scanner utilizador
        Scanner input = new Scanner(System.in);

        // apresentar o menu de opções

        System.out.println(" ");

        int opcao;
        String genero, artista;
        int minutosProcurar;
        int segundosProcurar;

        do {

            System.out.println(" ");
            System.out.println("====== MENU ======");
            System.out.println("1. Para pesquisar por músicas de um determinado género, digite 1.");
            System.out.println("2. Para pesquisar músicas de um determinado artista, digite 2");
            System.out.println("3. Para pesquisar a música com maior duração, digite 3");
            System.out.println("4. Para pesquisar músicas com duração acima de um valor especificado, digite 4");
            System.out.println("5. Para pesquisar o número de músicas no ficheiro, digite 5");
            System.out.println("0. Para encerrar o programa, digite 0.");

            System.out.println(" ");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println(" ");
                    System.out.print("Digite o género que quer pesquisar: ");
                    input.nextLine(); // <- consumes the leftover newline
                    genero = input.nextLine();

                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Pesquisa por Género _*_*_*_*_*_");
                    System.out.println(" ");

                   pesquisarLinhaMatriz(matriz,genero);



                    break;

                case 2:

                    System.out.println(" ");
                    System.out.print("Digite o artista que quer pesquisar: ");
                    input.nextLine(); // <- consumes the leftover newline
                    artista = input.nextLine();

                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Pesquisa por Artista _*_*_*_*_*_");
                    System.out.println(" ");

                    pesquisarLinhaMatriz(matriz,artista);

                    break;

                case 3:

                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Maior Duração _*_*_*_*_*_");
                    System.out.println(" ");
                    System.out.println("A música com maior duração é: ");

                    System.out.println(" ");

                    pesquisarMaiorTempoMSMatrizString(matriz,3,":");

                    break;

                case 4:

                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Pesquisa por Duração _*_*_*_*_*_");
                    System.out.println(" ");
                    System.out.println("Digite uma duração em: ");
                    System.out.print("minutos: ");
                    input.nextLine(); // <- consumes the leftover newline
                    minutosProcurar = input.nextInt();
                    System.out.println(" ");
                    System.out.print("segundos: ");
                    input.nextLine(); // <- consumes the leftover newline
                    segundosProcurar = input.nextInt();
                    System.out.println("Estas são as músicas com duração superior ao valor especificado: ");

                    System.out.println(" ");

                    perquisarTemposMaioresQueMatrizString(matriz,3, ":", minutosProcurar,segundosProcurar);

                    break;

                case 5:

                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Numero de Músicas _*_*_*_*_*_");
                    System.out.println(" ");
                    System.out.println("O número de músicas no ficheiro é " + matriz.length);

                    break;

                default:
                    System.out.println(" ");
                    System.out.println("Opção inválida;");

            }

        } while (opcao != 0);

        System.out.println(" ");
        System.out.println("Programa encerrado.");
        System.out.println(" ");


    }

    public static void main(String[] args) throws FileNotFoundException {

        // descobrir o numero de linhas do ficheiro csv
        System.out.println(" ");
        System.out.println("O número de linhas no ficheiro csv é " + numLinhasCSV("Files/exercicio_09.csv"));

        // descobrir o número de colunas do ficheiro csv
        System.out.println(" ");
        System.out.println("O número de colunas no ficheiro csv é " + numColunasCSV("Files/exercicio_09.csv", ","));

        // Criar e Imprimir a matriz
        System.out.println(" ");
        System.out.println("_*_*_*_*_*_ TODAS AS MÚSICAS _*_*_*_*_*_");
        System.out.println(" ");
        String[ ][ ] matriz = csvParaMatrizString("Files/exercicio_09.csv",",");

        // Apresentar o menu
        menuMusica(matriz);


    }
}
