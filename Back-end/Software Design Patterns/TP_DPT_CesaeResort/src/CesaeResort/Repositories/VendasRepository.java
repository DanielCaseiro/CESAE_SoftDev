package CesaeResort.Repositories;

import CesaeResort.Models.Reserva;
import CesaeResort.Models.Venda;
import CesaeResort.Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class VendasRepository {
    // Atributos
    private ArrayList<Venda> vendasArray;

    // Construtor
    public VendasRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.vendasArray= csvFR.vendasFileReader("Files/vendas_experiencias.csv");
    }

    // Metodos
    public ArrayList<Venda> getVendasArray() {
        return vendasArray;
    }

}
