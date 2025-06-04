package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex02 {

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

    public static void main(String[] args) throws FileNotFoundException {

        escreverFile("Files/exercicio_02.txt", "Olá, Mundo!");
    }
}
