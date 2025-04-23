package FichaPratica02;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int lugar, pontos;

        // Ler o lugar
        System.out.print("Introduza o seu lugar na corrida: ");
        lugar = input.nextInt();

        // Calcular os pontos
        if (lugar <= 3)
            pontos = (10 - 2 * lugar) + 2;
        else if (lugar <= 8) {
            pontos = 10 - lugar - 1;
        } else {
            pontos = 0;
        }

        // Apresentar os pontos
        if (pontos > 0) {
            System.out.println("Você ganhou " + pontos);
        } else {
            System.out.println("Você não ganhou pontos");
        }

    }
}

        // Resolução com switch case

        /*

        switch (lugar) {

                case 1:
                System.out.println("Você ganhou 10 pontos");
                break;

                case 2:
                System.out.println("Você ganhou 8 pontos");
                break;

                case 3:
                System.out.println("Você ganhou 6 pontos");
                break;

                case 4:
                System.out.println("Você ganhou 5 pontos");
                break;

                case 5:
                System.out.println("Você ganhou 4 pontos");
                break;

                case 6:
                System.out.println("Você ganhou 3 pontos");
                break;

                case 7:
                System.out.println("Você ganhou 2 pontos");
                break;

                case 8:
                System.out.println("Você ganhou 1 pontos");
                break;

                default:
                System.out.println("Você não ganhou pontos");
                break;

        }

        // Na frente do case deve colocar exatamente o imput do utilizador.
        Ex: case 1, case "A", Case "+"

*/
