package FichaPratica02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double salario, imposto;

        // Ler o salário
        System.out.print("Por favor, introduza o salário: ");
        salario = input.nextDouble();

        // Calcular o imposto e apresentar o valor a ser pago
        if (salario <= 1500) {
            imposto = salario * 0.2;
            System.out.println("O imposto a ser pago é de 20%: " + imposto);
        }
        else {
            imposto = salario * 0.3;
            System.out.println("O imposto a ser pago é de 30%: " + imposto);
        }

    }
}
