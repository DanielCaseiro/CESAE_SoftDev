package CesaeResort.Models;

public abstract class Pessoa {
    // Atributos
    private String id;
    private String nome;
    private String nacionalidade;
    private String email;
    private String telemovel;

    // Construtor
    public Pessoa(String id, String nome, String nacionalidade, String email, String telemovel) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.email = email;
        this.telemovel = telemovel;
    }


    // Metodos
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getEmail() {
        return email;
    }

    public String getTelemovel() {
        return telemovel;
    }

    @Override
    public String toString() {
        return
                "\nid:" + this.id +
                " | nome: " + this.nome +
                " | nacionalidade: " + this.nacionalidade  +
                " | email: " + this.email +
                " | telemóvel: " + this.telemovel;
    }
}
