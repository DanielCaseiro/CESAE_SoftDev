package CesaeResort.Repositories;

import CesaeResort.Models.Guia;
import CesaeResort.Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GuiasRepository {
    // Atributos
    private ArrayList<Guia> guiasArray;

    // Construtor
    public GuiasRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.guiasArray= csvFR.guiasFileReader("Files/guias_experiencias.csv");
    }

    // Metodos
    public ArrayList<Guia> getGuiasArray() {
        return guiasArray;
    }
}
