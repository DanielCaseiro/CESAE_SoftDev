package FichaPratica02;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        // Criação do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variáveis
        double numero1, numero2;

        // Ler o numero1
        System.out.print("Introduz o numero 1: ");
        numero1 = input.nextDouble();

        // Ler o numero2
        System.out.print("Introduz o numero 2: ");
        numero2 = input.nextDouble();

        // Apresentar o menor depois o maior
        if (numero1 > numero2) {
            System.out.println("O maior número é " + numero1 + " e o menor número é " + numero2);
        }
        else {
            System.out.println("O maior número é " + numero2 + " e o menor número é " + numero1);
        }

    }
}
