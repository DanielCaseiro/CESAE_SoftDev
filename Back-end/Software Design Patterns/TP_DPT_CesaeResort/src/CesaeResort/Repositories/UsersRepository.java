package CesaeResort.Repositories;

import CesaeResort.Models.User;
import CesaeResort.Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UsersRepository {
    // Atributos
    private ArrayList<User> usersArray;

    // Construtor
    public UsersRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.usersArray= csvFR.usersFileReader("Files/logins.csv");
    }

    // Metodos
    public ArrayList<User> getUserArray() {
        return usersArray;
    }



}
