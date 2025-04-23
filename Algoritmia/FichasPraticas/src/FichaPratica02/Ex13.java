package FichaPratica02;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        // Criação do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int horas, minutos;

        // Ler horas
        System.out.print("Por favor, informe as horas: ");
        horas = input.nextInt();

        // Ler os minutos
        System.out.print("Por favor, informe os minutos: ");
        minutos = input.nextInt();

        // Calcular as horas no novo formato e apresentar resultados
        if (horas < 0 || horas > 24) {
            System.out.println("horário inválido");
        } else if (horas < 12) {
            System.out.println(horas + ":" + minutos + " AM");
        } else if (horas == 12) {
            System.out.println(horas + ":" + minutos + " PM");
        } else if (horas > 12) {
            horas = horas - 12;
            System.out.println(horas + ":" + minutos + " PM");
        } else {

        }

    }
}
