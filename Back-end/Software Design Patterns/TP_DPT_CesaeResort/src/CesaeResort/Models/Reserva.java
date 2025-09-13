package CesaeResort.Models;

public class Reserva {
    // Atributos
    private String idReserva;
    private int numQuarto;
    private String idCliente;
    private int anoReserva;
    private int mesReserva;
    private int semanaReserva;

    // Construtor
    public Reserva(String idReserva, int numQuarto, String idCliente, int anoReserva, int mesReserva, int semanaReserva) {
        this.idReserva = idReserva;
        this.numQuarto = numQuarto;
        this.idCliente = idCliente;
        this.anoReserva = anoReserva;
        this.mesReserva = mesReserva;
        this.semanaReserva = semanaReserva;
    }

    // Metodos
    public String getIdReserva() {
        return idReserva;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public int getAnoReserva() {
        return anoReserva;
    }

    public int getMesReserva() {
        return mesReserva;
    }

    public int getSemanaReserva() {
        return semanaReserva;
    }

    @Override
    public String toString() {
        return
                "\nidReserva='" + this.idReserva +
                " | numQuarto=" + this.numQuarto +
                " | idCliente='" + this.idCliente +
                " | anoReserva=" + this.anoReserva +
                " | mesReserva=" + this.mesReserva +
                " | semanaReserva=" + this.semanaReserva;
    }
}
