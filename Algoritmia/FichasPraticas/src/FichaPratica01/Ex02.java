package FichaPratica01;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero1, numero2, soma, subtracao, multi, divisao;

        // Ler numero1
        System.out.print("Introduz um número: ");
        numero1 = input.nextInt();

        // Ler numero2
        System.out.print("Introduz um número: ");
        numero2 = input.nextInt();

        // Calcular a soma
        soma = numero1 + numero2;

        // Apresentar a soma
        System.out.println("Soma: " + soma);

        // Calcular a subtração
        subtracao = numero1 - numero2;

        // Apresentar a subtração
        System.out.println("Subtração: " + subtracao);

        // Calcular a multiplicação
        multi = numero1 * numero2;

        // Apresentar a multiplicação
        System.out.println("Multiplicação: " + multi);

        // Calcular a divisão
        divisao = numero1 / numero2;

        // Apresentar a divisão
        System.out.println("Divisão: " + divisao);

    }
}

    /*

        // Declarar variáveis
        int numero1, numero2, resultado;

        // Ler numero1
        System.out.print("Introduz um número: ");
        numero1 = input.nextInt();

        // Ler numero2
        System.out.print("Introduz um número: ");
        numero2 = input.nextInt();

        // Calcular a soma
        resultado = numero1 + numero2;

        // Apresentar a soma
        System.out.print("Soma: " + resultado);

        // Calcular a subtração
        resultado = numero1 - numero2;

        // Apresentar a subtração
        System.out.print("Subtração: " + resultado);

        // Calcular a multiplicação
        resultado = numero1 * numero2;

        // Apresentar a multiplicação
        System.out.print("Multiplicação: " + resultado);

        // Calcular a divisão
        resultado = numero1 / numero2;

        // Apresentar a divisão
        System.out.print("Divisão: " + resultado);

         */