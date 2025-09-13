package CesaeResort.Views;

import CesaeResort.Controllers.RececionistaController;
import CesaeResort.Models.Quarto;
import CesaeResort.Models.Tipologia;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RececionistaView {
    // Atributos
    private RececionistaController rececionistaController;

    // Construtor
    public RececionistaView() throws FileNotFoundException {
        this.rececionistaController = new RececionistaController();
    }

    // Metodos (Menus)

    /**
     * Metodo que cria o menu do rececionista
     * @throws FileNotFoundException Caso algum ficheiro não seja encontrado
     */
    public void rececionistaMenu() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcaoRececionista;

        do {


            System.out.println("\n\n********** MENU RECECIONISTA **********");
            System.out.println("1. Consultar Quartos Disponíveis");
            System.out.println("2. Consultar Quartos Reservados");
            System.out.println("3. Consultar Reservas Atuais");
            System.out.println("4. Reservar um Quarto");
            System.out.println("5. Reservar uma Experiência");
            System.out.println("0. Voltar");

            System.out.print("\nOpção: ");
            opcaoRececionista= input.nextInt();

            switch (opcaoRececionista){
                case 1: // Consultar Quartos Disponíveis:
                    // Imprime em formato tabelar num_quarto, tipologia, preco_por_semana, que estão disponíveis na semana atual.

                    System.out.println("\n***** Quartos Disponíveis esta semana *****");

                    HashMap<Quarto, Tipologia> mapaQuartosDisponiveis = this.rececionistaController.consultarQuartosDisponiveis();

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

                case 2: // Consultar Quartos Reservados:
                    // Imprime em formato tabelar num_quarto, tipologia, idCliente, nome, email, nacionalidade, ano, mês e semana.

                    System.out.println("\n***** Consultar Quartos Reservados *****");
                    System.out.println(this.rececionistaController.consultarQuartosReservados());

                    System.out.println("\nfuncionalidade ainda em desenvolvimento...");

                    break;

                case 3: // Consultar Reservas Atuais:
                    // Imprime em formato tabelar num_quarto, tipologia, idCliente, nome, email, nacionalidade, as reservas da semana atual.

                    System.out.println("\n***** Consultar Reservas Atuais *****");

                    System.out.println("\nNumQuarto" +  " | " +  "Tipologia" +  " | " + "IdCliente" + " | " + "Nome" + " | " + "Email" + " | " + "Nacionalidade");
                    System.out.println("----------------------------------------------------------------------------");

                    ArrayList<String> infosReservasAtuais = this.rececionistaController.consultarReservasAtuais();

                    for(String infoReserva : infosReservasAtuais) {
                        System.out.println(infoReserva);
                    }



                    break;

                case 4: // Efetuar uma Reserva:
                    // Pergunta as informações como idCliente, numQuarto, ano, mês e semana.
                    // Seguidamente verifica se o quarto está disponível e, se possível, efetua a reserva.

                    String idClienteReservaQuarto;
                    int numQuarto, anoQuarto, mesQuarto, semanaQuarto;

                    System.out.println("\n***** Reservar um Quarto *****");

                    System.out.print("\nInforme o id do Cliente: ");
                    idClienteReservaQuarto = input.next();

                    System.out.print("\nInforme o numero do quarto a ser reservado: ");
                    numQuarto = input.nextInt();

                    System.out.print("\nInforme o ano da reserva: ");
                    anoQuarto = input.nextInt();

                    System.out.print("\nInforme o mes da reserva: ");
                    mesQuarto = input.nextInt();

                    System.out.print("\nInforme a semana da reserva: ");
                    semanaQuarto = input.nextInt();

                    boolean reservaQuarto = this.rececionistaController.reservarQuarto(idClienteReservaQuarto, numQuarto, anoQuarto, mesQuarto, semanaQuarto);

                    if(reservaQuarto){
                        System.out.println("\nReserva realizada com sucesso!");
                    } else{
                        System.out.println("\nReserva não realizada.");
                    }

                    System.out.println("\nfuncionalidade ainda em desenvolvimento...");

                    break;

                case 5: // Reservar uma Experiência:
                    // Pergunta as informações como idCliente e idReserva,
                    // número de adultos e número de crianças e efetua reserva de uma experiência.

                    String idClienteReservaExperiencia, idExperienciaReserva;
                    int numAdultos, numCriancas;

                    System.out.println("\n***** Reservar uma Experiência *****");

                    System.out.print("\nInforme o id do Cliente: ");
                    idClienteReservaExperiencia = input.next();

                    System.out.print("\nInforme o id da Experiência a ser reservada: ");
                    idExperienciaReserva = input.next();

                    System.out.print("\nInforme o numero de adultos: ");
                    numAdultos = input.nextInt();

                    System.out.print("\nInforme o numero de crianças: ");
                    numCriancas = input.nextInt();

                    boolean reservaExperiencia = this.rececionistaController.reservarExperiencia(idClienteReservaExperiencia, idExperienciaReserva, numAdultos, numCriancas);

                    if(reservaExperiencia){
                        System.out.println("\nReserva realizada com sucesso!");
                    } else{
                        System.out.println("\nReserva não realizada.");
                    }

                    System.out.println("\nfuncionalidade ainda em desenvolvimento...");


                    break;

                case 0:
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        }while (opcaoRececionista!=0);


    }
}
