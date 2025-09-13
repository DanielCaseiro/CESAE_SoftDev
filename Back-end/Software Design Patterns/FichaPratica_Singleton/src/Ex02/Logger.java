package Ex02;

import Ex01.DatabaseConnection;

import java.io.*;
import java.util.Scanner;

public class Logger {
    private static Logger instance;
    private String nomeFicheiro;

    private Logger(String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;
    }

    public static Logger getInstance(String nomeFicheiro) {
        if (instance == null) {
            instance = new Logger(nomeFicheiro);
        }
        return instance;
    }

    public void log(String registo) throws IOException {

        String filePath = "src/Ex02/Ficheiros/" + this.nomeFicheiro + ".txt";

//        File myFile = new File(filePath);
//        PrintWriter pw = new PrintWriter(filePath);
//
//
//        StringBuilder fileContentBuilder = new StringBuilder();
//        if (myFile.exists()) {
//            Scanner scanner = new Scanner(myFile);
//            while (scanner.hasNextLine()) {
//                fileContentBuilder.append(scanner.nextLine()).append("\n");
//            }
//        }
//
//        String fileContent = fileContentBuilder.toString(); // Converte o StringBuilder para String
//
//        String texto = fileContent + registo + "\n";
//
//        pw.println(texto);
//
//        pw.close();


        // Usamos try-with-resources para garantir que o writer seja fechado automaticamente.
        // FileWriter(filePath, true) significa que o arquivo será aberto no modo "append" (anexar).
        // BufferedWriter melhora a performance ao escrever.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(registo); // Escreve o registro no arquivo
            writer.newLine();      // Adiciona uma nova linha após cada registro (opcional, mas recomendado para logs)
        }
        // O bloco catch para IOException é tratado pela declaração "throws IOException" no metodo.
        // A classe chamadora do metodo Log() será responsável por capturar essa exceção.
    }


}
