package FichaPratica05;

import java.util.Scanner;

public class ExExtra05 {

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int [] vetor = new int[6];
        int [] vetorResposta = new int[vetor.length];
        boolean existente = false;


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

        // encontrar os valores duplicados no vetor original e coloca-los no vetorResposta

        System.out.println("-----------------------------------------------");



        int k = 0;

        for (int i = 0; i < vetor.length; i++) {
            for (int l = 0; l < vetorResposta.length; l++) {
                if (vetor[i] == vetorResposta[l]) {
                    existente = true;
                }
            }
            if(!existente) {
                for (int j = i+1; j < vetor.length; j++) {
                    if (vetor[i] == vetor[j] && !existente) {
                        vetorResposta[k] = vetor[i];
                        existente = true;
                        k++;
                    }
                }
            }
            existente = false;
        }

        int[] vetorFinal = new int[k];

        for (int i = 0; i < vetorFinal.length; i++) {
            vetorFinal[i]=vetorResposta[i];
        }


        // apresentar o resultado

        System.out.println("Os valores ");

        for (int i = 0; i < vetorFinal.length; i++) {
            System.out.print(vetorFinal[i]);
        }

        System.out.println(" estão duplicados dentro do vetor.");


    }

}
