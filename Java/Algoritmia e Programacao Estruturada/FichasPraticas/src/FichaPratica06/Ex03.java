package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex02.lerIntPositivo;

public class Ex03 {

    /**
     * Função que determina se um número é ou não par
     * @param numero Número a analisar
     * @return true se par || false se ímpar
     */
    public static boolean parOuImpar (int numero) {

        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    // -------------------------------------------------------------------------------------------------------------

    /**
     * Função que determina se um número é ou não positivo
     * @param numero Número a analisar
     * @return true se positivo || false se negativo
     */
    public static boolean positivoOuNeg (int numero) {

        if (numero >= 0) {
            return true;
        } else {
            return false;
        }

    }

    // -------------------------------------------------------------------------------------------------------------

    /**
     * Função que determina se um número é ou não primo
     * @param numero Número a analisar
     * @return true se primo || false se não primo
     */
    public static boolean primo (int numero) {

        if (numero <= 1) {
            return false;
        }

        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }

        return true;
    }


    // -------------------------------------------------------------------------------------------------------------

    /**
     * Função que determina se um número é ou não perfeito
     * @param numero Número a ser analisado
     * @return true se perfeito || false se não perfeito
     */
    public static boolean perfeito (int numero) {

        int soma = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma = soma + i;
            }
        }

        if (soma == numero) {
            return true;
        }

        return false;
    }


    // -------------------------------------------------------------------------------------------------------------

    /**
     * Função que determina se um número é ou não triangular
     * @param numero Número a analisar
     * @return true se triangular || false se não triangular
     */
    public static boolean triangular (int numero) {

        int soma = 0;

        for (int i = 1; soma < numero; i++) {

            soma = soma + i;

        }

        if (soma == numero) {
            return true;
        }

        return false;

    }


    // -------------------------------------------------------------------------------------------------------------



// -------------------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------------


    public static void main(String[] args) {

//        // import Scanner
//        Scanner input = new Scanner(System.in);
//
//        // Declarar variáveis
//        int numero;
//
//        // Ler o numero
//        System.out.println(" ");
//        System.out.print("Insira um número: ");
//        numero = input.nextInt();
//
//
//        // Impimir se par ou impar
//        System.out.println(" ");
//        if (parOuImpar(numero)) {
//            System.out.println("O numero fornecido é par");
//        } else {
//            System.out.println("O numero fornecido é impar");
//        }
//
//        // Impimir se positivo ou negativo
//        System.out.println(" ");
//        if (positivoOuNeg(numero)) {
//            System.out.println("O numero fornecido é positivo");
//        } else {
//            System.out.println("O numero fornecido é negativo");
//        }
//
//        // Impimir se primo ou não
//        System.out.println(" ");
//        if (primo(numero)) {
//            System.out.println("O numero fornecido é primo");
//        } else {
//            System.out.println("O numero fornecido não é primo");
//        }
//
//        // Impimir se perfeito ou não
//        System.out.println(" ");
//        if (perfeito(numero)) {
//            System.out.println("O numero fornecido é perfeito");
//        } else {
//            System.out.println("O numero fornecido não é perfeito");
//        }
//
//        // Impimir se triangular ou não
//        System.out.println(" ");
//        if (triangular(numero)) {
//            System.out.println("O numero fornecido é triangular");
//        } else {
//            System.out.println("O numero fornecido não é triangular");
//        }


    }
}
