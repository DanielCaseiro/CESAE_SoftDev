package Classes.SeresVivos;

public class SerVivo {
    // Atributos
    protected String nome;
    protected String especie;
    protected  String pais;
    protected int idade;

    // Construtor
    public SerVivo(String nome, String especie, String pais, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.pais = pais;
        this.idade = idade;
    }

    // Acesso

    // get
    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    // Exibir Detalhes
    public void exibirDetalhes(){
        System.out.println("--------------- Detalhes do Ser Vivo " + this.especie + " " + this.nome + " ---------------");
        System.out.println(" ");
        System.out.print("nome: " + this.nome +
                " | espécie: " + this.especie +
                " | país de origem: " + this.pais +
                " | idade: " + this.idade
        );
    }


    // Metodo...
}
