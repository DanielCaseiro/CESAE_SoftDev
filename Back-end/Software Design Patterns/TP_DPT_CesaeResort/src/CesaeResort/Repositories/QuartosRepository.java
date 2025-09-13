package CesaeResort.Repositories;

import CesaeResort.Models.Quarto;
import CesaeResort.Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class QuartosRepository {
    // Atributos
    private ArrayList<Quarto> quartosArray;

    // Construtor
    public QuartosRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.quartosArray= csvFR.quartosFileReader("Files/quartos.csv");

    }

    // Metodos
    public ArrayList<Quarto> getQuartosArray() {
        return quartosArray;
    }
}
