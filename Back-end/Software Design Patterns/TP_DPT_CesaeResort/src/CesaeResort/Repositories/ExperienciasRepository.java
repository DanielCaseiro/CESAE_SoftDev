package CesaeResort.Repositories;

import CesaeResort.Models.Experiencia;
import CesaeResort.Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ExperienciasRepository {
    // Atributos
    private ArrayList<Experiencia> experienciasArray;

    // Construtor
    public ExperienciasRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.experienciasArray= csvFR.experienciasFileReader("Files/experiencias.csv");
    }

    // Metodos
    public ArrayList<Experiencia> getExperienciasArray() {
        return experienciasArray;
    }
}
