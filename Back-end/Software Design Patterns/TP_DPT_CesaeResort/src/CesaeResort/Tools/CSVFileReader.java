package CesaeResort.Tools;

import CesaeResort.Models.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVFileReader {
    /**
     * Metodo que le o ficheiro de usuários (logins) e, para cada registo, cria um objeto da classe User e o adiciona a um array
     * @param filePath O caminho para o ficheiro de usuários
     * @return Retorna um array de Users
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado.
     */
    public ArrayList<User> usersFileReader(String filePath) throws FileNotFoundException {

        // Criar Scanner
        File usersFile = new File(filePath);
        Scanner usersScanner = new Scanner(usersFile);

        // Criar ArrayList de Users vazio
        ArrayList<User> usersArray = new ArrayList<>();

        // Avançar o cabeçalho
        usersScanner.nextLine();

        // iterar/ler o ficheiro linha a linha
        while (usersScanner.hasNextLine()) {

            // Converter cada linha numa String
            String linha = usersScanner.nextLine();

            // Separar String linha em uma String para cada coluna
            String[] linhaSeparada = linha.split(",");

            // Atribuir a String com a informação de cada coluna à variável correspondente
            String username = linhaSeparada[0];
            String password = linhaSeparada[1];
            String tipoAcesso = linhaSeparada[2];

            // Criar novo User com os valores apanhados do ficheiro
            User newUser = new User(tipoAcesso,username,password);

            // Adicionamos ao Array de Users
            usersArray.add(newUser);

        }

        // Terminado o ciclo, retornar o array completo
        return usersArray;
    }

    /**
     * Metodo que le o ficheiro de guias_experiencias e, para cada registo, cria um objeto da classe Guia e o adiciona a um array
     * @param filePath O caminho para o ficheiro
     * @return Retorna um array de Guias
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado.
     */
    public ArrayList<Guia> guiasFileReader(String filePath) throws FileNotFoundException {

        // Criar Scanner
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        // Criar ArrayList vazio
        ArrayList<Guia> guiasArray = new ArrayList<>();

        // Avançar o cabeçalho
        scanner.nextLine();

        // iterar/ler o ficheiro linha a linha
        while (scanner.hasNextLine()) {

            // Converter cada linha numa String
            String linha = scanner.nextLine();

            // Separar String linha em uma String para cada coluna
            String[] linhaSeparada = linha.split(",");

            // Atribuir a String com a informação de cada coluna à variável correspondente
            String id = linhaSeparada[0];
            String nome = linhaSeparada[1];
            String nacionalidade = linhaSeparada[2];
            String email = linhaSeparada[3];
            String telemovel = linhaSeparada[4];

            // Criar novo Guia com os valores apanhados do ficheiro
            Guia newGuia = new Guia(id,nome,nacionalidade,email,telemovel);

            // Adicionamos ao Array
            guiasArray.add(newGuia);

        }

        // Terminado o ciclo, retornar o array completo
        return guiasArray;
    }

    /**
     * Metodo que le o ficheiro de clientes e, para cada registo, cria um objeto da classe Cliente e o adiciona a um array
     * @param filePath O caminho para o ficheiro
     * @return Retorna um array de Clientes
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado.
     */
    public ArrayList<Cliente> clientesFileReader(String filePath) throws FileNotFoundException {

        // Criar Scanner
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        // Criar ArrayList vazio
        ArrayList<Cliente> clientesArray = new ArrayList<>();

        // Avançar o cabeçalho
        scanner.nextLine();

        // iterar/ler o ficheiro linha a linha
        while (scanner.hasNextLine()) {

            // Converter cada linha numa String
            String linha = scanner.nextLine();

            // Separar String linha em uma String para cada coluna
            String[] linhaSeparada = linha.split(",");

            // Atribuir a String com a informação de cada coluna à variável correspondente
            String id = linhaSeparada[0];
            String nome = linhaSeparada[1];
            String nacionalidade = linhaSeparada[2];
            String email = linhaSeparada[3];
            String telemovel = linhaSeparada[4];
            String dataNascimento = linhaSeparada[5];

            // Converter a String do consentimento marketing para boolean
            // Boolean.parseBoolean() funcionaria??

            boolean consentimentoMarketing;

            if(linhaSeparada[6].equalsIgnoreCase("true")){
                consentimentoMarketing = true;
            } else {
                consentimentoMarketing = false;
            }


            // Criar novo Cliente com os valores apanhados do ficheiro
            Cliente newCliente = new Cliente(id,nome,nacionalidade,email,telemovel, dataNascimento, consentimentoMarketing);

            // Adicionamos ao Array
            clientesArray.add(newCliente);

        }

        // Terminado o ciclo, retornar o array completo
        return clientesArray;
    }

    /**
     * Metodo que le o ficheiro de experiencias e, para cada registo, cria um objeto da classe Experiencia e o adiciona a um array
     * @param filePath O caminho para o ficheiro
     * @return Retorna um array de Experiencias
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado.
     */
    public ArrayList<Experiencia> experienciasFileReader(String filePath) throws FileNotFoundException{

        // Criar Scanner
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        // Criar ArrayList vazio
        ArrayList<Experiencia> experienciasArray = new ArrayList<>();

        // Avançar o cabeçalho
        scanner.nextLine();

        // iterar/ler o ficheiro linha a linha
        while (scanner.hasNextLine()) {

            // Converter cada linha numa String
            String linha = scanner.nextLine();

            // Separar String linha em uma String para cada coluna
            String[] linhaSeparada = linha.split(",");

            // Atribuir a String com a informação de cada coluna à variável correspondente
            String id = linhaSeparada[0];
            String nome = linhaSeparada[1];
            String idGuiaExperiencia = linhaSeparada[2];
            double precoAdulto = Double.parseDouble(linhaSeparada[3]);
            double precoCrianca =  Double.parseDouble(linhaSeparada[4]);


            // Criar nova Experiencia com os valores apanhados do ficheiro
            Experiencia newExperiencia = new Experiencia(id, nome,idGuiaExperiencia, precoAdulto, precoCrianca);

            // Adicionamos ao Array
            experienciasArray.add(newExperiencia);

        }

        // Terminado o ciclo, retornar o array completo
        return experienciasArray;

    }

    /**
     * Metodo que le o ficheiro de quartos e, para cada registo, cria um objeto da classe Quarto e o adiciona a um array
     * @param filePath O caminho para o ficheiro
     * @return Retorna um array de quartos
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado.
     */
    public ArrayList<Quarto> quartosFileReader(String filePath) throws FileNotFoundException {

        // Criar Scanner
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        // Criar ArrayList vazio
        ArrayList<Quarto> quartosArray = new ArrayList<>();

        // Avançar o cabeçalho
        scanner.nextLine();

        // iterar/ler o ficheiro linha a linha
        while (scanner.hasNextLine()) {

            // Converter cada linha numa String
            String linha = scanner.nextLine();

            // Separar String linha em uma String para cada coluna
            String[] linhaSeparada = linha.split(",");

            // Atribuir a String com a informação de cada coluna à variável correspondente
            int numQuarto = Integer.parseInt(linhaSeparada[0]);
            int idTipologia = Integer.parseInt(linhaSeparada[1]);

            // Criar novo Quarto com os valores apanhados do ficheiro
            Quarto newQuarto = new Quarto(numQuarto, idTipologia);

            // Adicionamos ao Array
            quartosArray.add(newQuarto);

        }

        // Terminado o ciclo, retornar o array completo
        return quartosArray;

    }

    /**
     * Metodo que le o ficheiro de tipologias e, para cada registo, cria um objeto da classe Tipologia e o adiciona a um array
     * @param filePath O caminho para o ficheiro
     * @return Retorna um array de Tipologias
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado.
     */
    public ArrayList<Tipologia> tipologiasFileReader(String filePath) throws FileNotFoundException{

        // Criar Scanner
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        // Criar ArrayList vazio
        ArrayList<Tipologia> tipologiasArray = new ArrayList<>();

        // Avançar o cabeçalho
        scanner.nextLine();

        // iterar/ler o ficheiro linha a linha
        while (scanner.hasNextLine()) {

            // Converter cada linha numa String
            String linha = scanner.nextLine();

            // Separar String linha em uma String para cada coluna
            String[] linhaSeparada = linha.split(",");

            // Atribuir a String com a informação de cada coluna à variável correspondente
            int idTipologia = Integer.parseInt(linhaSeparada[0]);
            String descricaoTipologia = linhaSeparada[1];
            double precoPorSemana = Double.parseDouble(linhaSeparada[2]);


            // Criar nova Tipologia com os valores apanhados do ficheiro
            Tipologia newTipologia = new Tipologia(idTipologia,descricaoTipologia,precoPorSemana);

            // Adicionamos ao Array
            tipologiasArray.add(newTipologia);

        }

        // Terminado o ciclo, retornar o array completo
        return tipologiasArray;


    }

    /**
     * Metodo que le o ficheiro de ratings_experiencias e, para cada registo, cria um objeto da classe Rating e o adiciona a um array
     * @param filePath O caminho para o ficheiro
     * @return Retorna um array de Ratings
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado.
     */
    public ArrayList<Rating> ratingsFileReader(String filePath) throws FileNotFoundException {

        // Criar Scanner
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        // Criar ArrayList vazio
        ArrayList<Rating> ratingsArray = new ArrayList<>();

        // Avançar o cabeçalho
        scanner.nextLine();

        // iterar/ler o ficheiro linha a linha
        while (scanner.hasNextLine()) {

            // Converter cada linha numa String
            String linha = scanner.nextLine();

            // Separar String linha em uma String para cada coluna
            String[] linhaSeparada = linha.split(",");

            // Atribuir a String com a informação de cada coluna à variável correspondente
            String idRating = linhaSeparada[0];
            String idExperiencia = linhaSeparada[1];
            int ratingExperiencia = Integer.parseInt(linhaSeparada[2]);
            int ratingGuia = Integer.parseInt(linhaSeparada[3]);

            // Criar novo rating com os valores apanhados do ficheiro
            Rating newRating = new Rating(idRating, idExperiencia, ratingExperiencia, ratingGuia);

            // Adicionamos ao Array
            ratingsArray.add(newRating);

        }

        // Terminado o ciclo, retornar o array completo
        return ratingsArray;

    }

    /**
     * Metodo que le o ficheiro de reservas_quartos e, para cada registo, cria um objeto da classe Reserva e o adiciona a um array
     * @param filePath O caminho para o ficheiro
     * @return Retorna um array de Reservas
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado.
     */
    public ArrayList<Reserva> reservasFileReader(String filePath) throws FileNotFoundException{

        // Criar Scanner
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        // Criar ArrayList vazio
        ArrayList<Reserva> reservasArray = new ArrayList<>();

        // Avançar o cabeçalho
        scanner.nextLine();

        // iterar/ler o ficheiro linha a linha
        while (scanner.hasNextLine()) {

            // Converter cada linha numa String
            String linha = scanner.nextLine();

            // Separar String linha em uma String para cada coluna
            String[] linhaSeparada = linha.split(",");

            // Atribuir a String com a informação de cada coluna à variável correspondente
            String idReserva = linhaSeparada[0];
            int numQuarto = Integer.parseInt(linhaSeparada[1]);
            String idCliente = linhaSeparada[2];
            int ano = Integer.parseInt(linhaSeparada[3]);
            int mes = Integer.parseInt(linhaSeparada[4]);
            int semana = Integer.parseInt(linhaSeparada[5]);


            // Criar nova reserva com os valores apanhados do ficheiro
            Reserva newReserva = new Reserva(idReserva, numQuarto, idCliente, ano, mes, semana);

            // Adicionamos ao Array
            reservasArray.add(newReserva);

        }

        // Terminado o ciclo, retornar o array completo
        return reservasArray;


    }

    /**
     * Metodo que le o ficheiro de vendas_experiencias e, para cada registo, cria um objeto da classe Venda e o adiciona a um array
     * @param filePath O caminho para o ficheiro
     * @return Retorna um array de Vendas
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado.
     */
    public ArrayList<Venda> vendasFileReader(String filePath) throws FileNotFoundException{

        // Criar Scanner
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        // Criar ArrayList vazio
        ArrayList<Venda> vendasArray = new ArrayList<>();

        // Avançar o cabeçalho
        scanner.nextLine();

        // iterar/ler o ficheiro linha a linha
        while (scanner.hasNextLine()) {

            // Converter cada linha numa String
            String linha = scanner.nextLine();

            // Separar String linha em uma String para cada coluna
            String[] linhaSeparada = linha.split(",");

            // Atribuir a String com a informação de cada coluna à variável correspondente
            String idVenda = linhaSeparada[0];
            String idExperiencia = linhaSeparada[1];
            String tipoCliente = linhaSeparada[2];
            int anoVenda = Integer.parseInt(linhaSeparada[3]);
            int mesVenda = Integer.parseInt(linhaSeparada[4]);


            // Criar nova Venda com os valores apanhados do ficheiro
            Venda newVenda = new Venda(idVenda, idExperiencia, tipoCliente, anoVenda, mesVenda);

            // Adicionamos ao Array
            vendasArray.add(newVenda);

        }

        // Terminado o ciclo, retornar o array completo
        return vendasArray;


    }

}
