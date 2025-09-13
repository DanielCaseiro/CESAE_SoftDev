package Funcoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Funcoes {

    /**
     * Função que imprime o conteúdo de um ficheiro para a consola
     * @param caminhoFile Caminho para o ficheiro
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static void imprimirFile (String caminhoFile) throws FileNotFoundException {

        // Scanner para ler ficheiro
        File myFile = new File(caminhoFile);
        Scanner sc = new Scanner(myFile);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }

    }



}
