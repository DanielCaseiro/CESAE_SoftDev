package FichaPratica06;

import java.util.Scanner;

public class Ex01 {

    public static void fazerBarulho (String animal) {

        // Imprimir o barulho correspondente ao animal

        System.out.print(" ");

        switch (animal) {

            case "Cão":
                System.out.print(animal + ": au au au");
                break;

            case "cão":
                System.out.print(animal + ": au au au");
                break;

            case "Gato":
                System.out.print(animal + ": miau");
                break;

            case "gato":
                System.out.print(animal + ": miau");
                break;

            case "Peixe":
                System.out.print(animal + ": glub glub");
                break;

            case "peixe":
                System.out.print(animal + ": glub glub");
                break;

            case "Vaca":
                System.out.print(animal + ": muuuuu");
                break;

            case "vaca":
                System.out.print(animal + ": muuuuu");
                break;

            case "Porco":
                System.out.print(animal + ": oinc oinc");
                break;

            case "porco":
                System.out.print(animal + ": oinc oinc");
                break;

            default:
                System.out.println("Esse animal é mudo.");
        }
    }

// -------------------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------------


    public static void main(String[] args) {

        // import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        String animalUtilizador;

        // Ler o animal
        System.out.print(" ");
        System.out.print("Diga o nome do animal: ");
        animalUtilizador = input.next();

        // Imprimir o barulho correspondente

        fazerBarulho(animalUtilizador);

    }

}
