package FichaPratica06;

import java.util.Scanner;

public class Ex02 {

    public static int lerIntPositivo () {

        // Ler um valor inteiro positivo.
        // Solicitar um numero ao usuário até que seja inteiro e positivo:

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero = 0;

        // Ler o numero
        System.out.println(" ");
        do {
            System.out.print("Insira um número inteiro e positivo: ");
            numero = input.nextInt();
        } while (numero <= 0);

        return numero;

    }

    public static void printAsteriscos (int numero) {

        // Imprime em uma linha um numero de asteriscos
        // igual ao numero fornecido


        // Imprimir
        System.out.println(" ");
        for (int i=0; i< numero; i++) {
            System.out.print("*");
        }

    }



// -------------------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------------


    public static void main(String[] args) {

        // Declarar variáveis
        int numero;

        // Ler o numero
        numero = lerIntPositivo();

        // Impimir o numero
        printAsteriscos(numero);

    }
}
