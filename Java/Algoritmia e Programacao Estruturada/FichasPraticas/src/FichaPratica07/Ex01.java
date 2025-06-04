package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01 {

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

    public static void main(String[] args) throws FileNotFoundException {

        imprimirFile("Files/exercicio_01.txt");
        System.out.println(" ");
        System.out.println(" ");
        imprimirFile("Files/exercicio_01_Alternativa01.txt");
        System.out.println(" ");
        System.out.println(" ");
        imprimirFile("Files/exercicio_01_Alternativa02.txt");

    }
}
