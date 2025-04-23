package FichaPratica02;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        // Criação do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero1, numero2, resultado;
        String operacao;

        // Ler numero1
        System.out.print("Por favor, introduza o numero 1: ");
        numero1 = input.nextInt();

        // Ler numero2
        System.out.print("Por favor, introduza o numero 2: ");
        numero2 = input.nextInt();

        // Perguntar qual operação quer realizar
        System.out.print("Por favor, indique qual operação quer realizar. Utilize os operadores +, -, /, *: ");
        operacao = input.next();

        // Validação da operação

        while (!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("/") && !operacao.equals("*")) {
            System.out.println("Por favor, introduza um operador válido: ");
            operacao = input.nextLine();
        }

            // Apresentar o resultado
            if (operacao.equals("+")) {
                resultado = numero1 + numero2;
                System.out.print("A soma dos dois números resulta em: " + resultado);
            } else if (operacao.equals("-")) {
                resultado = numero1 - numero2;
                System.out.print("A subtração dos dois números resulta em: " + resultado);
            } else if (operacao.equals("/")) {
                resultado = numero1 / numero2;
                System.out.print("A divisão dos dois números resulta em: " + resultado);
            } else {
                resultado = numero1 * numero2;
                System.out.print("A multiplicação dos dois números resulta em: " + resultado);
            }


        }

    }

    /*

    // Resolução com switch

    switch (operacao) {

        case "+":
            resultado = numero1 + numero2;
            System.out.print("A soma dos dois números resulta em: " + resultado);
            break;

        case "-":
            resultado = numero1 - numero2;
            System.out.print("A subtração dos dois números resulta em: " + resultado);
            break;

        case "/":
            resultado = numero1 / numero2;
            System.out.print("A divisão dos dois números resulta em: " + resultado);
            break;

        case "*":
            resultado = numero1 * numero2;
            System.out.print("A multiplicação dos dois números resulta em: " + resultado);
            break;
       
        default:
            System.out.print("Operação não reconhecida");
            break;

    }


    */

