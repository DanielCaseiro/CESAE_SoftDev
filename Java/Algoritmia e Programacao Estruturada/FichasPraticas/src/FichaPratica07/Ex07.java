package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex07 {

    /**
     * Função que conta o número de linhas em um ficheiro (incluindo linhas "puladas"/ sem texto)
     * @param caminho Caminho para ficheiro
     * @return um número inteiro que representa o total de linhas no ficheiro
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static int numLinhas (String caminho) throws FileNotFoundException {

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

        /*
        Solução professor

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String [] tokensDaLinha = linha.split(" ");

            totalPalavras += tokensDaLinha.length;

        }

         */

        sc.close();

        return totalPalavras;
    }


    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(" ");
        System.out.println("O número total de linhas no ficheiro exercício_07.txt é:");
        System.out.println(numLinhas("Files/exercicio_07.txt"));
        System.out.println(" ");
        System.out.println("O número total de palavras no ficheiro exercício_07.txt é:");
        System.out.println(numPalavras("Files/exercicio_07.txt"));
        System.out.println(" ");

    }
}
