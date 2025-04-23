package FichaPratica03;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero_inicio, numero_fim;

        // Leitura do número de início
        System.out.print("Insira um número de início: ");
        numero_inicio = input.nextInt();

        // Leitura do número de fim
        System.out.print("Insira um número de fim: ");
        numero_fim = input.nextInt();

        // Apresentar contagem
        while (numero_inicio <= numero_fim) {
            System.out.println(numero_inicio);
            numero_inicio++;
        }

    }
}
