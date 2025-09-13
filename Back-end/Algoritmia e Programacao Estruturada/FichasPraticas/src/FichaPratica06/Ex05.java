package FichaPratica06;

import java.util.Scanner;

public class Ex05 {



    /**
     * Função que lê um número inteiro
     * @return um número inteiro
     */
    public static int lerNumeroInteiro () {

        // import Scanner
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Insira um número inteiro: ");
        numero = input.nextInt();

        return numero;
    }



    /**
     * Função que cria e lê um vetor de números inteiros
     * @param tamanho Número inteiro que degermina o tamanho do vetor
     * @return um vetor preenchido
     */
    public static int [] lerVetorInteriros (int tamanho) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Criar e ler o vetor

        int [] vetor = new int[tamanho];

        for (int i=0; i< vetor.length; i++) {
            System.out.print("Insira um valor na posição [" + i + "] do seu vetor: ");
            vetor[i] = input.nextInt();
        }

        return vetor;
    }


    /**
     * Função que imprime um vetor
     * @param vetor O Vetor a ser impresso
     */
    public static void printVetor (int [] vetor) {

        System.out.println(" ");
        System.out.println("---------- SEU VETOR ----------");
        for (int i=0;i<vetor.length;i++){
            if (i<vetor.length-1){
                System.out.print(vetor[i] + "  |  ");
            } else {
                System.out.print(vetor[i]);
            }
        }

        System.out.println(" ");
    }



    /**
     * Função que encontra o maior elemento de um vetor
     * @param vetor Vetor a ser analisado
     * @return um número inteiro que é o maior elemento do Vetor
     */
    public static int maiorElementoVetor (int [] vetor) {

        // Declarar variáveis
        int maiorElemento = vetor[0];

        // Encontrar o maior elemento
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorElemento) {

                maiorElemento = vetor[i];
            }
        }

        return maiorElemento;
    }



    /**
     * Função que encontra o menor elemento de um vetor
     * @param vetor Vetor a ser analisado
     * @return um número inteiro que é o menor elemento do Vetor
     */
    public static int menorElementoVetor (int [] vetor) {

        // Declarar variáveis
        int menorElemento = vetor[0];

        // Encontrar o menor elemento
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menorElemento) {

                menorElemento = vetor[i];
            }
        }

        return menorElemento;
    }



    /**
     * Função que diz se os elementos de um vetor estão em ordem crescente ou não
     * @param vetor Vetor a ser analisado
     * @return true se crescente || false se não crescente
     */
    public static boolean crescenteVetor (int [] vetor) {

        // Declarar variáveis
        int elementoAnterior;

        // Descobrir se é crescente

        elementoAnterior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i]  <= vetor[i-1]) {

                return false;
            }

        }

        return true;
    }






// -------------------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------------



    public static void main(String[] args) {

//        // import Scanner
//        Scanner input = new Scanner(System.in);
//
//        // Declarar variáveis
//        int [] vetor = new int[3];
//
//        // Ler o vetor
//        System.out.println(" ");
//
//        for (int i=0; i< vetor.length; i++) {
//            System.out.print("Insira um valor na posição [" + i + "] do vetor: ");
//            vetor[i] = input.nextInt();
//        }
//
//        // Imprimir o vetor
//        System.out.println(" ");
//        System.out.println("---------- VETOR ----------");
//        for (int i=0;i<vetor.length;i++){
//            if (i<vetor.length-1){
//                System.out.print(vetor[i] + "  |  ");
//            } else {
//                System.out.print(vetor[i]);
//            }
//
//        }
//
//
//        // Encontrar e imprimir o maior elemento do vetor
//        System.out.println(" ");
//        System.out.println(" ");
//        System.out.print("O maior elemento do vetor é " + maiorElementoVetor(vetor));
//        System.out.println(" ");
//
//        // Dizer se o vetor é crescente ou não
//        System.out.println(" ");
//        System.out.println(" ");
//        if (crescenteVetor(vetor)) {
//            System.out.print("Os elementos do vetor estão em ordem crescente");
//            System.out.println(" ");
//        } else {
//            System.out.print("Os elementos do vetor não estão em ordem crescente");
//            System.out.println(" ");
//        }

    }
}
