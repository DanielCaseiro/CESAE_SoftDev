package FichaPratica02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        // Criação do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero1, numero2, numero3;

        // Ler numero1
        System.out.print("Por favor, introduza o numero 1: ");
        numero1 = input.nextInt();

        // Ler numero2
        System.out.print("Por favor, introduza o numero 2: ");
        numero2 = input.nextInt();

        // Ler numero3
        System.out.print("Por favor, introduza o numero 3: ");
        numero3 = input.nextInt();

        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println("O menor dos três números é " + numero1);
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("O menor dos três números é " + numero2);
        } else {
            System.out.println("O menor dos três números é " + numero3);
        }

    }
}
