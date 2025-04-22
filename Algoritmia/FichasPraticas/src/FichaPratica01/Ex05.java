package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double valor1, valor2, valor3, mediaA, mediaP;

        // Ler valor1
        System.out.print("Por favor, introduza o primeiro valor: ");
        valor1 = input.nextDouble();

        // Ler valor2
        System.out.print("Por favor, introduza o segundo valor: ");
        valor2 = input.nextDouble();

        // Ler valor3
        System.out.print("Por favor, introduza o terceiro valor: ");
        valor3 = input.nextDouble();

        // Calcular a média aritimética
        mediaA = (valor1 + valor2 + valor3) / 3;

        // Apresentar a média aritimética
        System.out.println("Média Aritimética: " + mediaA);

        // Calcular a média ponderada
        mediaP = valor1*0.2 + valor2*0.3 + valor3*0.5;

        // Apresentar a média ponderada
        System.out.println("Média Ponderada: " + mediaP);
    }
}
