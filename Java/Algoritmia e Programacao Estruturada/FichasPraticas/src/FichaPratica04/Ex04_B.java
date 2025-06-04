package FichaPratica04;

import java.util.Scanner;

public class Ex04_B {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, i;
        numero = 1;
        i = 2;


        // Teste do algoritmo da checagem dos numeros primos

        do {

            if (numero == 1) {
                System.out.println("O numero 1 é primo");
            } else if (numero == 2) {
                System.out.println("O numero 2 é primo");
            } else {
                while (numero % i != 0) {
                    i++;
                }

                if ( i == numero && numero != 2) {
                    System.out.println("O numero " + numero +  " é primo");
                }
            }

            i = 2;

            numero++;

        } while (numero < 1000);

    }
}
