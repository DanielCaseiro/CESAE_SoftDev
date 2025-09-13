package FichaPratica02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        // Criação do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double saldo, valor, saldo_final;

        // Ler saldo
        System.out.print("Por favor, introduza o seu saldo: ");
        saldo = input.nextDouble();

        // Ler saldo
        System.out.print("Por favor, introduza o valor a movimentar. Utilize valores negativos para saque e valores positivos para depósito: ");
        valor = input.nextDouble();

        // Calcular o saldo final
        saldo_final = saldo + valor;

        // Validar a operação
        while (saldo_final < 0) {
            System.out.print("Operação inválida. Saldo insuficiente. Por favor, introduza o valor a movimentar: ");
            valor = input.nextDouble();
            saldo_final = saldo + valor;
        }

        // Apresentar o saldo final
        System.out.println("Saldo atual: " + saldo_final);

    }
}

/*

// Solução do professor (sem while)

        // Declarar variáveis
        double saldo, valor, saldo_final;

        // Ler saldo
        System.out.print("Por favor, introduza o seu saldo: ");
        saldo = input.nextDouble();

        // Ler saldo
        System.out.print("Por favor, introduza o valor a movimentar. Utilize valores negativos para saque e valores positivos para depósito: ");
        valor = input.nextDouble();

        // Calcular e validar a transação
        if (saldo + valor >=0) {
            saldo = saldo + valor;
            System.out.println("Trnasição efetuada.");
        } else {
            System.out.println("Transação inválida.");
        }

        // Apresentar saldo final
        System.out.println("Saldo atual: " + saldo);


 */








