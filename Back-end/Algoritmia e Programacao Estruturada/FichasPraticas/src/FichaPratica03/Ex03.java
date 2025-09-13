package FichaPratica03;

public class Ex03 {

    public static void main(String[] args) {

        // Declaração da variável
        int numero = 530;

        // Apresentação dos números ímpares
        while (numero <= 749) {
            numero = numero + 1; // numero++;

            if (numero % 2 != 0) { // pode tirar este if somando +2 ao invés de +1
                System.out.println(numero);
            }
        }
    }
}
