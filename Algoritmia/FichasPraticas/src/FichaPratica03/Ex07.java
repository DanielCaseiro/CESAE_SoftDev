package FichaPratica03;

public class Ex07 {

    public static void main(String[] args) {

        // Declaração da variável
        int numero = 1, soma = 0;


        // Apresentar os numeros e calcular a soma
        while (numero <= 100) {
            System.out.println(numero);
            soma = soma + numero;
            numero++;
        }

        // Apresentar a soma
        System.out.println("A soma é : " + soma);

    }
}
