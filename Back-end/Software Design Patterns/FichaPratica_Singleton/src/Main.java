import Ex01.DatabaseConnection;
import Ex02.Logger;
import Ex03.UserSessionManager;
import Ex04.FileManager;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // DatabaseConnection
//        DatabaseConnection connection = DatabaseConnection.getInstance("jdbc:mysql://localhost:3306/mydatabase");
//        connection.connect();
//        connection.disconnect();
//
//        Logger logger = Logger.getInstance("application_log");
//        logger.log("Mensagem de log 1");
//        logger.log("Mensagem de log 2");
//        logger.log("Mensagem de log 3");
//        logger.log("Mensagem de log 4");
//        logger.log("Mensagem de log 5");


        // UserSessionManager
//        UserSessionManager sessionManager = UserSessionManager.getInstance( );
//        System.out.println("Token de Acesso: " +  sessionManager.getSessionToken( ));
//        System.out.println("Último Acesso: " + sessionManager.getLastAccess( ));
//        sessionManager.updateLastAccessTime();
//        System.out.println("Token de Acesso:" +  sessionManager.getSessionToken( ));
//        System.out.println("Último Acesso: " + sessionManager.getLastAccess( ));


        // FileManager
        FileManager fileManager = FileManager.getInstance();
        fileManager.setRootDirectory("/textFiles");
        fileManager.createFile("file.txt");
        fileManager.createFile("ficheiroNovo.txt");
        fileManager.deleteFile("file.txt");
        fileManager.setRootDirectory("/csvFiles");
        fileManager.createFile("tabela.csv");
        fileManager.createFile("filmes.csv");
        fileManager.createFile("jogos.csv");
        fileManager.deleteFile("tabela.csv ");


    }

}
