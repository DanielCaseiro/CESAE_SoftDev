package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex04 {

    public static void imprimirFile (String caminhoFile) throws FileNotFoundException {

        File myFile = new File(caminhoFile);
        Scanner sc = new Scanner(myFile);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }



    }

    /* ------------------------------------------------------------------------------------------- */

    public static void main(String[] args) throws FileNotFoundException {

        imprimirFile("Files/exercicio_04.csv");

    }
}
