package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex06 {

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


    public static void main(String[] args) throws FileNotFoundException {

        System.out.println( nomeComMaiorValor("Files/exercicio_06.txt"));

    }
}
