package FichaPratica02;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero1, numero2;

        // Ler o numero1
        System.out.print("Por favor, introduza o primeiro número: ");
        numero1 = input.nextInt();

        // Ler o numero2
        System.out.print("Por favor, introduza o segundo número: ");
        numero2 = input.nextInt();

        // Apresentar o maior número
        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        }
        else {
            System.out.println("O maior número é: " + numero2);
        }

    }
}
