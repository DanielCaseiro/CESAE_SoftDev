package Ex02.Classes;

public class TacoVegetariano extends Taco{

    public TacoVegetariano(int tamanho, double preco, boolean picancia) {
        super(tamanho, preco, picancia);
    }

    @Override
    public void Prepare(){
        System.out.println("\nA preparar taco vegetariano\n");
    }

    @Override
    public void Bake(){
        System.out.println("\nA cozinhar taco vegetariano\n");
    }

    @Override
    public void Box(){
        System.out.println("\nA embalar taco vegetariano\n");
    }

}
