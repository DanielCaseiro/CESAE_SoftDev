package FichaPratica03;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero;

        // Leitura do número
        System.out.print("Insira um número maior que 2: ");
        numero = input.nextInt();

        // Imprimir os numeros pares entre 2 e o numero inserido
        while (numero >= 2) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero = numero -1;
        }

    }

}
