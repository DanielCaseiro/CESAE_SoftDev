package FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int segundos, minutos, horas;

        // Ler musica 1
        System.out.print("Introduz os minutos da primeira música: ");
        minutos = input.nextInt();

        System.out.print("Introduz os segundos da primeira música: ");
        segundos = input.nextInt();

        // Ler musica 2
        System.out.print("Introduz os minutos da segunda música: ");
        minutos = minutos + input.nextInt();

        System.out.print("Introduz os segundos da segunda música: ");
        segundos = segundos + input.nextInt();

        // Ler musica 3
        System.out.print("Introduz os minutos da terceira música: ");
        minutos = minutos + input.nextInt();

        System.out.print("Introduz os segundos da terceira música: ");
        segundos = segundos + input.nextInt();

        // Ler musica 4
        System.out.print("Introduz os minutos da quarta música: ");
        minutos = minutos + input.nextInt();

        System.out.print("Introduz os segundos da quarta música: ");
        segundos = segundos + input.nextInt();

        // Ler musica 5
        System.out.print("Introduz os minutos da quinta música: ");
        minutos = minutos + input.nextInt();

        System.out.print("Introduz os segundos da quinta música: ");
        segundos = segundos + input.nextInt();


        // Calcular as horas do album
        horas = (minutos + segundos / 60) / 60;

        // Calcular os minutos do album
        minutos = (minutos + segundos / 60) % 60;

        // Calcular os segundos do album
        segundos = segundos % 60;

        // Apresentar a duração total do album
        System.out.println("A duração do álbum é " + horas + ":" + minutos + ":" + segundos);

    }
}
