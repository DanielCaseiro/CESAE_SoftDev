package FichaPratica01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor1, valor2;

        // Ler valor1
        System.out.print("Por favor, introduza o primeiro valor: ");
        valor1 = input.nextInt();

        // Ler valor2
        System.out.print("Por favor, introduza o segundo valor: ");
        valor2 = input.nextInt();

        // Permutar os valores sem utilizar novas variáveis
        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;


        // Apresentar a permuta
        System.out.println("Valores permutados: valor1 = " + valor1 + " valor2 = " + valor2);

    }
}
