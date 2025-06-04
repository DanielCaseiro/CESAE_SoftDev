package FichaPratica03;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, media, i;

        // inicializando a contagem em 1
        i = 0;
        numero = 0;
        media = 0;

        while (numero != -1) {
           System.out.print("Insira um número: ");
           numero = input.nextInt();
           if (numero != -1){
               i++;
               media = media + numero;
           }

       }

        media = media / i;

        System.out.println( "A media é: " + media);

    }
}
