package CesaeResort.Views;

import CesaeResort.Controllers.GuiaController;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GuiaView {
    // Atributos
    private GuiaController guiaController;

    // Construtor
    public GuiaView() throws FileNotFoundException {
        this.guiaController = new GuiaController();
    }

    // Metodos (Menus)

    /**
     * Metodo que cria o menu do guia
     * @throws FileNotFoundException Caso algum ficheiro não seja encontrado
     */
    public void guiaMenu( String idGuia) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcaoGuia;

        do {


            System.out.println("\n\n********** MENU GUIA **********");
            System.out.println("1. Consultar Histórico de Experiências");
            System.out.println("0. Voltar");

            System.out.print("\nOpção: ");
            opcaoGuia = input.nextInt();


            switch (opcaoGuia){
                case 1: // Consultar Histórico de Experiências:
                    // Apresenta todas as experiências que são da sua responsabilidade,
                    //apresentado total de adultos e crianças inscritas, assim como o valor total arrecadado.

                    System.out.println("\n***** Consultar Histórico de Experiências *****");

                    System.out.println("\nExperiência" +  " | " +  "Total Bilhetes Adultos" +  " | " + "Total Bilhetes Crianças" + " | " + "Total Arrecadado");
                    System.out.println("---------------------------------------------------------------------------------");

                    ArrayList<String> historicoExperiencias = this.guiaController.consultarHistoricoExperiencias(idGuia);

                    for(String infoExperienciaGuia : historicoExperiencias) {
                        System.out.println(infoExperienciaGuia);
                    }

                    break;

                case 0:
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        }while (opcaoGuia!=0);



    }
}
