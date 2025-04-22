package FichaPratica01;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double preco1, preco2, preco3, total;

        // Ler preco1
        System.out.print("Introduz o preço do primeiro produto: ");
        preco1 = input.nextDouble();

        // Ler preco2
        System.out.print("Introduz o preço do segundo produto: ");
        preco2 = input.nextDouble();

        // Ler preco3
        System.out.print("Introduz o preço do terceiro produto: ");
        preco3 = input.nextDouble();

        // Calcular o valor final a pagar com desconto de 10%
        total = (preco1 + preco2 + preco3)*0.9;

        // Apresentar o valor final a pagar com desconto de 10%
        System.out.println("O valor total a pagar com desconto de 10% é: " + total);

    }

}
