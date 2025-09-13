package FichaPratica02;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        // Criação do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variáveis
        int numero;

        // Ler o numero
        System.out.print("Introduz um numero: ");
        numero = input.nextInt();

        // Apresentar se o numero é par ou impar
        if (numero % 2 == 0) {
            System.out.println("O número é par");
        }
        else {
            System.out.println("O número é impar");
        }

    }
}
