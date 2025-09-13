package CesaeResort.Views;

import CesaeResort.Controllers.AdminController;
import CesaeResort.Controllers.LoginController;
import CesaeResort.Models.Tipologia;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdminView {
    // Atributos
    private AdminController adminController;

    // Construtor
    public AdminView() throws FileNotFoundException {
        this.adminController = new AdminController();
    }

    // Metodos (Menus)

    /**
     * Metodo que cria o menu do administrador
     * @throws FileNotFoundException Caso algum ficheiro não seja encontrado.
     */
    public void adminMenu() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcaoAdmin;

        do {

            System.out.println("\n\n********** MENU ADMIN **********");
            System.out.println("1. Consultar Total de Reservas");
            System.out.println("2. Consultar Total de Receitas");
            System.out.println("3. Consultar Receitas Mensais");
            System.out.println("4. Consultar Tipologia de Quarto Mais Reservada");
            System.out.println("5. Consultar Experiência Mais Procurada (Adultos)");
            System.out.println("6. Consultar Experiência Mais Procurada (Crianças)");
            System.out.println("7. Consultar Experiência Mais Lucrativa");
            System.out.println("8. Consultar Experiência Menos Lucrativa");
            System.out.println("9. Consultar Quarto com Melhor Preço/Semana");
            System.out.println("10. Adicionar Novo Login");

            System.out.println("0. Voltar");

            System.out.print("\nOpção: ");
            opcaoAdmin= input.nextInt();

            switch (opcaoAdmin){
                case 1: // Número total de reservas (passadas e futuras)
                    System.out.println("\n***** Total de Reservas *****");
                    System.out.println(this.adminController.totalReservas());
                    break;

                case 2: // Soma de preco_por_semana (quartos) + preços de bilhetes (experiências)
                    System.out.println("\n***** Total de Receitas *****");
                    System.out.println(this.adminController.totalReceitas() + "€");

                    System.out.println("\nfuncionalidade ainda em desenvolvimento...");

                    break;


                case 3: // Consultar Receitas Mensais (Pergunta ano e mês, e apresenta as receitas desse mês)
                    int anoPesquisar, mesPesquisar;

                    System.out.println("\n***** Receitas Mensais *****");

                    do{

                        System.out.print("\nInforme o ano a pesquisar: ");
                        anoPesquisar= input.nextInt();

                        System.out.print("\nInforme o mês a pesquisar: ");
                        mesPesquisar= input.nextInt();

                        if(anoPesquisar < 0 || anoPesquisar > 2025 || mesPesquisar < 1 || mesPesquisar > 12) {
                            System.out.print("\nValores inválidos.");
                        } else {
                            break;
                        }


                    }while (true);

                    System.out.println("\nO valor total das receitas (reservas de quartos + vendas de bilhetes) no mês " + mesPesquisar + " do ano " + anoPesquisar  +" é:");
                    System.out.println(this.adminController.receitaMensal(anoPesquisar, mesPesquisar) + "€");


                    break;


                case 4: // Consultar Tipologia de Quarto Mais Reservada

                    System.out.println("\n***** Tipologia de Quarto Mais Reservada *****");

                    Tipologia tipologiaMaisReservada = this.adminController.tipologiaMaisReservada();

                    System.out.println(tipologiaMaisReservada);

                    System.out.println("\nfuncionalidade ainda em desenvolvimento...");

                    break;

                case 5: // Consultar Experiência Mais Procurada (Adultos) – Número de bilhetes vendidos
                    System.out.println("\n***** Experiência Mais Procurada (Adultos) *****");
                    System.out.println(this.adminController.experienciaMaisProcuradaAdultos());

                    System.out.println("\nfuncionalidade ainda em desenvolvimento...");


                    break;

                case 6: // Consultar Experiência Mais Procurada (Crianças) – Número de bilhetes vendidos
                    System.out.println("\n***** Experiência Mais Procurada (Crianças) *****");
                    System.out.println(this.adminController.experienciaMaisProcuradaCriancas());

                    System.out.println("\nfuncionalidade ainda em desenvolvimento...");

                    break;

                case 7: // Consultar Experiência Mais Lucrativa – Valor total arrecadado
                    System.out.println("\n***** Experiência Mais Lucrativa *****");
                    System.out.println(this.adminController.experienciaMaisLucrativa());

                    System.out.println("\nfuncionalidade ainda em desenvolvimento...");

                    break;

                case 8: // Consultar Experiência Menos Lucrativa – Valor total arrecadado
                    System.out.println("\n***** Experiência Menos Lucrativa *****");
                    System.out.println(this.adminController.experienciaMenosLucrativa());

                    System.out.println("\nfuncionalidade ainda em desenvolvimento...");

                    break;

                case 9: // Consultar Quarto com Melhor Preço/Semana
                    System.out.println("\n***** Quarto com Melhor Preço/Semana *****");
                    System.out.println(this.adminController.quartoMelhorPrecoSemana());

                    System.out.println("\nfuncionalidade ainda em desenvolvimento...");

                    break;

                case 10: // Adicionar Novo Login
                    String novoNome, novaPassword, tipoAcesso;
                    System.out.println("\n***** Adicionar Novo Login *****");

                    System.out.print("\nInforme o nome do novo usuário: ");
                    novoNome = input.next();

                    System.out.print("\nInforme a password do novo usuário: ");
                    novaPassword = input.next();

                    System.out.print("\nInforme o tipo de acesso do novo usuário: ");
                    tipoAcesso= input.next();

                    boolean novoLoginAdicionado = this.adminController.adicionarNovoLogin(novoNome,novaPassword,tipoAcesso);

                    if(novoLoginAdicionado){
                        System.out.println("\nNovo login adicionado com sucesso!");
                    } else{
                        System.out.println("\nNovo login não adicionado.");
                    }

                    System.out.println("\nfuncionalidade ainda em desenvolvimento...");

                    break;

                case 0:
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        }while (opcaoAdmin!=0);


    }
}
