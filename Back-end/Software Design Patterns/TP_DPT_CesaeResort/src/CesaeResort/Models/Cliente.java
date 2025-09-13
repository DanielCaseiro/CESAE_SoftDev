package CesaeResort.Models;

public class Cliente extends Pessoa{
    // Atributos
    private String dataNascimento;
    private boolean consentimentoMarketing;

    // Construtor
    public Cliente(String id, String nome, String nacionalidade, String email, String telemovel, String dataNascimento, boolean consentimentoMarketing) {
        super(id, nome, nacionalidade, email, telemovel);
        this.dataNascimento = dataNascimento;
        this.consentimentoMarketing = consentimentoMarketing;
    }


    // Metodos
    public String getDataNascimento() {
        return dataNascimento;
    }

    public boolean isConsentimentoMarketing() {
        return consentimentoMarketing;
    }

    @Override
    public String toString() {
        return
                "\nid:" + this.getId() +
                " | nome: " + getNome() +
                " | nacionalidade: " + getNacionalidade()  +
                " | email: " + getEmail() +
                " | telemóvel: " + getTelemovel() +
                " | dataNascimento: " + this.dataNascimento +
                " | consentimentoMarketing: " + this.consentimentoMarketing;

    }
}
