package FichaPratica02;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {

        // Criação do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double saldo, credito;

        // Ler o saldo médio
        System.out.print("Informe o saldo: ");
        saldo = input.nextDouble();

        // Calcular o crédito especial
        if (saldo <= 2000) {
            credito = 0;
        } else if (saldo > 2000 && saldo <= 4000) {
            credito = 0.2*saldo;
        } else if (saldo > 4000 && saldo <= 6000) {
            credito = 0.3*saldo;
        } else {
            credito = 0.4*saldo;
        }


        // Apresentar resultados
        System.out.println("Seu saldo é de: " + saldo);
        System.out.print("Seu crédito é de: " + credito);

    }
}
