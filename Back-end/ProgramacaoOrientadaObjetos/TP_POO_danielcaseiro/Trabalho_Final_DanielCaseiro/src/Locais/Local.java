package Locais;

import Entidades.Entidade;
import Entidades.NPC;
import Entidades.Vendedor;
import Itens.Arma;
import Itens.ItemHeroi;

import java.util.ArrayList;

public class Local {
    // Atributos
    private String nome;
    private ItemHeroi chave;
    private String mensagemChave;
    private String descricaoFilePath;
    private String imagemFilePath;
    private ArrayList<String> opcoesExplorar;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<NPC> amigos;
    private ArrayList<NPC> inimigos;
    private NPC inimigoOculto;
    private ArrayList<ItemHeroi> tesouros;
    private ItemHeroi tesouroOculto;
    private ArrayList<Local> saidas; // a primeira saida do array deve ser sempre o local anterior
    private Local passagemSecreta;
    private ItemHeroi chaveOculta;

    // Construtor
    public Local(String nome, String descricaoFilePath, String imagemFilePath) {
        this.nome = nome;
        this.chave = null;
        this.mensagemChave = null;
        this.descricaoFilePath = descricaoFilePath;
        this.imagemFilePath = imagemFilePath;
        this.opcoesExplorar = new ArrayList<String>();;
        this.vendedores = new ArrayList<Vendedor>();;
        this.amigos = new ArrayList<NPC>();;
        this.inimigos = new ArrayList<NPC>();
        this.inimigoOculto = null;
        this.tesouros = new ArrayList<ItemHeroi>();;
        this.tesouroOculto = null;
        this.saidas = new ArrayList<Local>();;
        this.passagemSecreta = null;
        this.chaveOculta = null;
    }


    // getters
    public String getNome() {
        return nome;
    }

    public String getDescricaoFilePath() {
        return descricaoFilePath;
    }

    public String getImagemFilePath() {
        return imagemFilePath;
    }

    public NPC getInimigoOculto() {
        return inimigoOculto;
    }

    public ItemHeroi getTesouroOculto() {
        return tesouroOculto;
    }

    public Local getPassagemSecreta() {
        return passagemSecreta;
    }

    public ArrayList<String> getOpcoesExplorar() {
        return opcoesExplorar;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public ArrayList<NPC> getAmigos() {
        return amigos;
    }

    public ArrayList<NPC> getInimigos() {
        return inimigos;
    }

    public ArrayList<ItemHeroi> getTesouros() {
        return tesouros;
    }

    public ArrayList<Local> getSaidas() {
        return saidas;
    }

    public ItemHeroi getChave() {
        return chave;
    }

    public String getMensagemChave() {
        return mensagemChave;
    }

    public ItemHeroi getChaveOculta() {
        return chaveOculta;
    }

    // setters
    public void setInimigoOculto(NPC inimigoOculto) {
        this.inimigoOculto = inimigoOculto;
    }

    public void setTesouroOculto(ItemHeroi tesouroOculto) {
        this.tesouroOculto = tesouroOculto;
    }

    public void setPassagemSecreta(Local passagemSecreta) {
        this.passagemSecreta = passagemSecreta;
    }

    public void setChave(ItemHeroi chave) {
        this.chave = chave;
    }

    public void setMensagemChave(String mensagemChave) {
        this.mensagemChave = mensagemChave;
    }

    public void setChaveOculta(ItemHeroi chaveOculta) {
        this.chaveOculta = chaveOculta;
    }

    // Acesso arrayLists

    // Inserir opcao explorar
    public void inserirOpcoesExplorar(String opcao){ this.opcoesExplorar.add(opcao);}

    // Remover opcao explorar
    public void removerOpcoesExplorar(String opcao){ this.opcoesExplorar.remove(opcao); }

    // Inserir vendedor
    public void inserirVendedor(Vendedor vendedor) {
        this.vendedores.add(vendedor);
    }

    // Remover vendedor
    public void removerVendedor(Vendedor vendedor) {
        this.vendedores.remove(vendedor);
    }


    // Inserir amigo
    public void inserirAmigo(NPC amigo) {
        this.amigos.add(amigo);
    }

    // Remover amigo
    public void removerAmigo(NPC amigo) {
        this.amigos.remove(amigo);
    }


    // Inserir inimigo
    public void inserirInimigo(NPC inimigo) {
        this.inimigos.add(inimigo);
    }

    // Remover inimigo
    public void removerInimigo(NPC inimigo) {
        this.inimigos.remove(inimigo);
    }


    // Inserir tesouro
    public void inserirTesouro(ItemHeroi tesouro) {
        this.tesouros.add(tesouro);
    }

    // Remover tesouro
    public void removerTesouro(ItemHeroi tesouro) {
        this.tesouros.remove(tesouro);
    }

    // Inserir saída
    public void inserirSaida(Local saida) {
        this.saidas.add(saida);
    }

    // Remover saída
    public void removerSaida(Local saida) {
        this.saidas.remove(saida);
    }


}
