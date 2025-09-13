package Ex03.Classes;

import Ex03.Enumeracoes.Extensoes;

public class DocCalculo extends Document{

    public DocCalculo(String autor, String nome, Extensoes extensao) {
        super(autor, nome, extensao);
    }

    @Override
    public void Open(){
        System.out.println("\nA abrir a folha de cálculo " +  this.nome + "." + this.extensao + "\n");
    }

    @Override
    public void Save(){
        System.out.println("\nAlterações do " + this.autor + " gravadas\n");
    }

    @Override
    public void Close(){
        System.out.println("\nA fechar a folha de cálculo\n");
    }

}
