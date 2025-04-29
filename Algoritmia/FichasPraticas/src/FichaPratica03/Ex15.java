package FichaPratica03;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        // Criação do Scanner - vamos ter inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, proxNumero, soma, resultado1, resultado2, resultado3, fatoracao, i, j, k, l;
        numero = -1;
        soma = 0;
        fatoracao = 0;
        resultado1 = 0;
        resultado2 = 0;
        resultado3 = 0;
        i = 0;
        j = 0;
        k = 0;
        l = 0;


        // Leitura do numero
        while (numero < 0) {
            System.out.print("Insira um numero positivo: ");
            numero = input.nextInt();
        }


        /* --------- Calculo do fatorial sem multiplicação ---------- */


        // PRIMEIRA multiplicação: 5x4 = 5+5+5+5 = 20 (há 3 somas, portanto numero-2)
        i = 0;
        soma = 0;
        while (i <= numero-2) {
            soma = soma + numero;
            i ++;
        }

        resultado1 = soma;
        j = 1;

        // resuldato da primeira Multiplicação
        System.out.println("A primeira multiplicação do fatorial é " + resultado1);

        // SEGUNDA multiplicacao: 20x3 = 20+20+20 = 60 (há duas somas, portanto numero-3)
        i = j;
        soma = resultado1;
        while (i <= numero-3) {
            soma = soma + resultado1;
            i ++;
        }

        resultado2 = soma;
        j = 2;
        System.out.println("A segunda multiplicação do fatorial é " + resultado2);

        // TERCEIRA multiplicacao 60x2 = 60+60 = 120 (há uma soma, portanto, numero-4)
        i = j;
        while (i <= numero-4) {
            soma = soma + resultado2;
            i ++;
        }

        resultado3 = soma;
        j = 3;

        System.out.println("A terceira multiplicação do fatorial é " + resultado3);

        // QUARTA e última multiplicacao 120x1 = 120 (não há soma)

        fatoracao = resultado3;

        // Apresentar o resultado final da fatoracao
        System.out.print("O fatorial de " + numero + " é " + fatoracao);


//        // Calculo da fatoração: 5! = 5x4x3x2x1 = 120, há 4 multiplicações
//
//        fatoracao = soma; // pois já foi realizada a primeira multiplicacao da fatotacao
//        j = 0;            // pois já foi realizada a primeira multiplicacao da fatotacao
//
//
//
//        while (j <= numero-2) {
//
//            i = 0;
//
//            while (i <= proxNumero-1) {
//                soma = soma + soma;
//                i ++;
//            }
//
//            fatoracao = fatoracao + soma;
//
//            proxNumero--;
//
//            j++;
//        }











        // Calculo do fatorial do numero com *

//        i = numero;
//        fatorial = 1;
//
//        while (i > 1) {
//            fatorial = fatorial*i;
//            i--;
//        }

    }

}

/*

pós incremento
numero++

a = 10;
b = a++;

print(a): 11
print(b): 10 (o incremento feito depois de b receber a)

print(b++): 10
print(b) : 11

pré incremento
++numero

a= 10;
b = ++a;

print(a): 11
print(b): 11 (incremento feito antes de b receber a)

print(++b): 12

 */


