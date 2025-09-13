package CesaeResort.Repositories;

import CesaeResort.Models.Tipologia;
import CesaeResort.Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TipologiasRepository {
    // Atributos
    private ArrayList<Tipologia> tipologiasArray;

    // Construtor
    public TipologiasRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.tipologiasArray = csvFR.tipologiasFileReader("Files/tipologia.csv");
    }

    // Metodos
    public ArrayList<Tipologia> getTipologiasArray() {
        return tipologiasArray;
    }
}
