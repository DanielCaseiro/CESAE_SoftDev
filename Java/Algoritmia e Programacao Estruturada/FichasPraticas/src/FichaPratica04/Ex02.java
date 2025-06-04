package FichaPratica04;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;


        // Criar o menu com do... while e ler a opção

        do {
            System.out.println("======== MENU ========");
            System.out.println("1 - Criar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Eliminar");
            System.out.println("4 - Sair");
            System.out.print("Insira uma opção: ");
            opcao = input.nextInt();
            switch (opcao) {
                case 1: System.out.println("Criando...");
                    break;
                case 2: System.out.println("Atualizando...");
                    break;
                case 3 : System.out.println("Eliminando...");
                    break;
                case 4 : System.out.println("Saindo...");
                    break;
                default: System.out.println("Opção Inválida!");
            }
        } while (opcao != 4);



    }

}
