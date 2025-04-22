package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double raio, area;

        // Ler raio
        System.out.print("Por favor, introduza o raio da circunferência: ");
        raio = input.nextDouble();


        // Calcular a area
        area = 3.14*raio*raio;

        // Apresentar a area da circunferência
        System.out.println("Área: " + area);

    }
}
