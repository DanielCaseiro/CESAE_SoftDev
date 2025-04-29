package FichaPratica03;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero_inicio, numero_fim;

        // Leitura do numero início
        System.out.print("Insira um número que representa o início do intervalo: ");
        numero_inicio = input.nextInt();

        // Leitura do numero fim
        System.out.print("Insira um número que representa o fim do intervalo: ");
        numero_fim = input.nextInt();

        // imprimir os múltiplos de 5 entre início e fim
        while (numero_inicio <= numero_fim) {
            if (numero_inicio % 5 == 0) {
                System.out.println(numero_inicio);
            }
            numero_inicio++;
        }

    }
}
