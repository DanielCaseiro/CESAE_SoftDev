package FichaPratica02;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        // Criação do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double numero1, numero2, numero3;

        // Ler numero1
        System.out.print("Por favor, informe o primeiro número: ");
        numero1 = input.nextDouble();

        // Ler numero2
        System.out.print("Por favor, informe o segundo número: ");
        numero2 = input.nextDouble();

        // Ler numero3
        System.out.print("Por favor, informe o terceiro número: ");
        numero3 = input.nextDouble();

        // Apresentar resultados
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
    }
}
