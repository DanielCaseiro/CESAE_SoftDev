package GrandesNegocios.Repositorios;

import GrandesNegocios.Models.User;
import GrandesNegocios.Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UsersRepository {
    // Atributos
    private ArrayList<User> usersArray;

    // Construtor
    public UsersRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.usersArray= csvFR.usersFileReader("Files/login_grandesNegocios.csv");
    }

    public ArrayList<User> getUserArray() {
        return usersArray;
    }

}
