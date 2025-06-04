package FichaPratica07;

import java.util.Arrays;

public class Ex10 {

    public static void main(String[] args) {

        String [] silabas = {"a", "e", "i", "o", "u"};


//        String [] silabas = new String[3];
//
//        silabas [0] = "a";
//        silabas [1] = "e";
//        silabas [2] = "i";

        System.out.println(" ");
        System.out.println("array inicializado diretamente com chaves:");
        System.out.print(Arrays.toString(silabas));
        System.out.println(" ");

        char[][] matriz = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'}
        };

        System.out.println(" ");
        System.out.println("matriz inicializada diretamente com chaves:");
        System.out.println(Arrays.deepToString(matriz));
        System.out.println(" ");

    }






}
