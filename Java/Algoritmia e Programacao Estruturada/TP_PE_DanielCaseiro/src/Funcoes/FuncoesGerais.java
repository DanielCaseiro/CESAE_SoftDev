package Funcoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static Funcoes.FuncoesAdmin.menuAdmin;
import static Funcoes.FuncoesCliente.menuCliente;

public class FuncoesGerais {


    /**
     * Função que imprime o conteúdo de um ficheiro para a consola
     * @param caminhoFile Caminho para o ficheiro
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static void imprimirFile (String caminhoFile) throws FileNotFoundException {

        // FichaPratica07 Ex01

        // Scanner para ler ficheiro
        File myFile = new File(caminhoFile);
        Scanner sc = new Scanner(myFile);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }



    }

    /* ------------------------------------------------------------------------------------------- */

    /**
     * Função que conta o número de linhas em um ficheiro CVS excluindo o cabeçalho
     * @param caminho Caminho para o ficheiro
     * @return Um número inteiro que representa o total de linhas no ficheiro excluindo o cabeçalho
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static int numLinhasCSV (String caminho) throws FileNotFoundException {

        // FichaPratica07 Ex07

        File myFile = new File(caminho);
        Scanner sc = new Scanner(myFile);

        int totalLinhas = -1; // Tirar a linha do cabeçalho



        while (sc.hasNextLine()) {
            sc.nextLine();
            totalLinhas ++;
        }


        sc.close();

        return totalLinhas;
    }

    /* ------------------------------------------------------------------------------------------- */


    /**
     * Função que conta o número de colunas em um ficheiro CSV
     * @param caminho Caminho para o ficheiro
     * @param delimitador String que representa o caracter usado como delimitador no ficheiro CSV
     * @return Um número inteiro que representa o total de colunas no ficheiro
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static int numColunasCSV (String caminho, String delimitador) throws FileNotFoundException {

        // FichaPratica07 Ex09

        File myFile = new File(caminho);
        Scanner sc = new Scanner(myFile);

        String linha = sc.nextLine(); //linha do cabecalho
        String[ ] tokensDaLinha = linha.split(delimitador);

        int totalColunas = tokensDaLinha.length;

        sc.close();

        return totalColunas;
    }

    /* ------------------------------------------------------------------------------------------- */


    /**
     * Função que pega um ficheiro CSV e transforma-o em uma matriz String (sem o cabeçalho)
     * @param caminho Caminho para o ficheiro
     * @param delimitador String que representa o caracter usado como delimitador no ficheiro CSV
     * @return Uma matriz do tipo String com os valores do ficheiro CSV (sem o cabeçalho!)
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static String[][] csvParaMatrizString (String caminho, String delimitador) throws FileNotFoundException {

        // FichaPratica07 Ex09

        File myFile = new File(caminho);
        Scanner sc = new Scanner(myFile);

        // Criar a matriz

        String[ ][ ] matriz = new String[numLinhasCSV(caminho)][numColunasCSV(caminho,delimitador)];

        // Pular a linha do cabeçalho
        String linhaFicheiro = sc.nextLine();


        // Preencher a matriz com os valores do ficheiro CSV

        int k = 0; // index da linha do ficheiro (já sem o cabeçalho)

        while (sc.hasNextLine()) {
            linhaFicheiro = sc.nextLine();
            String[ ] tokensDaLinha = linhaFicheiro.split(delimitador); //vetor da linha do ficheiro

            // Colocar os valores do vetor da linha do ficheiro na linha correspondente da matriz
            for (int linhaMatriz = k; linhaMatriz < matriz.length; linhaMatriz++) {
                for(int colunaMatriz = 0; colunaMatriz < matriz[linhaMatriz].length; colunaMatriz++) {
                    matriz[linhaMatriz][colunaMatriz] = tokensDaLinha[colunaMatriz];
                }
            }
            k++;
        }

        return matriz;
    }

    /* ------------------------------------------------------------------------------------------- */


