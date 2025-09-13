package CesaeResort.Models;

public class Tipologia {
    // Atributos
    private int idTipologia;
    private String descricaoTipologia;
    private double precoPorSemana;

    // Construtor
    public Tipologia(int idTipologia, String descricaoTipologia, double precoPorSemana) {
        this.idTipologia = idTipologia;
        this.descricaoTipologia = descricaoTipologia;
        this.precoPorSemana = precoPorSemana;
    }


    // Metodos
    public int getIdTipologia() {
        return idTipologia;
    }

    public String getDescricaoTipologia() {
        return descricaoTipologia;
    }

    public double getPrecoPorSemana() {
        return precoPorSemana;
    }

    @Override
    public String toString() {
        return
                "\nidTipologia=" + this.idTipologia +
                " | descricaoTipologia: " + this.descricaoTipologia +
                " | precoPorSemana: " + this.precoPorSemana;
    }

}
