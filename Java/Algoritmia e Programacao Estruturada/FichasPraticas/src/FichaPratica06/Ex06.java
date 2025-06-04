package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex03.*;
import static FichaPratica06.Ex05.*;

public class Ex06 {

    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int tamanho = 0;
        int opcao;

        // Apresentar o programa
        System.out.println(" ");
        System.out.println("====== PROGRAMA DE ANÁLISE DE UM VETOR ======");
        System.out.println(" ");

        // Ler o tamanho do vetor
        System.out.print("Escolha o tamanho (número de elementos) do seu vetor. ");
        tamanho = lerNumeroInteiro();
        System.out.println(" ");

        // Criar e ler o vetor

        int vetor [] = lerVetorInteriros(tamanho);
        System.out.println(" ");

        // Imprimir o vetor
       printVetor(vetor);

        // Mostrar opções e resultados

        do {

            System.out.println(" ");
            System.out.println("Para descobrir:");
            System.out.println(" ");
            System.out.println("====== MENU ======");
            System.out.println("1. O maior elemento do vetor");
            System.out.println("2. O menor elemento do vetor");
            System.out.println("3. Se os elementos do vetor estão em ordem crescente ou não");
            System.out.println("0. Encerrar o programa.");

            System.out.println(" ");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:


                    System.out.println(" ");
                    System.out.println("O maior elemento do seu vetor é: " + maiorElementoVetor(vetor));


                    break;

                case 2:

                    System.out.println(" ");
                    System.out.println("O menor elemento do seu vetor é: " + menorElementoVetor(vetor));


                    break;

                case 3:

                    if (crescenteVetor(vetor)) {
                        System.out.println(" ");
                        System.out.println("Os elementos do seu vetor estão em ordem crescente");
                    } else {
                        System.out.println(" ");
                        System.out.println("Os elementos do seu vetor não estão em ordem crescente");
                    }

                    break;


                case 0:

                    System.out.println(" ");
                    System.out.print("Análise do vetor encerrada.");

                    break;

                default:
                    System.out.println(" ");
                    System.out.println("Opção inválida;");

            }

        } while (opcao != 0);



        System.out.println(" ");




    }
}
