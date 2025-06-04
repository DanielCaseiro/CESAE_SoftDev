package FichaPratica05;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int [] vetor = new int[10];
        boolean crescente = true;


        // Ler valores do vetor

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um valor na posição [" + i + "] do vetor: ");
            vetor[i] = input.nextInt();
        }

        // Checar se a ordem é crecente
        for (int i = 0; i < vetor.length; i++) {
            if (i> 0 && vetor[i]<vetor[i-1]){
                crescente = false;
            }
        }

        // Imprimir resultado
        if(crescente) {
            System.out.print("A ordem dos valores dentro do vetor é crescente.");
        } else {
            System.out.print("A ordem dos valores dentro do vetor não é crescente.");
        }

    }
}
