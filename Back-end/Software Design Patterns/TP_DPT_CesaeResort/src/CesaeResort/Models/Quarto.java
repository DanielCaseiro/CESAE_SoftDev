package CesaeResort.Models;

public class Quarto {
    // Atributos
    private int numQuarto;
    private int idTipologia;

    // Construtor
    public Quarto(int numQuarto, int idTipologia) {
        this.numQuarto = numQuarto;
        this.idTipologia = idTipologia;
    }

    // Metodos
    public int getNumQuarto() {
        return numQuarto;
    }

    public int getIdIipologia() {
        return idTipologia;
    }


    @Override
    public String toString() {
        return
                "\nnumQuarto: " + this.numQuarto +
                " | idTipologia: " + this.idTipologia;

    }
}
