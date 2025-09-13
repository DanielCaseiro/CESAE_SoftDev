package Entidades;

public class Entidade {
    // Atributos
    protected String nome;
    protected int maxHP;
    protected int hp;
    protected int forca;

    //Construtor
    public Entidade(String nome, int maxHP, int forca) {
        this.nome = nome;
        this.maxHP = maxHP;
        this.hp = maxHP;
        this.forca = forca;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getHp() {
        return hp;
    }

    public int getForca() {
        return forca;
    }

    // setters
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    // Metodo Exibir Detalhes

    /**
     * Metodo que exibe todos os atributos deste objeto
     */
    public void exibirDetalhes() {
        System.out.println(" ");
        System.out.println("--------------- Atributos de " + this.nome + " ---------------");
        System.out.println(" ");
        System.out.println("  | hp: " + this.hp + " de " + this.maxHP);
        System.out.println(" | força: " + this.forca);
    }

}