    /**
     * Função que recebe uma matriz do tipo String e cria um array com todos os valores de uma coluna excluindo os valores duplicados
     * @param matriz Uma matriz do tipo String a ser lida e analisada
     * @param indexColuna Um numero inteiro que representa a coluna a ser passada para o array (sem valores dulplicados)
     * @return Um array de Strings com os valores da coluna indicada (sem valores duplicados)
     */
    public static String [] arrayColuna (String [][] matriz, int indexColuna) {

        // Iterar a matriz e passar todos os valores da coluna (coluna estudio = index[5]) para um array

        String [] array1 = new String[matriz.length];

        for (int linhaMatriz = 0; linhaMatriz < matriz.length; linhaMatriz++) {
            array1 [linhaMatriz] = matriz[linhaMatriz][indexColuna];
        }

        // Para cada valor do array1, iterar o array 1 para construir um segundo array sem os estúdios duplicados
        //FichaPratica05 ExExtra05

        String [] array2 = new String[array1.length];

        boolean existente = false;
        int k = 0; // contador de posições preenchidas do array2

        for (int i = 0; i < array1.length; i++) {
            for (int j = i+1; j < array1.length; j++) {
                if (array1[i].equals(array1[j])) {
                    existente = true;
                }
            }

            if(!existente) {
                array2[k] = array1[i];
                k++;
            }

            existente = false;
        }

        // Criar um último array sem os espaços vazios

        String[] arrayFinal = new String[k];

        for (int i = 0; i < arrayFinal.length; i++) {
            arrayFinal[i]=array2[i];
        }


        return arrayFinal;
    }

/* ------------------------------------------------------------------------------------------- */

    /**
     * Função que cria o menu de login
     * @throws FileNotFoundException Caso os ficheiros lidos pelas funções dentro do menu não sejam encontrados
     */
    public static void menuLogin () throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        String tipoUtilizador, userName, password;
        int opcaoTentativaAdmin = 1; // inicializada como != 0 para entrar no loop;
        boolean adminLogin = false;

        // Imprimir o nome da empresa
        System.out.println(" ");
        System.out.println("_*_*_*_*_*_ IMDV© _*_*_*_*_*_");

        // Loop do tipo de utilizador

        do {

            // Ler o tipo de utilizador
            System.out.println(" ");
            System.out.print("Tipo de Utilizador (ADMIN || CLIENTE): ");
            tipoUtilizador = input.nextLine();
            tipoUtilizador = tipoUtilizador.trim();
            System.out.println(" ");

            if (!tipoUtilizador.equalsIgnoreCase("ADMIN") && !tipoUtilizador.equalsIgnoreCase("CLIENTE")) {
                System.out.println("Tipo de utilizador inválido. Por favor, digite 'ADMIN' ou 'CLIENTE'.");
                System.out.println(" ");
            }

        } while (!tipoUtilizador.equalsIgnoreCase("ADMIN") && !tipoUtilizador.equalsIgnoreCase("CLIENTE"));


        if (tipoUtilizador.equalsIgnoreCase("CLIENTE")) {
                menuCliente();
            }

        if (tipoUtilizador.equalsIgnoreCase("ADMIN")) {

            // Criar vetor com user names
            String [] arrayUserNames = arrayColuna(csvParaMatrizString("Files/IMDV_AdminLogin.csv",";"),0);

            // Criar vetor com passwords
            String [] arrayPasswords = arrayColuna(csvParaMatrizString("Files/IMDV_AdminLogin.csv",";"),1);


            // Loop do user name e password

            do {

                adminLogin = false;

                System.out.print("USERNAME: ");
                userName = input.nextLine();
                userName = userName.trim();
                System.out.println(" ");
                System.out.print("PASSWORD: ");
                password = input.nextLine();
                password = password.trim();
                System.out.println(" ");

                // iterar os dois vetores e ver se o username da match com a password
                for (int i = 0; i < arrayUserNames.length; i++) {
                    if (userName.equals(arrayUserNames[i]) && password.equals(arrayPasswords[i])) {
                        adminLogin = true;
                        break;
                    }
                }

                if (!adminLogin) {

                    System.out.println("User name ou password incorreta.");
                    System.out.println("1. Tentar novamente");
                    System.out.println("0. Encerrar o programa");
                    System.out.print("Escolha uma opção: ");
                    opcaoTentativaAdmin = input.nextInt();
                    input.nextLine(); // para consumir o enter do nextInt;
                    System.out.println(" ");
                }

            } while (opcaoTentativaAdmin != 0 && adminLogin == false);

            if(opcaoTentativaAdmin == 0) {
                System.out.println(" ");
                System.out.println("_*_*_*_*_*_ Programa Encerrado _*_*_*_*_*_ ");
                System.out.println(" ");
                imprimirFile("Files/IMDV_Copyright.txt");
                System.out.println(" ");
            }

            if(adminLogin) {
                menuAdmin();
            }

        }
    }


/* ------------------------------------------------------------------------------------------- */
/* ------------------------------------------------------------------------------------------- */
/* ------------------------------------------------------------------------------------------- */
}
