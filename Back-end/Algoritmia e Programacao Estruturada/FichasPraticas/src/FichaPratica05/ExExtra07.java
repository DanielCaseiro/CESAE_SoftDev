package FichaPratica05;

import java.util.Scanner;

public class ExExtra07 {

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int tamanho, valorRemover, contagem, novoTamanho;

        System.out.println(" ");

        System.out.print("Determine o tamanho(lenght) do vetor: ");
        tamanho = input.nextInt();
        int [] vetor = new int[tamanho];


        // Ler valores do vetor

        System.out.println(" ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um valor na posição [" + i + "] do vetor: ");
            vetor[i] = input.nextInt();
        }

        // Imprimir os valores do vetor na ordem de inserção

        System.out.println(" ");
        System.out.println("-------- VETOR --------");

        for (int i = 0; i < vetor.length; i++) {
            if (i < vetor.length -1) {
                System.out.print(vetor[i] + "  |  ");
            } else {
                System.out.print(vetor[i]);
            }
        }

        System.out.println(" ");


        // Ler valor a remover

        System.out.println(" ");

        System.out.print("Insira um valor a remover do vetor: ");
        valorRemover = input.nextInt();

        // contar quantas vezes o valor a remover encontra-se no vetor

        contagem = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorRemover) {
                contagem += 1;
            }
        }

        // criar um novo vetor de resposta sem os valores a remover

        int [] vetorResposta = new int [vetor.length - contagem];

        int k = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != valorRemover) {
                vetorResposta[k] = vetor[i];
                k++;
            }
        }



        // Imprimir os valores do vetor Resposta na ordem de inserção

        System.out.println(" ");
        System.out.println("-------- VETOR RESPOSTA --------");

        for (int i = 0; i < vetorResposta.length; i++) {
            if (i < vetorResposta.length -1) {
                System.out.print(vetorResposta[i] + "  |  ");
            } else {
                System.out.print(vetorResposta[i]);
            }
        }

        System.out.println(" ");


    }

}
