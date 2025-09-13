package Ex03.Classes;

import Ex03.Enumeracoes.Extensoes;

public abstract class Document {
    String autor;
    String nome;
    Extensoes extensao;

    public Document(String autor, String nome, Extensoes extensao) {
        this.autor = autor;
        this.nome = nome;
        this.extensao = extensao;
    }

    public abstract void Open();

    public abstract void Save();

    public abstract void Close();
}
