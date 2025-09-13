package Ex03.Classes;

import Ex03.Enumeracoes.Extensoes;

public class DocApresentacao extends Document{

    public DocApresentacao(String autor, String nome, Extensoes extensao) {
        super(autor, nome, extensao);
    }

    @Override
    public void Open(){
        System.out.println("\nA abrir o documento de apresentação " +  this.nome + "." + this.extensao + "\n");
    }

    @Override
    public void Save(){
        System.out.println("\nAlterações do " + this.autor + " gravadas\n");
    }

    @Override
    public void Close(){
        System.out.println("\nA fechar o documento de apresentação\n");
    }
}
