package CesaeResort.Views;

import CesaeResort.Controllers.LoginController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginView {
    // Atributos
    private LoginController loginController;

    // Construtor
    public LoginView() throws FileNotFoundException {
        this.loginController = new LoginController();
    }

    // Metodos (Menus)

    /**
     * Metodo que cria o menu principal
     * @throws FileNotFoundException Caso algum ficheiro não seja encontrado.
     */
    public void mainMenu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcaoLogin;

        do {
            System.out.println("\n\n********** Bem-vindo/a ao Cesae Resort **********\n");
            System.out.println("1. Cliente");
            System.out.println("2. Staff");
            System.out.println("\n0. Terminar Programa");

            System.out.print("\n Escolha uma opção de usuário: ");
            opcaoLogin = input.nextInt();

            switch (opcaoLogin) {
                case 1:
                    // CLIENTE
                    ClientView cv = new ClientView();
                    cv.clientMenu();
                    break;

                case 2:
                    // MEMBRO DA EQUIPA
                    this.loginMenu();
                    break;

                case 0:
                    System.out.println("\nObrigado por utilizar o nosso programa... Até a próxima!");
                    break;

                default:
                    System.out.println("\nOpção Inválida");
            }
        } while (opcaoLogin != 0);
    }

    /**
     * Metodo que cria o menu de login para o staff do Resort (administradores, rececionistas e guias)
     * @throws FileNotFoundException Caso algum ficheiro não seja encontrado
     */
    public void loginMenu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        System.out.print("\nUsername: ");
        String usernameInput = input.next();

        System.out.print("Password: ");
        String passwordInput = input.next();

        String accessType = this.loginController.validateLogin(usernameInput,passwordInput);

        switch (accessType){
            case "ADMIN":
                AdminView av = new AdminView();
                av.adminMenu();
                break;

            case "GESTAO":
                RececionistaView rv = new RececionistaView();
                rv.rececionistaMenu();
                break;

            case "GUIA":
                GuiaView gv = new GuiaView();
                gv.guiaMenu(usernameInput);
                break;

            case "ERROR":
                System.out.println("Acessos inválidos");
                break;
        }

    }




}
