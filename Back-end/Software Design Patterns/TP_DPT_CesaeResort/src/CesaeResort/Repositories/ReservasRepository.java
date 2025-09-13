package CesaeResort.Repositories;

import CesaeResort.Models.Reserva;
import CesaeResort.Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ReservasRepository {
    // Atributos
    private ArrayList<Reserva> reservasArray;

    // Construtor
    public ReservasRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.reservasArray= csvFR.reservasFileReader("Files/reservas_quartos.csv");
    }

    // Metodos
    public ArrayList<Reserva> getReservasArray() {
        return reservasArray;
    }
}
