package CesaeResort.Models;

public class Venda {
    // Atributos
    private String idVenda;
    private String idExperiencia;
    private String tipoCliente;
    private int anoVenda;
    private int mesVenda;

    // Construtor
    public Venda(String idVenda, String idExperiencia, String tipoCliente, int anoVenda, int mesVenda) {
        this.idVenda = idVenda;
        this.idExperiencia = idExperiencia;
        this.tipoCliente = tipoCliente;
        this.anoVenda = anoVenda;
        this.mesVenda = mesVenda;
    }

    // Metodos
    public String getIdVenda() {
        return idVenda;
    }

    public String getIdExperiencia() {
        return idExperiencia;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public int getAnoVenda() {
        return anoVenda;
    }

    public int getMesVenda() {
        return mesVenda;
    }

    @Override
    public String toString() {
        return
                "\nidVenda: " + this.idVenda +
                " | idExperiencia: " + this.idExperiencia +
                " | tipoCliente: " + this.tipoCliente +
                " | anoVenda: " + this.anoVenda +
                " | mesVenda: " + this.mesVenda;
    }
}
