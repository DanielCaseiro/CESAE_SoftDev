package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex08 {

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

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(" ");
        System.out.println("O valor total das vendas é: ");
        System.out.println(totalColunaXColuna("Files/exercicio_08.csv", ",", 2, 3));
        System.out.println(" ");

    }
}
