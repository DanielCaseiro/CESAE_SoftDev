package FichaPratica03;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, numero_inicial, numero_final;

        // Leitura do número de início
        System.out.print("Insira um número: ");
        numero = input.nextInt();

        numero_final = numero + 5;
        numero_inicial = numero -5;

        // Apresentar os 5 numeros anteriores e os 5 numeros posteriores
        while (numero_inicial <= numero_final) {
            if (numero_inicial != numero) {
                System.out.println(numero_inicial);
            }
            numero_inicial++;
        }


    }
}
