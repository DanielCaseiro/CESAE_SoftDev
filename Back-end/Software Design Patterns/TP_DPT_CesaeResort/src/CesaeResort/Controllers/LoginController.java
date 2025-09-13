package CesaeResort.Controllers;

import CesaeResort.Models.User;
import CesaeResort.Repositories.UsersRepository;

import java.io.FileNotFoundException;

public class LoginController {
    // Atributos
    private UsersRepository usersRepository;

    // Construtor
    public LoginController() throws FileNotFoundException {
        this.usersRepository = new UsersRepository();
    }

    // Metodos

    /**
     * Metodo que confere o username e a senha fornecidos para validar o login e
     * em seguida identifica o tipo de acesso do usuario
     * @param usernameInput String que representa o nome do usuário
     * @param passwordInput String que representa a pass do usuário
     * @return Retorna uma string que representa o tipo de acesso do usuário
     */
    public String validateLogin(String usernameInput, String passwordInput){

        for(User userAtual : this.usersRepository.getUserArray()){
            if(userAtual.getUsername().equals(usernameInput) && userAtual.getPassword().equals(passwordInput)){
                // Encontramos o match (username e password)
                return userAtual.getTipoAcesso();
            }
        }

        return "ERROR";

    }

}
