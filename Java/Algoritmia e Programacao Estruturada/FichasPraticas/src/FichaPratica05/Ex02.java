package FichaPratica05;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int [] vetor = new int[12];
        int soma = 0;

        // Ler valores do vetor

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor o valor da comissão do mês " + (i+1) + ": ");
            vetor[i] = input.nextInt();
        }

        // Calcular e imprimir a soma dos valores do vetor

        for (int j = 0; j < vetor.length; j++) {
            soma = soma + vetor[j];
        }

        System.out.println("O total anual das comissões é " + soma);


    }

}
