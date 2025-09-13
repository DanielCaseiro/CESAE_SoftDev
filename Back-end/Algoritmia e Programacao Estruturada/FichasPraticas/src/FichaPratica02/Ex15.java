package FichaPratica02;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        // Criação do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double numero1, numero2, numero3;
        String opcao;

        // Ler numero1
        System.out.print("Por favor, informe o primeiro número: ");
        numero1 = input.nextDouble();

        // Ler numero2
        System.out.print("Por favor, informe o segundo número: ");
        numero2 = input.nextDouble();

        // Ler numero3
        System.out.print("Por favor, informe o terceiro número: ");
        numero3 = input.nextDouble();

        // Ler opção
        System.out.print("Por favor, informe a opção de ordenação dos números. Carregue C para crescente ou D para decrescente:  ");
        opcao = input.next();

        // Apresentar resultados
        switch (opcao) {

            case "C":
                if ( numero1 < numero2 && numero2 < numero3) {
                    System.out.print(numero1 + " " + numero2 + " " + numero3);
                } else if (numero1 < numero3 && numero3 < numero2) {
                    System.out.print(numero1 + " " + numero3 + " " + numero2);
                } else if (numero2 < numero1 && numero1 < numero3) {
                    System.out.print(numero2 + " " + numero1 + " " + numero3);
                } else if (numero2 < numero3 && numero3 < numero1) {
                    System.out.print(numero2 + " " + numero3 + " " + numero1);
                } else if (numero3 < numero2 && numero2 < numero1) {
                    System.out.print(numero3 + " " + numero2 + " " + numero1);
                } else if (numero3 < numero1 && numero1 < numero2) {
                    System.out.print(numero3 + " " + numero1 + " " + numero2);
                } else {
                    System.out.println("Existem números iguais.");
                }
                break;

            case "D":
                if ( numero1 > numero2 && numero2 > numero3) {
                    System.out.print(numero1 + " " + numero2 + " " + numero3);
                } else if (numero1 > numero3 && numero3 > numero2) {
                    System.out.print(numero1 + " " + numero3 + " " + numero2);
                } else if (numero2 > numero1 && numero1 > numero3) {
                    System.out.print(numero2 + " " + numero1 + " " + numero3);
                } else if (numero2 > numero3 && numero3 > numero1) {
                    System.out.print(numero2 + " " + numero3 + " " + numero1);
                } else if (numero3 > numero2 && numero2 > numero1) {
                    System.out.print(numero3 + " " + numero2 + " " + numero1);
                } else if (numero3 > numero1 && numero1 > numero2) {
                    System.out.print(numero3 + " " + numero1 + " " + numero2);
                } else {
                    System.out.println("Existem números iguais.");
                }
                break;

            default:
                System.out.println("Erro");
                break;
        }







    }
}
