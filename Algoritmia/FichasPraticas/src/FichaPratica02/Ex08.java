package FichaPratica02;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        // Criação do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double nota1, nota2, nota3, mediaP;

        // Ler nota1
        System.out.print("Por favor, introduza a primeira nota: ");
        nota1 = input.nextDouble();

        while (nota1 < 0) {
            System.out.print("Nota inválida. Por favor, introduza uma nota entre 0 e 20 valores: ");
            nota1 = input.nextDouble();
        }

        while (nota1 > 20) {
            System.out.print("Nota inválida. Por favor, introduza uma nota entre 0 e 20 valores: ");
            nota1 = input.nextDouble();
        }

        // Apresentar  a nota 1
        System.out.println("Sua primeira nota é " + nota1);

        // Ler nota2
        System.out.print("Por favor, introduza a segunda nota: ");
        nota2 = input.nextDouble();

        while (nota2 < 0) {
            System.out.print("Nota inválida. Por favor, introduza uma nota entre 0 e 20 valores: ");
            nota2 = input.nextDouble();
        }

        while (nota2 > 20) {
            System.out.print("Nota inválida. Por favor, introduza uma nota entre 0 e 20 valores: ");
            nota2 = input.nextDouble();
        }

        // Apresentar  a nota 2
        System.out.println("Sua segunda nota é " + nota2);


        // Ler nota3
        System.out.print("Por favor, introduza a terceira nota: ");
        nota3 = input.nextDouble();

        while (nota3 < 0) {
            System.out.print("Nota inválida. Por favor, introduza uma nota entre 0 e 20 valores: ");
            nota3 = input.nextDouble();
        }

        while (nota3 > 20) {
            System.out.print("Nota inválida. Por favor, introduza uma nota entre 0 e 20 valores: ");
            nota3 = input.nextDouble();
        }

        // Apresentar  a nota 3
        System.out.println("Sua terceira nota é " + nota3);

        // Calcular a média ponderada
        mediaP = nota1*0.25 + nota2*0.35 + nota3*0.40;

        // Apresentar a média final
        System.out.printf("Sua média ponderada é: %.2f\n", mediaP);

        // Dizer se está aprovado ou não
        if (mediaP >= 9.5) {
            System.out.println("Parabéns! Está aprovado.");
        } else {
            System.out.println("Infelizmente não foste aprovado.");
        }

    }

}
