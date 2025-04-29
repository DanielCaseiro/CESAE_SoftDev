package FichaPratica03;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, intervalo1, intervalo2, intervalo3, intervalo4;
        numero = 1;
        intervalo1 = 0;
        intervalo2 = 0;
        intervalo3 = 0;
        intervalo4 = 0;

        // Leitura e contagem dos números
        while (numero > 0) {
            System.out.print("Insira um número: ");
            numero = input.nextInt();

            if (numero > 0 && numero <= 25) {
                intervalo1++;
            } else if (numero > 25 && numero <= 50) {
                intervalo2++;
            } else if (numero > 50 && numero <= 75) {
                intervalo3++;
            }  else if (numero > 75 && numero <= 100) {
                intervalo4++;
            }
        }

        //  Apresentar quantos numeros estão nos seguintes intervalos:

        //  [0,25]
        System.out.println("[0,25]: " + intervalo1);

        //  [26,50]
        System.out.println("[26,50]: " + intervalo2);

        //  [51,75]
        System.out.println("[51,75]: " + intervalo3);

        //  [76,100]
        System.out.println("[76,100]: " + intervalo4);


    }
}
