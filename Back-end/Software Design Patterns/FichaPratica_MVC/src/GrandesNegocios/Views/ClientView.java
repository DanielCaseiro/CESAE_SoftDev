package GrandesNegocios.Views;

import GrandesNegocios.Controllers.ClientController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientView {
    private ClientController clientController;

    public ClientView() throws FileNotFoundException {
        this.clientController = new ClientController();
    }

    public void clientMenu(){

        Scanner input = new Scanner(System.in);
        int opcaoCliente;

        do {

            System.out.println("\n\n********** MENU CLIENTE **********");
            System.out.println("1. Consultar Produtos Disponíveis");
            System.out.println("2. Consultar Produtos p/ Categoria");
            System.out.println("3. Consultar Produto Mais Barato / Mais Caro");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcaoCliente= input.nextInt();

            switch (opcaoCliente){
                case 1: // Consultar Produtos Disponíveis
                    clientController.consultaProdutosdisponiveis();
                    break;

                case 2 : // Consultar Produtos p/ Categoria
                    clientController.consultarProdutosCategoria();
                    break;

                case 3: // Consultar Produto Mais Barato / Mais Caro
                    clientController.consultarProdutoMaisCaroBarato();
                    break;

                case 0: // Voltar
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        }while (opcaoCliente!=0);
    }
}
