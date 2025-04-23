package FichaPratica02;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        // Criação do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        // Ler opção
        System.out.println("===== MENU =====");
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = input.nextInt();

        // Apresentar resultado
        if (opcao == 1) {
            System.out.println("Opção 1 selecionada.");
        } else if (opcao == 2) {
            System.out.println("Opção 2 selecionada.");
        } else if (opcao == 3) {
            System.out.println("Opção 3 selecionada.");
        } else if (opcao < 1 || opcao > 4) {
            System.out.println("Opção inválida.");
        } else {

        }
    }
}
