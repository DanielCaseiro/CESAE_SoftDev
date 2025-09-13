package CesaeResort.Views;



import CesaeResort.Controllers.ClientController;
import CesaeResort.Models.Quarto;
import CesaeResort.Models.Tipologia;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClientView {
    // Atributos
    private ClientController clientController;

    // Construtor
    public ClientView() throws FileNotFoundException {
        this.clientController = new ClientController();
    }

    // Metodos (Menus)

    /**
     * Metodo que cria o menu do cliente
     * @throws FileNotFoundException Caso algum ficheiro não seja encontrado
     */
    public void clientMenu() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcaoCliente;

        do {


            System.out.println("\n\n********** MENU CLIENTE **********");
            System.out.println("1. Consultar Quartos Disponíveis");
            System.out.println("2. Consultar Experiências Disponíveis");
            System.out.println("3. Consultar Experiência Favorita");
            System.out.println("4. Consultar Experiência Top-Seller");
            System.out.println("5. Avaliar uma Experiência");
            System.out.println("0. Voltar");

            System.out.print("\nOpção: ");
            opcaoCliente = input.nextInt();


            switch (opcaoCliente){
                case 1: // Consultar Quartos Disponíveis:
                    // Imprime em formato tabelar num_quarto, tipologia, preco_por_semana

                    System.out.println("\n***** Quartos Disponíveis esta semana *****");

                    HashMap<Quarto, Tipologia> mapaQuartosDisponiveis = this.clientController.consultarQuartosDisponiveis();

                    // Verificar se há resultados
                    if (mapaQuartosDisponiveis.isEmpty()) {
                        System.out.println("\nNão há nenhum quarto disponível nesta semana.");
                    } else {

                        // Criar  e imprimir o cabeçalho da tabela
                        System.out.println("\nNumQuarto" +  " | " +  "Tipologia" +  " | " + "Preço por Semana");
                        System.out.println("-----------------------------------------------------------------------");

                        // Iterar o mapa e imprimir os objetos
                        for (Map.Entry<Quarto, Tipologia> entry : mapaQuartosDisponiveis.entrySet()) {
                            Quarto quarto = entry.getKey();
                            Tipologia tipologia = entry.getValue();

                            System.out.println(quarto.getNumQuarto() + " | " + tipologia.getDescricaoTipologia() + " | " + tipologia.getPrecoPorSemana());

                        }

                    }


                    break;

                case 2: // Consultar Experiências Disponíveis:
                    // Imprime em formato tabelar, nome, rating_experiencia, nome do guia, rating_guia, preco_adulto, preco_crianca.

                    System.out.println("\n***** Consultar Experiências Disponíveis *****");
                    System.out.println(this.clientController.consultarExperienciasDisponiveis());

                    System.out.println("\nfuncionalidade ainda em desenvolvimento...");

                    break;

                case 3: // Consultar Experiência Favorita: Indica a experiência com melhor rating.

                    System.out.println("\n***** Consultar Experiência Favorita *****");
                    System.out.println(this.clientController.consultarExperienciaFavorita());

                    System.out.println("\nfuncionalidade ainda em desenvolvimento...");

                    break;

                case 4: // Consultar Experiência Top-Seller: Indica a experiência com mais bilhetes vendidos.

                    System.out.println("\n***** Consultar Experiência Top-Seller *****");
                    System.out.println(this.clientController.experienciaTopSeller());

                    System.out.println("\nfuncionalidade ainda em desenvolvimento...");

                    break;

                case 5: // Avaliar uma Experiência:
                    // Permite escolher uma experiência, seguidamente, pergunta o rating da experiência e o rating do guia.

                    String nomeExperiencia;
                    int ratingExperiencia, ratingGuia;

                    System.out.println("\n***** Avaliar uma Experiência *****");

                    System.out.print("\nInforme o nome da Experiencia: ");
                    input.nextLine(); // limpar o buffer
                    nomeExperiencia = input.nextLine();

                    System.out.print("\nInforme o rating que quer atribuir à Experiência: ");
                    ratingExperiencia = input.nextInt();

                    System.out.print("\nInforme o rating que quer atribuir ao Guia: ");
                    ratingGuia = input.nextInt();

                    boolean avaliarExperiencia = this.clientController.avaliarExperiencia(nomeExperiencia, ratingExperiencia, ratingGuia);

                    if(avaliarExperiencia){
                        System.out.println("\navaliação realizada com sucesso!");
                    } else{
                        System.out.println("\nERROR. Avaliação não realizada.");
                    }

                    System.out.println("\nfuncionalidade ainda em desenvolvimento...");


                    break;

                case 0:
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        }while (opcaoCliente!=0);


    }

}
