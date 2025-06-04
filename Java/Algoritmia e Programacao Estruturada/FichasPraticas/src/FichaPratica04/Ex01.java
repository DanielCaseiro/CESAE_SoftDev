package FichaPratica04;

import java.util.Objects;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero1, numero2, resultado;
        String opcao, continuar;
        resultado = 0;

        // Ler numeros e criar menu com do... while

        do {
            System.out.print("Introduza o primeiro número: ");
            numero1 = input.nextInt();
            System.out.print("Introduza o segundo número: ");
            numero2 = input.nextInt();
            System.out.println("Escolha uma operação matemática: ");
            System.out.println("Carregue + para somar");
            System.out.println("Carregue - para somar");
            System.out.println("Carregue / para somar");
            System.out.println("Carregue * para somar");
            System.out.print("Insira sua opção: ");
            opcao = input.next();
            switch (opcao) {
                case "+": System.out.println("Somando...");
                        resultado = numero1 + numero2;
                    break;
                case "-": System.out.println("Subtraindo...");
                    resultado = numero1 - numero2;
                    break;
                case "/" : System.out.println("Dividindo...");
                    resultado = numero1 / numero2;
                    break;
                case "*" : System.out.println("Multiplicando...");
                    resultado = numero1 * numero2;
                    break;
                default: System.out.println("Opção Inválida!");
            }
            System.out.println("O resultado da operação escolhida é: " + resultado);
            System.out.println("Deseja repetir?");
            System.out.println("S - sim");
            System.out.println("N - não");
            continuar = input.next();
        } while (!continuar.equals("N"));


    }
}
