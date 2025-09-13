package FichaPratica05;

import java.util.Scanner;

public class ExExtra03 {

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int [] vetor = new int[3];
        int numero;
        boolean encontrado = false;

        // Ler valores do vetor

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um valor na posição [" + i + "] do vetor: ");
            vetor[i] = input.nextInt();
        }

        // Imprimir os valores do vetor na ordem de inserção

        System.out.println("--- VETOR ---");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
        }

        System.out.println(" ");

        // ler o numero a pesquisar
        System.out.print("Insira um numetro a pesquisar: ");
        numero = input.nextInt();

        // Verificar se o numero encontra-se no vetor
        for (int i = 0; i < vetor.length; i++ ) {
            if (vetor[i] == numero) {
                System.out.println("O numero " + numero + " encontra-se no vetor na posição " + i);
                encontrado = true;
            }
        }

        if (encontrado == false) {
            System.out.print("O numero " + numero + " não se encontra no vetor");
        }

    }

}
