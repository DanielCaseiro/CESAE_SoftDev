package Funcoes;

import java.util.Arrays;

public class FuncoesArraysEMatrizes {


    /**
     * Função que recebe uma matriz do tipo String e a imprime na consola
     * @param matriz A matriz a ser impressa
     */
    public static void imprimirMatrizString (String[ ][ ] matriz) {

        // Imprimir a matriz

        System.out.println(" ");

        for (int i = 0; i< matriz.length; i++) {
            for(int j = 0; j<matriz[i].length; j++) {
                if (j == matriz[i].length -1) {
                    System.out.println(" " + matriz[i][j] + " ");
                } else {
                    System.out.print(" " + matriz[i][j] + " ");
                }
            }
        }

    }

/* ------------------------------------------------------------------------------------------- */


    /**
     * Função que imprime as linhas de uma matriz que contenham em qualquer de suas colunas o valor especificado
     * @param matriz A matriz a ser analisada
     * @param valor O valor que servirá de critério para imprimir ou não a linha
     */
    public static void pesquisarLinhaMatriz (String[ ][ ] matriz, String valor) {

        // Imprimir as linhas que possuam o valor recebido como critério

        System.out.println(" ");

        for (int i = 0; i< matriz.length; i++) {
            for(int j = 0; j<matriz[i].length; j++) {
                if (matriz[i][j].equalsIgnoreCase(valor)) {
                    for(int l = 0; l < matriz[i].length; l++) {
                        if (l == matriz[i].length -1) {
                            System.out.println(" " + matriz[i][l] + " ");
                        } else {
                            System.out.print(" " + matriz[i][l] + " ");
                        }
                    }
                }
            }
        }

    }

/* ------------------------------------------------------------------------------------------- */


    /**
     * Função que encontra o maior tempo (no formato minutos:segundos) em uma determinada coluna de uma matriz
     * @param matriz A matriz a ser analisada
     * @param indexColunaTempo Index da coluna que contém os valores que representam o tempo
     * @param delimitador A string que serve como delimitador entre minutos e segundos (':', '-')
     */
    public static void pesquisarMaiorTempoMSMatrizString (String [] [] matriz, int indexColunaTempo, String delimitador) {

        int maiorTempo = 0;
        int indexLinhaMaiorTempo = 0;

        for (int linha = 0; linha <matriz.length; linha++) {

            String valorColunaString = matriz [linha] [indexColunaTempo];
            String [] tokensDaLinha = valorColunaString.split(delimitador);

            int minutosLinhaAtual = Integer.parseInt(tokensDaLinha[0]);
            int segundosLinhaAtual = Integer.parseInt(tokensDaLinha[1]);

            int segundosTotaisLinhaAtual = (minutosLinhaAtual*60) + segundosLinhaAtual;

            if (segundosTotaisLinhaAtual > maiorTempo) {
                maiorTempo = segundosTotaisLinhaAtual;
                indexLinhaMaiorTempo = linha;
            }
        }

        // imprimir resultados
        for (int i = 0; i< matriz.length; i++) {
            if (i == indexLinhaMaiorTempo) {
                System.out.println(Arrays.toString(matriz[i]));
            }
        }

    }

/* ------------------------------------------------------------------------------------------- */

    /**
     * Função que pesquisa em uma coluna de uma matriz todos os tempos (no fomato minutos:segundos) maiores que os valores indicados
     * @param matriz A matriz a ser analisada
     * @param indexColunaTempo Index da coluna que contém os valores dos tempos
     * @param delimitador A string que serve como delimitador entre minutos e segundos (':', '-')
     * @param minutosProcurar Numero inteiro que representa o threshold de minutos a procurar
     * @param segundosProcurar Numero inteiro que representa o threshold de segundos a procurar
     */
    public static void perquisarTemposMaioresQueMatrizString (String [] [] matriz, int indexColunaTempo, String delimitador, int minutosProcurar, int segundosProcurar) {

        int totalSegundosProcurar = (minutosProcurar*60) + segundosProcurar;

        for (int linha = 0; linha <matriz.length; linha++) {

            String valorColunaString = matriz [linha] [indexColunaTempo];
            String [] tokensDaLinha = valorColunaString.split(delimitador);

            int minutosLinhaAtual = Integer.parseInt(tokensDaLinha[0]);
            int segundosLinhaAtual = Integer.parseInt(tokensDaLinha[1]);

            int segundosTotaisLinhaAtual = (minutosLinhaAtual*60) + segundosLinhaAtual;

            if (segundosTotaisLinhaAtual >= totalSegundosProcurar) {
                System.out.println(Arrays.toString(matriz[linha]));
            }
        }

    }



}


