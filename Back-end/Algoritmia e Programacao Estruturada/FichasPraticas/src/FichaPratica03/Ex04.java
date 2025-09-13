package FichaPratica03;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, i;

        // Leitura do número
        System.out.print("Insira um número positivo: ");
        numero = input.nextInt();

        // Apresentar contagem
        i = 0;
        while (i <= numero) {
            System.out.println(i);
            i++;
        }




        /*

        // Loop ou laço com for
        // estrutura: for (inicialização, condição, incremento)

        for ( int i = 0; i <= numero; i++) {
            System.out.println(i);
        }

         */


        /*

        // Minha solução maluca

        // Declarar variáveis
        int numero_inicial, numero_final;

        numero_inicial = -1;

        // Leitura do número
        System.out.print("Insira um número positivo: ");
        numero_final = input.nextInt();

        numero_final = numero_final -1;

        // Apresentar os numeros de 0 até o número apresentado
        while (numero_final >= numero_inicial) {
            numero_inicial = numero_inicial +1;
            System.out.println(numero_inicial);
        }

         */
    }
}
