package FichaPratica03;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int limite, salto;

        // Leitura do número limite
        System.out.print("Insira um número limite: ");
        limite = input.nextInt();

        // Leitura do salto
        System.out.print("Insira um número salto: ");
        salto = input.nextInt();


        //  Imprimir os números inteiros de 0 até limite inclusive, com incremento de salto
        for (int i = 0; i <= limite; i += salto) {
            System.out.println(i);
        }

        // Resolvendo com while
//        int i = 0;
//        while (i <= limite) {
//            System.out.println(i);
//            i = i + salto;
//        }

    }

}
