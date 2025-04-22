package FichaPratica01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor1, valor2;

        // Ler valor1
        System.out.print("Por favor, introduza o valor 1: ");
        valor1 = input.nextInt();

        // Ler valor2
        System.out.print("Por favor, introduza o valor 2: ");
        valor2 = input.nextInt();

        // Apresentar o valor1
        System.out.print("O valor 1 é: " + valor1);

        // Apresentar o valor2
        System.out.print("O valor 2 é: " + valor2);

        // Permutar os valores sem utilizar novas variáveis
        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;


        // Apresentar a permuta
        System.out.println("Valores permutados: valor1 = " + valor1 + " valor2 = " + valor2);

    }
}
