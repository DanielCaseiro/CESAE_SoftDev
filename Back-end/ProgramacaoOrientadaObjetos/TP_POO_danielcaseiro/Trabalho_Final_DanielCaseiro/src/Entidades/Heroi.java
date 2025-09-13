package Entidades;

import Itens.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static Jogo.Jogo.fimDeJogo;


public class Heroi extends Entidade {
    // Atributos
    protected int nivel;
    protected int ouro;
    protected Arma armaPrincipal;
    protected ArrayList<Consumivel> inventario;
    protected ArrayList<Arma> armas;
    protected ArrayList<ItemHeroi> equipamentos;

    // Construtor
    public Heroi(String nome, int maxHP, int forca, int ouro) {
        super(nome, maxHP, forca);
        this.nivel = 0;
        this.ouro = ouro;
        this.inventario = new ArrayList<Consumivel>();
        this.armas = new ArrayList<Arma>();
        this.equipamentos = new ArrayList<ItemHeroi>();
    }

    // getters
    public int getNivel() {
        return nivel;
    }

    public int getOuro() {
        return ouro;
    }

    public Arma getArmaPrincipal() {
        return armaPrincipal;
    }

    public ArrayList<ItemHeroi> getEquipamentos() {
        return equipamentos;
    }

    // setters
    public void setNivel(int nivel) { this.nivel = nivel; }

    public void setOuro(int ouro) { this.ouro = ouro; }

    public void setArmaPrincipal(Arma armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }



    // Inserir item consumivel no inventario
    public void inserirItemInventario(Consumivel novoItem){
        this.inventario.add(novoItem);
    }

    // Remover item consumivel do inventario
    public void removerItemInventario(Consumivel itemRemover){
        this.inventario.remove(itemRemover);
    }

    // Inserir arma nas armas
    public void inserirArma(Arma arma){
        this.armas.add(arma);
    }

    // Remover arma das armas
    public void removerArma(Arma arma){ this.armas.remove(arma); }

    // Inserir item nos equipamentos
    public void inserirItemEquipamentos(ItemHeroi novoEquipamento){ this.equipamentos.add(novoEquipamento);}

    // Remover item dos equipamentos
    public void removerItemEquipamentos(ItemHeroi equipamentoRemover){ this.equipamentos.remove(equipamentoRemover); }


    // Metodo exibir detalhes
    @Override

