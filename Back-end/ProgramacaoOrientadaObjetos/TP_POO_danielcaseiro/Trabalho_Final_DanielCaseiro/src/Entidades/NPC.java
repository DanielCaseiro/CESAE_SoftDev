package Entidades;

import Itens.ItemHeroi;

import java.io.FileNotFoundException;

import static Funcoes.Funcoes.imprimirFile;

public class NPC extends Entidade {
    // Atributos
    private int ouro;
    private ItemHeroi item;
    private String imagemFilePath;
    private String dialogosFilePath;
    private boolean finalBoss;

    // Construtor
    public NPC(String nome, int maxHP, int forca, int ouro, ItemHeroi item, String imagemFilePath, String dialogosFilePath) {
        super(nome, maxHP, forca);
        this.ouro = ouro;
        this.item = item;
        this.imagemFilePath = imagemFilePath;
        this.dialogosFilePath = dialogosFilePath;
    }

    public NPC(String nome, int maxHP, int forca, int ouro, String imagemFilePath, String dialogosFilePath) {
        super(nome, maxHP, forca);
        this.ouro = ouro;
        this.item = null;
        this.imagemFilePath = imagemFilePath;
        this.dialogosFilePath = dialogosFilePath;
        this.finalBoss = false;
    }

    // getters
    public int getOuro() { return ouro; }

    public ItemHeroi getItem() { return item; }

    public String getImagemFilePath() {
        return imagemFilePath;
    }

    public String getDialogosFilePath() {
        return dialogosFilePath;
    }

    public boolean isFinalBoss() {
        return finalBoss;
    }

    public void setFinalBoss(boolean finalBoss) {
        this.finalBoss = finalBoss;
    }

    // Metodo Exibir Detalhes
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(" | ouro: " + this.ouro);
    }


    // Metodo dialogar

    /**
     * Metodo que imprime os arquivos de texto com os dialogos do NPC
     * @throws FileNotFoundException Caso os arquivos de texto não sejam encontrados
     */
    public void dialogar() throws FileNotFoundException {
        // imprimir imagem do NPC
        imprimirFile(this.getImagemFilePath());

        // imprimir dialogos do NPC
        imprimirFile(this.getDialogosFilePath());

        // executar audios do NPC
    }


}
