package Ex04;

import Ex02.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileManager {
    private static FileManager instance;


    private FileManager() {

    }

    public static FileManager getInstance() {
        if (instance == null) {
            instance = new FileManager();
        }
        return instance;
    }

    public void createFile (String nomeFile, String caminhoFile) throws FileNotFoundException {

        String nomeAndCaminhoFile = caminhoFile + nomeFile;

        File myFile = new File(nomeAndCaminhoFile);
        PrintWriter pw = new PrintWriter(myFile);

        pw.close();

    }

    public void createFile (String nomeFile) throws FileNotFoundException {

        String caminhoFile = "src/Ex04/Ficheiros/";

        String nomeAndCaminhoFile = nomeFile;

        File myFile = new File(nomeAndCaminhoFile);
        PrintWriter pw = new PrintWriter(myFile);

        pw.close();

    }

    public void setRootDirectory( String caminhoFile, String novoCaminhoFile) throws FileNotFoundException {

        File copyFile = new File(caminhoFile);
        Scanner sc = new Scanner(copyFile);

        File pasteFile = new File(novoCaminhoFile);
        PrintWriter pw = new PrintWriter(pasteFile);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            pw.println(linha);
        }

        pw.close();

        deleteFile(caminhoFile);

    }

    public void deleteFile(String caminhoFile){

        File fileToDelete = new File(caminhoFile);

        boolean deleted = fileToDelete.delete();

        if(deleted) {
            System.out.println("\nFicheiro deletado com sucesso.");
        } else{
            System.out.println("\nErro ao tentar deletar o ficheiro.");
        }

    }




}
