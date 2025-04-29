package FichaPratica02;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {

        // Criação do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor, notas_200, notas_100, notas_50, notas_20, notas_10, notas_5;

        // Ler o valor
        System.out.print("Notas disponíveis: 200, 100, 50, 20,10, 5.");
        System.out.print("Informe o valor do saque: ");
        valor = input.nextInt();

        // Validar a operação
        if (valor % 5 != 0) {
            System.out.print("Operação inválida");
        } else {
            // Calcular o resultado

            notas_200 = valor / 200;
            notas_100 = (valor - notas_200*200) / 100;
            notas_50 = (valor - notas_200*200 - notas_100*100) / 50;
            notas_20 = (valor - notas_200*200 - notas_100*100 - notas_50*50) / 20;
            notas_10 = (valor - notas_200*200 - notas_100*100 - notas_50*50 - notas_20*20) / 10;
            notas_5 = (valor - notas_200*200 - notas_100*100 - notas_50*50 - notas_20*20 - notas_10*10) / 5;

            // Apresentar o reultado
            System.out.println("Saque de " + valor + "euros");
            System.out.println("notas de 200: " + notas_200);
            System.out.println("notas de 100: " + notas_100);
            System.out.println("notas de 50: " + notas_50);
            System.out.println("notas de 20: " + notas_20);
            System.out.println("notas de 10: " + notas_10);
            System.out.println("notas de 5: " + notas_5);
        }


    }
}

// Solução professor:
//      Usar só uma variável notas.
//      Depois de cada calculo, imprimir o valor e  atualizar as variáveis valor e notas
//      notas de 200 são valor/200, depois print(notas), depois valor = valor % 200

/*

Solução ChatGPT:


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ler valor
        System.out.print("Introduza um valor em euros (múltiplo de 5): ");
        int valor = input.nextInt();

        if (valor % 5 != 0 || valor <= 0) {
            System.out.println("O valor deve ser positivo e múltiplo de 5.");
        } else {

            // Guardar o valor original para exibir depois
            int valorOriginal = valor;

            // Cálculo das notas
            int notas200 = valor / 200;
            valor %= 200;
            // valor%= 200 é o mesmo que valor = valor % 200

            int notas100 = valor / 100;
            valor %= 100;

            int notas50 = valor / 50;
            valor %= 50;

            int notas20 = valor / 20;
            valor %= 20;

            int notas10 = valor / 10;
            valor %= 10;

            int notas5 = valor / 5;
            valor %= 5;

            // Exibir resultado
            System.out.println("\nValor introduzido: €" + valorOriginal);
            System.out.println("Notas necessárias:");
            if (notas200 > 0) System.out.println("Notas de 200: " + notas200);
            if (notas100 > 0) System.out.println("Notas de 100: " + notas100);
            if (notas50 > 0) System.out.println("Notas de 50: " + notas50);
            if (notas20 > 0) System.out.println("Notas de 20: " + notas20);
            if (notas10 > 0) System.out.println("Notas de 10: " + notas10);
            if (notas5 > 0) System.out.println("Notas de 5: " + notas5);
        }

        input.close();
    }
}

*/
