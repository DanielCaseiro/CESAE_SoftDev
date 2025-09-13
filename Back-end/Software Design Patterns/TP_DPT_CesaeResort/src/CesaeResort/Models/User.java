package CesaeResort.Models;

public class User {
    // Atributos
    private String tipoAcesso;
    private String username;
    private String password;

    // Construtor
    public User(String tipoAcesso, String username, String password) {
        this.tipoAcesso = tipoAcesso;
        this.username = username;
        this.password = password;
    }

    // Metodos
    public String getTipoAcesso() {
        return tipoAcesso;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return
                "\ntipoAcesso: " + this.tipoAcesso +
                " | username: " + this.username +
                " | password: " + this.password;
    }
}
