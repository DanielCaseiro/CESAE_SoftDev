package FichaPratica01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero1, numero2, soma;

        // Ler numero1
        System.out.print("Introduz um número: ");
        numero1 = input.nextInt();

        // Ler numero2
        System.out.print("Introduz um número: ");
        numero2 = input.nextInt();

        // Calcular a soma
        soma = numero1 + numero2;

        // Apresentar resultados
        System.out.print("Soma: " + soma);
    }
}
