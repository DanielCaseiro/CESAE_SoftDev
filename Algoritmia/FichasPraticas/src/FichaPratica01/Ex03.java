package FichaPratica01;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int altura, largura, perimetro, area;

        // Ler altura
        System.out.print("Por favor, introduza a altura do retângulo: ");
        altura = input.nextInt();

        // Ler largura
        System.out.print("Por favor, introduza a largura do retângulo: ");
        largura = input.nextInt();

        // Calcular o perímetro
        perimetro = 2*altura + 2*largura;

        // Apresentar o perímetro
        System.out.println("Perímetro: " + perimetro);

        // Calcular a area
        area = altura*largura;

        // Apresentar a área
        System.out.println("Área: " + area);


    }
}
