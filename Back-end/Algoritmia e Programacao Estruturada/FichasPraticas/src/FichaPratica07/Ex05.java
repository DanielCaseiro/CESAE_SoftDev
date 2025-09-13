package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex05 {

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


    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(" ");
        System.out.println("Soma dos números no ficheiro exercícios_05_31: ");
        System.out.println(somaFile("Files/exercicio_05_31.txt"));
        System.out.println(" ");
        System.out.println("Soma dos números no ficheiro exercícios_05_1999: ");
        System.out.println(somaFile("Files/exercicio_05_1999.txt"));

    }
}
