package FichaPratica02;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        String codigo;
        int dias, VenBase;
        Double IRS, SegSoc, VenLiq, VenIl, SubAlim;
        String cargo;

        // Ler o código do funcionário
        System.out.print("Por favor, introduza o código do funcionário: ");
        codigo = input.nextLine();

        // Ler o cargo
        System.out.println("=== MENU ===");
        System.out.println("E - empregado");
        System.out.println("C - chefe");
        System.out.println("A - administrador");
        System.out.print("Por favor, introduza o seu cargo: ");
        cargo = input.next();

        // Ler o número de dias trabalhados
        System.out.print("Por favor, introduza o número de dias trabalhados: ");
        dias = input.nextInt();

        switch (cargo) {

            case "E":

                // Calcular o vencimento base
                VenBase = dias * 40;

                // Calcular o subsídio de alimentação
                SubAlim = (double) (dias * 5);

                // Calcular Segurança Social
                SegSoc = (double) 0.3475 * (VenBase + SubAlim);

                // Calcular o IRS
                if ( (VenBase + SubAlim) < 1000) {
                    IRS = (double) 0.1 * (VenBase + SubAlim);
                } else {
                    IRS = (double) 0.2 * (VenBase + SubAlim);
                }

                // Calcular o valor ilíquido a receber
                VenIl = VenBase + SubAlim;

                // Calcular o valor líquido a receber
                VenLiq = (double) (VenBase + SubAlim) - IRS - 0.11*(VenBase+SubAlim);

                // Apresentar o valor ilíquido a receber
                System.out.println("O valor ilíquido a receber é: " + VenIl);

                // Apresentar o total do subsídio alimentação
                System.out.println("O valor total do subsídio alimentação é: " + SubAlim);

                // Apresentar o valor da retenção do IRS
                System.out.println("O valor do IRS é: " + IRS);

                // Apresentar o vavlor total a entregar a Segurança Social
                System.out.println("O valor a entrega à Segurança Social é: " + SegSoc);

                // Apresentar o valor líquido a receber pelo funcionario
                System.out.println("O valor líquido a receber é: " + VenLiq);


                break;

            case "C":

                // Calcular o vencimento base
                VenBase = dias * 60;

                // Calcular o subsídio de alimentação
                SubAlim = dias * 7.5;

                // Calcular Segurança Social
                SegSoc = (double) 0.3475 * (VenBase + SubAlim);

                // Calcular o IRS
                if ( (VenBase + SubAlim) < 1000) {
                    IRS = (double) 0.1 * (VenBase + SubAlim);
                } else {
                    IRS = (double) 0.2 * (VenBase + SubAlim);
                }

                // Calcular o valor ilíquido a receber
                VenIl = VenBase + SubAlim;

                // Calcular o valor líquido a receber
                VenLiq = (double) (VenBase + SubAlim) - IRS - 0.11*(VenBase+SubAlim);

                // Apresentar o valor ilíquido a receber
                System.out.println("O valor ilíquido a receber é: " + VenIl);

                // Apresentar o total do subsídio alimentação
                System.out.println("O valor total do subsídio alimentação é: " + SubAlim);

                // Apresentar o valor da retenção do IRS
                System.out.println("O valor do IRS é: " + IRS);

                // Apresentar o vavlor total a entregar a Segurança Social
                System.out.println("O valor a entrega à Segurança Social é: " + SegSoc);

                // Apresentar o valor líquido a receber pelo funcionario
                System.out.println("O valor líquido a receber é: " + VenLiq);


                break;

            case "A":

                // Calcular o vencimento base
                VenBase = dias * 80;

                // Calcular o subsídio de alimentação
                SubAlim = dias * 7.5;

                // Calcular Segurança Social
                SegSoc = (double) 0.3 * (VenBase + SubAlim);

                // Calcular o IRS
                if ( (VenBase + SubAlim) < 1000) {
                    IRS = (double) 0.1 * (VenBase + SubAlim);
                } else {
                    IRS = (double) 0.2 * (VenBase + SubAlim);
                }

                // Calcular o valor ilíquido a receber
                VenIl = VenBase + SubAlim;

                // Calcular o valor líquido a receber
                VenLiq = (double) (VenBase + SubAlim) - IRS - 0.11*(VenBase+SubAlim);

                // Apresentar o valor ilíquido a receber
                System.out.println("O valor ilíquido a receber é: " + VenIl);

                // Apresentar o total do subsídio alimentação
                System.out.println("O valor total do subsídio alimentação é: " + SubAlim);

                // Apresentar o valor da retenção do IRS
                System.out.println("O valor do IRS é: " + IRS);

                // Apresentar o vavlor total a entregar a Segurança Social
                System.out.println("O valor a entrega à Segurança Social é: " + SegSoc);

                // Apresentar o valor líquido a receber pelo funcionario
                System.out.println("O valor líquido a receber é: " + VenLiq);


                break;

            default:
                System.out.print("Opção inválida.");
                break;

        }


    }
}
