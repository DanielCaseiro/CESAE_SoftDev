package GrandesNegocios.Repositorios;

import GrandesNegocios.Models.Sale;
import GrandesNegocios.Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SalesRepository {
    // Atributos
    private ArrayList<Sale> salesArray;

    // Construtor
    public SalesRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.salesArray = csvFR.salesFileReader("Files/minimercado(in).csv");
    }

    public ArrayList<Sale> getSalesArray() {
        return salesArray;
    }
}
