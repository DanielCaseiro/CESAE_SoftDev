package Classes.SeresVivos;

public class Inseto extends SerVivo{
    // Atributos
    // Boolean Venenoso

    private boolean venenoso;

    // Construtor

    public Inseto(String nome, String especie, String pais, int idade, boolean venenoso) {
        super(nome, especie, pais, idade);
        this.venenoso = venenoso;
    }


    // Exibir Detalhes
    @Override
    public void exibirDetalhes(){
        this.exibirDetalhes();
        System.out.println(" | venenoso: " + this.venenoso);
        System.out.println(" ");
    }

    // Metodo...
}
