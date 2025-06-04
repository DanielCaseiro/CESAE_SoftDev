package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex03.*;

public class Ex04 {

    // ANALISE DE UM NÚMERO

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, opcao;

        // Ler o numero
        System.out.println(" ");
        System.out.print("Insira um número: ");
        numero = input.nextInt();

        // Mostrar opções e resultados

        System.out.println(" ");
        System.out.println("====== PROGRAMA DE ANÁLISE DE UM NÚMERO ======");

        do {

            System.out.println(" ");
            System.out.println("Para saber se o número " + numero + " é:");
            System.out.println(" ");
            System.out.println("====== MENU ======");
            System.out.println("1. Par ou Impar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Não Primo");
            System.out.println("4. Perfeito ou Não Perfeito");
            System.out.println("5. Triangular ou Não Triangular");
            System.out.println("6. Trocar de Número");
            System.out.println("0. Encerrar o programa.");

            System.out.println(" ");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();


            switch (opcao) {

                case 1:

                    if (parOuImpar(numero)) {
                        System.out.println(" ");
                        System.out.println("O numero " + numero + " é par");
                    } else {
                        System.out.println(" ");
                        System.out.println("O numero " + numero + " é impar");
                    }

                    break;

                case 2:

                    if (positivoOuNeg(numero)) {
                        System.out.println(" ");
                        System.out.println("O numero " + numero + " é positivo");
                    } else {
                        System.out.println(" ");
                        System.out.println("O numero " + numero + " é negativo");
                    }

                    break;

                case 3:

                    if (primo(numero)) {
                        System.out.println(" ");
                        System.out.println("O numero " + numero + " é primo");
                    } else {
                        System.out.println(" ");
                        System.out.println("O numero " + numero + " não é primo");
                    }

                    break;

                case 4:

                    if (perfeito(numero)) {
                        System.out.println(" ");
                        System.out.println("O numero " + numero + " é perfeito");
                    } else {
                        System.out.println(" ");
                        System.out.println("O numero " + numero + " não é perfeito");
                    }

                    break;

                case 5:

                    if (triangular(numero)) {
                        System.out.println(" ");
                        System.out.println("O numero " + numero + " é triangular");
                    } else {
                        System.out.println(" ");
                        System.out.println("O numero " + numero + " não é triangular");
                    }

                    break;

                case 6:

                    System.out.println(" ");
                    System.out.print("Insira um novo número: ");
                    numero = input.nextInt();

                    break;

                case 0:

                    System.out.println(" ");
                    System.out.print("Análise do número encerrada.");

                    break;

                default:
                    System.out.println(" ");
                    System.out.println("Opção inválida;");
            }


        } while (opcao != 0);



    }
}
