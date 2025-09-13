package CesaeResort.Repositories;

import CesaeResort.Models.Cliente;
import CesaeResort.Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ClientesRepository {
    // Atributos
    private ArrayList<Cliente> clientesArray;

    // Construtor
    public ClientesRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.clientesArray= csvFR.clientesFileReader("Files/clientes.csv");
    }

    // Metodos
    public ArrayList<Cliente> getClientesArray() {
        return clientesArray;
    }
}
