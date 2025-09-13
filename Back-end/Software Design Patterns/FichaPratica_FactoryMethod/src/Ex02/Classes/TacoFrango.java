package Ex02.Classes;

public class TacoFrango extends Taco{

    public TacoFrango(int tamanho, double preco, boolean picancia) {
        super(tamanho, preco, picancia);
    }

    @Override
    public void Prepare(){
        System.out.println("\nA preparar taco de frango\n");
    }

    @Override
    public void Bake(){
        System.out.println("\nA cozinhar taco de frango\n");
    }

    @Override
    public void Box(){
        System.out.println("\nA embalar taco de frango\n");
    }

}
