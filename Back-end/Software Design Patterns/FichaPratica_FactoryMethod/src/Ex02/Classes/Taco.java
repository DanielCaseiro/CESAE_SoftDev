package Ex02.Classes;

public abstract class Taco {
    int tamanho;
    double preco;
    boolean picancia;

    // Consrutor
    public Taco(int tamanho, double preco, boolean picancia) {
        this.tamanho = tamanho;
        this.preco = preco;
        this.picancia = picancia;
    }

    public abstract void Prepare();

    public abstract void Bake();

    public abstract void Box();

}

