package Ex02.Classes;

public class TacoFactory {

    public static Taco createTaco(String type, int tamanho, double preco, boolean picancia) {
        switch (type) {
            case "carne":
                return new TacoCarne(tamanho, preco, picancia);
            case "frango":
                return new TacoFrango(tamanho, preco, picancia);
            case "vegetariano":
                return new TacoVegetariano(tamanho, preco, picancia);
            default:
                throw new IllegalArgumentException("\nTipo de taco inválido: " + type);
        }
    }

}