    /**
     * Metodo que exibe todos os atributos deste objeto
     */
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(" | nível: " + this.nivel);
        System.out.println(" | ouro: " + this.ouro);
        System.out.println(" | arma equipada: " + this.armaPrincipal.getNome());
    }

    // Metodo exibir inventário

    /**
     * Metodo que imprime na consola todos os itens consumíveis no arrayList inventario do Heroi
     */
    public void exibirInventario() {
        System.out.println(" ");
        System.out.println("--------------- Inventário  ---------------");


        for (Consumivel itemConsumivel : this.inventario) {
            System.out.print(" | ");
            System.out.println(itemConsumivel.getNome());
        }

    }

    // Metodo exibir armas

    /**
     * Metodo que imprime na consola todas as armas no arrayList armas do Heroi
     */
    public void exibirArmas(){
        System.out.println(" ");
        System.out.println("--------------- Armas ---------------");

        for (Arma arma : this.armas){
            System.out.print(" | ");
            System.out.println(arma.getNome());
        }

    }

    // Metodo exibir equipamentos

    /**
     * Metodo que imprime na consola todos os itens no arrayList equipamentos do Heroi
     */
    public void exibirEquipamentos(){
        System.out.println(" ");
        System.out.println("--------------- Equipamentos ---------------");

        for (ItemHeroi equipamento : this.equipamentos){
            System.out.print(" | ");
            System.out.println(equipamento.getNome());
        }
    }


    // Metodo trocar de arma

    /**
     * Metodo que permite ao jogador visualizar todas as armas do heroi e decidir qual ele quer que seja a sua arma principal
     */
    public void trocarArma() {

        System.out.println(" ");
        System.out.println("--------------- Armas ---------------");

        int i = 1;
        for (Arma arma : this.armas){
            System.out.print(i + ". ");
            System.out.println(arma.getNome());
            i++;
        }

        System.out.println("0. SAIR");

        int opcao;
        int indexItem;

        do {

            System.out.println(" ");
            System.out.print("Escolha uma arma para ser sua arma principal: ");

            Scanner sc = new Scanner(System.in);
            opcao = sc.nextInt();

            if(opcao < 0 || opcao > this.armas.size()) {

                System.out.println(" ");
                System.out.println("Opção inválida.");

            } else if (opcao == 0) {
                return;
            } else {
                indexItem = opcao -1;
                break;
            }

        } while (true);


        Arma armaAnterior = this.getArmaPrincipal();

        this.inserirArma(armaAnterior);
        this.setArmaPrincipal(armas.get(indexItem));

        System.out.println(" ");
        System.out.println("Arma equipada com sucesso!");

    }


    // Metodo usar poção

    /**
     * Metodo que exibe todas as poções no inventario do heroi e permite que ele escolha uma para usar
     */
    public void usarPocao() {

        // Criar array auxiliar
        ArrayList<Consumivel> arrayAuxiliar = new ArrayList<>();

        // preencher o array auxiliar apenas com as poções no inventário
        for (Consumivel item : this.inventario){

            if(item instanceof Pocao) {

               arrayAuxiliar.add(item);

            }
        }

        if (arrayAuxiliar.isEmpty()) {
            System.out.println("Não há poções disponíveis.");
            return;
        }

        // Imprimir poções
        System.out.println(" ");
        System.out.println("--------------- Poções ---------------");

        int i = 1;
        for (Consumivel item : arrayAuxiliar){

            System.out.print(i + ". " );
            System.out.println(item.getNome());

            i++;
        }

        System.out.println("0. SAIR");

        int opcao;
        int indexItem;

        do {

            System.out.println(" ");
            System.out.print("Escolha uma poção para utilizar: ");

            Scanner sc = new Scanner(System.in);
            opcao = sc.nextInt();

            indexItem = opcao -1;

            if(indexItem < 0 || indexItem > this.armas.size()) {

                System.out.println(" ");
                System.out.println("Opção inválida.");

            } else if (opcao == 0) {
                return;
            } else {
                indexItem = opcao -1;
                break;
            }

        } while (true);

        // type casting
        Consumivel itemEscolhido = arrayAuxiliar.get(indexItem);
        Pocao pocaoEscolhida = (Pocao) itemEscolhido;

        // Usar a poção
       this.hp += pocaoEscolhida.getVidaCurar();
       if(this.hp > this.maxHP){ this.hp = this.maxHP;}

        this.forca += pocaoEscolhida.getAumentoForca(); // este aumento será removido quando o heroi mudar de local
        this.inventario.remove(pocaoEscolhida);
        System.out.println(" ");
        System.out.println("Poção usada com sucesso!");

    }

    // Metodo usar consumímel em combate

    /**
     * Metodo que, durante o combate(metodo atacar), exibe todos os consumíveis de combate do Heroi e permite que ele use um no seu turno
     * @param inimigo É o objeto NPC que está sendo atacado em combate pelo Heroi
     */
    public void usarConsumivelCombate(NPC inimigo) {

        // Criar array auxiliar
        ArrayList<Consumivel> arrayAuxiliar = new ArrayList<>();

        // preencher o array auxiliar apenas com as poções no inventário
        for (Consumivel item : this.inventario){

            if(item instanceof ConsumivelCombate) {

                arrayAuxiliar.add(item);

            }
        }

        if (arrayAuxiliar.isEmpty()) {
            System.out.println("Não há itens disponíveis para uso em combate.");
            return;
        }

        // Imprimir consumiveis de combate
        System.out.println(" ");
        System.out.println("--------------- Consumíveis de Combate ---------------");

        int i = 1;
        for (Consumivel item : arrayAuxiliar){

            System.out.print(i + ". " );
            System.out.println(item.getNome());

            i++;
        }

        System.out.println("0. SAIR");

        int opcao;
        int indexItem;

        do {

            System.out.println(" ");
            System.out.print("Escolha um item para utilizar: ");

            Scanner sc = new Scanner(System.in);
            opcao = sc.nextInt();

            indexItem = opcao -1;

            if(indexItem < 0 || indexItem > this.armas.size()) {

                System.out.println(" ");
                System.out.println("Opção inválida.");

            } else if (opcao == 0) {
                return;
            } else {
                indexItem = opcao -1;
                break;
            }

        } while (true);

        // type casting
        Consumivel itemEscolhido = arrayAuxiliar.get(indexItem);
        ConsumivelCombate consumivelEscolhido = (ConsumivelCombate) itemEscolhido;

        // Usar consumivel de combate
        inimigo.setHp(inimigo.getHp() - consumivelEscolhido.getAtaqueInstantaneo());
        this.inventario.remove(consumivelEscolhido);
        System.out.println(" ");
        System.out.println("Dano causado: " + consumivelEscolhido.getAtaqueInstantaneo());

    }


    // Metodo Atacar/ combate

    /**
     * Metodo que gerencia o combate do jogo. É diferente para cada subclasse de Heroi. Também é este metodo que chama indiretamente o metodo fimDeJogo quando o Heroi derrota o Final Boss.
     * @param inimigo É o objeto NPC que está sendo atacado em combate pelo Heroi
     * @return retorna verdadeiro se o heroi ganha o combate e falso se perde
     * @throws FileNotFoundException Caso a mensagem de fim de jogo não seja encontrada (mensagem exibida quando se derrota o Final Boss)
     */
    public boolean atacar(NPC inimigo) throws FileNotFoundException {

        // imprimir imagem do inimigo
        // imprimir dialogos do inimigo
        // executar audios do inimigo

        // executar musica de combate

        return resultadoCombate(inimigo);
    };

    // Metodo resultado do combate

    /**
     * Metodo que complementa o metodo atacar e administra  a parte final do combate (que é igual para todas as subclasses de Heori). É o metodo que chama o fimDeJogo
     * @param inimigo É o objeto NPC que está sendo atacado em combate pelo Heroi
     * @return retorna verdadeiro se o heroi ganha o combate e falso se perde
     * @throws FileNotFoundException Caso a mensagem de fim de jogo não seja encontrada (mensagem exibida quando se derrota o Final Boss)
     */
    protected boolean resultadoCombate(NPC inimigo) throws FileNotFoundException {
        if (this.hp > 0 && inimigo.getHp() <= 0) {
            System.out.println(" ");
            System.out.println("Venceu o combate!");

            if(inimigo.isFinalBoss()) {
                fimDeJogo();
            }

            this.nivel++;
            this.maxHP += 10;
            this.hp += 10;
            if(this.hp > this.maxHP) {this.hp = this.maxHP;}
            this.forca++;
            this.ouro += inimigo.getOuro();
            this.exibirDetalhes();
            return true;

        } else {
            System.out.println(" ");
            System.out.println("Seu herói foi derrotado.");
            return false;
        }
    }

}
