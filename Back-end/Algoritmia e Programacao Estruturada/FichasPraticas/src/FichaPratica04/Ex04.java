package FichaPratica04;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, i;
        numero = 0;
        i = 2;


        // Ler o numero
        while (numero <= 0) {
            System.out.print("Insira um número positivo maior que zero: ");
            numero = input.nextInt();
        }


        // Checar se é primo ou não

        if (numero == 1) {
            System.out.print("O numero 1 é primo");
        } else if (numero == 2) {
            System.out.print("O numero 2 é primo");
        } else {
            while (numero % i != 0) {
                i++;
            }
        }

        if ( i == numero && numero != 2) {
            System.out.print("O numero " + numero +  " é primo");
        } else if (numero != 1 && numero != 2){
            System.out.print("O numero " + numero + " não é primo");
        }

    }
}
