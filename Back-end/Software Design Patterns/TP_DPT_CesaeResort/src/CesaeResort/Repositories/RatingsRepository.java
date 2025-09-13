package CesaeResort.Repositories;

import CesaeResort.Models.Rating;
import CesaeResort.Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RatingsRepository {
    // Atributos
    private ArrayList<Rating> ratingsArray;

    // Construtor
    public RatingsRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.ratingsArray= csvFR.ratingsFileReader("Files/ratings_experiencias.csv");
    }

    // Metodos
    public ArrayList<Rating> getRatingsArray() {
        return ratingsArray;
    }
}
