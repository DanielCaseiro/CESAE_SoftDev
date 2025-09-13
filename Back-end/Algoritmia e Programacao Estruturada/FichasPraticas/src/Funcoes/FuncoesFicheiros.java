package Funcoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static Funcoes.FuncoesArraysEMatrizes.imprimirMatrizString;

public class FuncoesFicheiros {


// FichaPratica07 Ex01

    /**
     * Função que imprime o conteúdo de um ficheiro para a consola
     * @param caminhoFile Caminho para o ficheiro
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static void imprimirFile (String caminhoFile) throws FileNotFoundException {

        File myFile = new File(caminhoFile);
        Scanner sc = new Scanner(myFile);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }



    }

/* ------------------------------------------------------------------------------------------- */


// FichaPratica07 Ex02

    /**
     * Função que cria um ficheiro com uma mensagem (caso o path/caminho não exista), ou subescreve um ficheiro existente com uma nova mensagem
     * @param caminho Caminho para o ficheiro
     * @param mensagem Mensagem a ser escrita dentro do ficheiro
     */
    public static void escreverFile (String caminho, String mensagem) throws FileNotFoundException {

        File myFile = new File(caminho);
        PrintWriter pw = new PrintWriter(myFile);

        pw.println(mensagem);

        pw.close();

    }

/* ------------------------------------------------------------------------------------------- */


// FichaPratica07 Ex03

    /**
     * Função que copia o conteúdo de um ficheiro e cola em outro ficheiro
     * @param caminhoCopy Caminho do ficheiro que terá seu conteúdo copiado
     * @param caminhoPaste caminho do ficheiro que receberá o conteúdo
     * @throws FileNotFoundException Caso o ficheiro a ser copiado não exista
     */
    public static void copyPasteFile (String caminhoCopy, String caminhoPaste) throws FileNotFoundException {

        File copyFile = new File(caminhoCopy);
        Scanner sc = new Scanner(copyFile);

        File pasteFile = new File(caminhoPaste);
        PrintWriter pw = new PrintWriter(pasteFile);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            pw.println(linha);
        }

        pw.close();

    }

/* ------------------------------------------------------------------------------------------- */


// FichaPratica07 Ex05

    /**
     * Função que soma os números inteiros dentro de um ficheiro
     * @param caminho Caminho para  ficheiro
     * @return um numero inteiro que é a soma dos inteiros dentro do ficheiro
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static int somaFile (String caminho) throws FileNotFoundException {

        File myFile = new File(caminho);
        Scanner sc = new Scanner(myFile);

        int soma;

        soma = 0;

        while (sc.hasNextInt()) {
            soma += sc.nextInt();
        }

        sc.close();

        return soma;
    }

/* ------------------------------------------------------------------------------------------- */


// FichaPratica07 Ex06

    /**
     * Função que le um ficheiro com nomes e valores (um por linha) e encontra o nome associado ao maior valor
     * @param caminho  Caminho para ficheiro
     * @return uma String que é o nome associado ao maior valor
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static String nomeComMaiorValor (String caminho) throws FileNotFoundException {

        File myFile = new File(caminho);
        Scanner sc = new Scanner(myFile);

        String nome, nomeMaiorValor;
        int valor, maiorValor;

        // Ler a primeira linha e
        // inicializar as valiáveis nomeMaiorValor e maiorValor
        // com os primeiros valores da primeira linha do Ficheiro

        String linha = sc.nextLine();
        String[] tokensDaLinha = linha.split(",");
        nome = tokensDaLinha[0];
        valor = Integer.parseInt(tokensDaLinha[1]);
        nomeMaiorValor = nome;
        maiorValor = valor;

        // Ler as demais linhas do ficheiro e encontrar o maior valor e o nome correspondente
        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            tokensDaLinha = linha.split(",");
            nome = tokensDaLinha[0];
            valor = Integer.parseInt(tokensDaLinha[1]);
            if (valor > maiorValor) {
                maiorValor = valor;
                nomeMaiorValor = nome;
            }
        }

        sc.close();

        return nomeMaiorValor;
    }

/* ------------------------------------------------------------------------------------------- */


// FichaPratica07 Ex07

    /**
     * Função que conta o número de linhas em um ficheiro CVS (incluindo linhas "puladas"/ sem texto)
     * @param caminho Caminho para o ficheiro
     * @return Um número inteiro que representa o total de linhas no ficheiro
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static int numLinhasCSV (String caminho) throws FileNotFoundException {

        File myFile = new File(caminho);
        Scanner sc = new Scanner(myFile);

        int totalLinhas = 0;

        while (sc.hasNextLine()) {
            sc.nextLine();
            totalLinhas ++;
        }

        sc.close();

        return totalLinhas;
    }

    /* ------------------------------------------------------------------------------------------- */


    /**
     * Função que conta o total de palavras em um ficheiro (palavras com hífen são contadas como uma só, e caracteres que estejam separados por espaços como "+" ou "-" etc também são contados como palavras
     * @param caminho Caminho para ficheiro
     * @return um número inteiro que representa o total de palavras no ficheiro
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static int numPalavras (String caminho) throws FileNotFoundException {

        File myFile = new File(caminho);
        Scanner sc = new Scanner(myFile);

        int totalPalavras = 0;

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String [] tokensDaLinha = linha.split(" ");
            for (int i = 0; i < tokensDaLinha.length; i++) {
                if(tokensDaLinha.length > 1) {
                    totalPalavras ++;
                }
            }
        }

        sc.close();

        return totalPalavras;
    }

/* ------------------------------------------------------------------------------------------- */


// FichaPratica07 Ex08

    /**
     * Função que, em cada linha, multiplica os valores de uma coluna por outra, e depois soma os resultados em um total
     * @param caminho Caminho para ficheiro
     * @param delimitador String com o delimitador do ficheiro CSV
     * @param indexColuna1 numero inteiro que representa o index da primeira coluna cujos valores serão fatores na multiplicação
     * @param indexColuna2 numero inteiro que representa o index da segunda coluna cujos valores serão fatores na multiplicação
     * @return numero double que representa o total dos valores multiplicados
     * @throws FileNotFoundException
     */
    public static double totalColunaXColuna (String caminho, String delimitador, int indexColuna1, int indexColuna2) throws FileNotFoundException {

        File myFile = new File(caminho);
        Scanner sc = new Scanner(myFile);

        String linha = sc.nextLine(); //linha do cabecalho

        double total = 0;

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[ ] tokensDaLinha = linha.split(delimitador);

            total += Double.parseDouble(tokensDaLinha[indexColuna1])*Double.parseDouble(tokensDaLinha[indexColuna2]);

        }

        sc.close( );

        return total;
    }

/* ------------------------------------------------------------------------------------------- */


// FichaPratica07 Ex09


    /**
     * Função que conta o número de colunas em um ficheiro CSV
     * @param caminho Caminho para o ficheiro
     * @param delimitador String que representa o caracter usado como delimitador no ficheiro CSV
     * @return Um número inteiro que representa o total de colunas no ficheiro
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

/* ------------------------------------------------------------------------------------------- */

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




/* ------------------------------------------------------------------------------------------- */
/* ------------------------------------------------------------------------------------------- */
/* ------------------------------------------------------------------------------------------- */
}


