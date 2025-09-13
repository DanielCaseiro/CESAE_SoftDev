package CesaeResort.Models;

public class Rating {
    // Atributos
    private String idRating;
    private String idExperiencia;
    private int ratingExperiencia;
    private int ratingGuia;

    // Construtor
    public Rating(String idRating, String idExperiencia, int ratingExperiencia, int ratingGuia) {
        this.idRating = idRating;
        this.idExperiencia = idExperiencia;
        this.ratingExperiencia = ratingExperiencia;
        this.ratingGuia = ratingGuia;
    }


    // Metodos
    public String getIdRating() {
        return idRating;
    }

    public String getIdExperiencia() {
        return idExperiencia;
    }

    public double getRatingExperiencia() {
        return ratingExperiencia;
    }

    public double getRatingGuia() {
        return ratingGuia;
    }

    @Override
    public String toString() {
        return
                "\nidRating: " + this.idRating +
                " | idExperiencia: " + this.idExperiencia +
                " | ratingExperiencia: " + this.ratingExperiencia +
                " | ratingGuia: " + this.ratingGuia;
    }
}
