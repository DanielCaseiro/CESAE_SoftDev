package CesaeResort.Models;

public class Experiencia {
    // Atributos
    private String idExperiencia;
    private String nome;
    private String idGuiaExperiencia;
    private double precoAdulto;
    private double precoCrianca;

    // Construtor
    public Experiencia(String idExperiencia, String nome, String idGuiaExperiencia, double precoAdulto, double precoCrianca) {
        this.idExperiencia = idExperiencia;
        this.nome = nome;
        this.idGuiaExperiencia = idGuiaExperiencia;
        this.precoAdulto = precoAdulto;
        this.precoCrianca = precoCrianca;
    }

    // Metodos
    public String getIdExperiencia() {
        return idExperiencia;
    }

    public String getNome() {
        return nome;
    }

    public String getIdGuiaExperiencia() {
        return idGuiaExperiencia;
    }

    public double getPrecoAdulto() {
        return precoAdulto;
    }

    public double getPrecoCrianca() {
        return precoCrianca;
    }

    @Override
    public String toString() {
        return
                "\nidExperiencia: " + this.idExperiencia +
                " | nome: " + this.nome +
                " | idGuiaExperiencia: " + this.idGuiaExperiencia +
                " | precoAdulto: " + this.precoAdulto +
                " | precoCrianca: " + this.precoCrianca;
    }
}
