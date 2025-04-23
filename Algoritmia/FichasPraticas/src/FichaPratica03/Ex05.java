package FichaPratica03;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero;
        String mensagem;

        // Leitura do número
        System.out.print("Insira um número positivo: ");
        numero = input.nextInt();

        // Leitura da mensagem
        System.out.print("Escreva uma mensagem: ");
        mensagem = input.next();


        // Imprimir a mensagem
        while (numero > 0) {
            System.out.println(mensagem);
            numero--;
        }

    }
}
