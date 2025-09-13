package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex03 {

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

    public static void main(String[] args) throws FileNotFoundException {

        copyPasteFile("Files/exercicio_03_Alternativa01.txt", "Files/exercicio_03_Paste.txt");

    }
}
