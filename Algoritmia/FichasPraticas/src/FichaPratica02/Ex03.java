package FichaPratica02;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double salario, imposto;

        // Ler o salário
        System.out.print("Por favor, introduza o salário: ");
        salario = input.nextDouble();

        // Calcular o imposto
        if (salario <= 15000) {
            imposto = salario * 0.2;
        } else if (salario > 15000 && salario <= 20000) {
            imposto = salario*0.3;
        } else if (salario > 20000 && salario <= 25000) {
            imposto = salario*0.35;
        } else {
            imposto = salario * 0.4;
        }

        // Apresentar o imposto a ser pago
        System.out.println("O imposto a ser pago é: " + imposto);

    }
}
