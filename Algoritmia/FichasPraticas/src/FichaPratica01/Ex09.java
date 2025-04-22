package FichaPratica01;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        String codigo;
        int dias, VenBase, SubAlim;
        Double IRS, SegSoc, VenLiq;

        // Ler o código do funcionário
        System.out.print("Por favor, introduza o código do funcionário: ");
        codigo = input.nextLine();

        // Ler o número de dias trabalhados
        System.out.print("Por favor, introduza o número de dias trabalhados: ");
        dias = input.nextInt();

        // Calcular o vencimento base
        VenBase = dias * 40;

        // Calcular o subsídio de alimentação
        SubAlim = dias * 5;

        // Calcular o IRS
        IRS = (double) 0.1 * (VenBase + SubAlim);

        // Calcular Segurança Social
        SegSoc = (double) 0.3475 * (VenBase + SubAlim);

        // Calcular o valor líquido a receber
        VenLiq = (double) (VenBase + SubAlim) - IRS - 0.11*(VenBase+SubAlim);

        // Apresentar o valor ilíquido a receber
        System.out.println("O valor ilíquido a receber é: " + VenBase);

        // Apresentar o total do subsídio alimentação
        System.out.println("O valor total do subsídio alimentação é: " + SubAlim);

        // Apresentar o valor da retenção do IRS
        System.out.println("O valor do IRS é: " + IRS);

        // Apresentar o vavlor total a entregar a Segurança Social
        System.out.println("O valor a entrega à Segurança Social é: " + SegSoc);

        // Apresentar o valor líquido a receber pelo funcionario
        System.out.println("O valor líquido a receber é: " + VenLiq);


    }
}

    // ctrl+alt+L identa automaticamente o código