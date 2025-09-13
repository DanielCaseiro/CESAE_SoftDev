package Ex02.Classes;

public class TacoCarne extends Taco{

    public TacoCarne(int tamanho, double preco, boolean picancia) {
        super(tamanho, preco, picancia);
    }

    @Override
    public void Prepare(){
        System.out.println("\nA preparar taco de carne\n");
    }

    @Override
    public void Bake(){
        System.out.println("\nA cozinhar taco de carne\n");
    }

    @Override
    public void Box(){
        System.out.println("\nA embalar taco de carne\n");
    }

}
