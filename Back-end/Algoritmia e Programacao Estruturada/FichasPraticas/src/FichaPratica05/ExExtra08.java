package FichaPratica05;

import java.util.Scanner;

public class ExExtra08 {

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int tamanho, valorAcrescer, posicao;

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
        System.out.println("-------- SEU VETOR --------");

        for (int i = 0; i < vetor.length; i++) {
            if (i < vetor.length -1) {
                System.out.print(vetor[i] + "  |  ");
            } else {
                System.out.print(vetor[i]);
            }
        }

        System.out.println(" ");


        // Ler valor a acrescentar

        System.out.println(" ");

        System.out.print("Insira um valor a acrescentar no vetor: ");
        valorAcrescer = input.nextInt();

        // Ler indice onde acrescentar

        System.out.println(" ");

        System.out.print("Indique o índice onde quer colocar o novo valor: ");
        posicao = input.nextInt();



        // criar um novo vetor de resposta com o novo valor na posicao indicada

        int [] vetorResposta = new int [vetor.length +1];

        int k = 0;

        for (int i = 0; i < vetorResposta.length; i++) {
            if (i < posicao) {
                vetorResposta[i] = vetor[i];
            } else if (i == posicao) {
                vetorResposta[posicao] = valorAcrescer;
            } else if (i > posicao) {
                vetorResposta[i] = vetor[i-1];
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
