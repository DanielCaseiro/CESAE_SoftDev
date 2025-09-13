package Entidades;

import Itens.Arma;
import Itens.Consumivel;
import Itens.ItemHeroi;
import Itens.Pocao;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Vendedor extends Entidade {
    // Atributos
    private ArrayList<ItemHeroi> loja;
    private String imagemFilePath;
    private String dialogosFilePath;

    // Construtor
    public Vendedor(String nome, int maxHP, int forca, String imagemFilePath, String dialogosFilePath) {
        super(nome, maxHP, forca);
        this.imagemFilePath = imagemFilePath;
        this.dialogosFilePath = dialogosFilePath;
        this.loja = new ArrayList<ItemHeroi>();
    }

    // Metodo inserir item na loja
    public void inserirItemLoja(ItemHeroi novoItem){ this.loja.add(novoItem);}

    // Remover item da loja
    public void removerItemLoja(ItemHeroi itemRemover){ this.loja.remove(itemRemover); }


    // Metodo array auxiliar vendedor (para limitar os itens mostrado em 10)

    /**
     * Metodo que cria um ArrayList auxiliar de 10 itens a partir dos itens na loja do vendedor. O primeiro item sempre é uma poção de cura e o segundo é uma arma permitida para a subclasse do Heroi.
     * @param heroi O heroi que comprará os itens do vendedor caso tenha ouro suficiente
     * @return
     */
    public ArrayList<ItemHeroi> arrayAuxiliarVendedor(Heroi heroi) {

        // Criar array vazio
        ArrayList<ItemHeroi> arrayAuxiliar = new ArrayList<>();

        // Garantir que a primeira posição seja sempre uma poção de cura
        Pocao pocaoCura = new Pocao("Poção de Cura simples", 1, 25, 0);
        pocaoCura.inserirHeroiPermitido("Cavaleiro");
        pocaoCura.inserirHeroiPermitido("Feiticeiro");
        pocaoCura.inserirHeroiPermitido("Arqueiro");
        arrayAuxiliar.add(pocaoCura);

        // Garantir que a segunda posição seja sempre uma arma da classe do herói
        for (ItemHeroi itemAtual : this.loja) {
            if (heroi instanceof Cavaleiro && itemAtual.getHeroisPermitidos().contains("Cavaleiro")) {
                arrayAuxiliar.add(itemAtual);
                break;
            } else if (heroi instanceof Feiticeiro && itemAtual.getHeroisPermitidos().contains("Feiticeiro")) {
                arrayAuxiliar.add(itemAtual);
                break;
            } else if (heroi instanceof Arqueiro && itemAtual.getHeroisPermitidos().contains("Arqueiro")) {
                arrayAuxiliar.add(itemAtual);
                break;
            }

        }

        // Escolher os outros 8 itens randomicamente
        Random r = new Random();


        for (int i = 0; i < 8; i++) {
            int indexItemAleatorio = r.nextInt(1, this.loja.size());
            ItemHeroi itemAleatorio = this.loja.get(indexItemAleatorio);
            arrayAuxiliar.add(itemAleatorio);
        }

        return arrayAuxiliar;
    }


    // Metodo imprimir loja

    /**
     * Metodo que imprime na consola os 10 itens do array Auxiliar do vendedor
     * @param arrayAuxiliar é o Array contendo os itens a serem mostrados
     */
    public void imprimirLoja(ArrayList<ItemHeroi> arrayAuxiliar) {

        System.out.println(" ");
        System.out.println("--------------- Loja ---------------");

        int i = 1;
        for (ItemHeroi itemAtual : arrayAuxiliar) {
            System.out.println(" ");
            System.out.println(i + ". ");
            System.out.println(" | nome: " + itemAtual.getNome());
            System.out.println(" | preço: " + itemAtual.getPreco());
            System.out.print("| heróis permitidos: " + itemAtual.getHeroisPermitidos());
            System.out.print(" ");
            i++;
        }

        System.out.print(" ");
        System.out.println("0. SAIR");
        System.out.print(" ");

    }

    // Metodo vender

    /**
     * Metodo que utiliza os dois anteriores para oferecer itens ao jogador e checar se o jogador possui ouro suficiente para a compra.
     * @param heroi O heroi que tentará comprar os itens do vendedor
     */
    public void vender(Heroi heroi) {

        Scanner sc = new Scanner(System.in);

        ArrayList<ItemHeroi> arrayAuxiliar = arrayAuxiliarVendedor(heroi);

        // imprimir imagem do vendedor
        // imprimir dialogos do vendedor
        // executar audios do vendedor

        imprimirLoja(arrayAuxiliar);

        int indexItem = -1;

        // Ciclo para validar opção de compra
        do {
            System.out.print(" ");
            System.out.print("Escolha uma opção para comprar: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer pendente

            if (opcao == 0) {
                System.out.println(" ");
                System.out.println("Saindo do menu de compras.");
                break;
            } else {
                indexItem = opcao -1;
            }

            // Checar se o heroi possui ouro suficiente
            if (heroi.getOuro() < arrayAuxiliar.get(indexItem).getPreco()) {
                System.out.println(" ");
                System.out.println("Ouro insuficiente.");
            }

            // Checar se o herói pode usar o item
            if(heroi instanceof Arqueiro && !arrayAuxiliar.get(indexItem).getHeroisPermitidos().contains("Arqueiro")){
                System.out.println(" ");
                System.out.println("Herói não pode usar este item.");
            } else if (heroi instanceof Feiticeiro && !arrayAuxiliar.get(indexItem).getHeroisPermitidos().contains("Feiticeiro")) {
                System.out.println(" ");
                System.out.println("Herói não pode usar este item.");
            } else if (heroi instanceof Cavaleiro && !arrayAuxiliar.get(indexItem).getHeroisPermitidos().contains("Cavaleiro")) {
                System.out.println(" ");
                System.out.println("Herói não pode usar este item.");
            }

            // checar se a opção é válida
            if (indexItem < 0 || indexItem > loja.size()) {
                System.out.println(" ");
                System.out.println("Opção inválida. Por favor, escolha um número entre 1 e " + loja.size() + ", ou 0 para sair.");
            } else {
                System.out.println(" ");
                System.out.println("Item " + arrayAuxiliar.get(indexItem).getNome() + " selecionado para compra.");
                break;
            }

        } while (true);

        ItemHeroi itemComprado = arrayAuxiliar.get(indexItem);

        // subtrair o preço do ouro do heroi
        heroi.setOuro(heroi.getOuro() - itemComprado.getPreco());

        // Colocar o item comprado no sítio certo
        if (itemComprado instanceof Arma) {
            Arma armaComprada = (Arma) itemComprado;
            Arma armaAnterior = heroi.getArmaPrincipal();

            heroi.inserirArma(armaAnterior);
            heroi.setArmaPrincipal(armaComprada);

        } else if (itemComprado instanceof Consumivel) {
            Consumivel consumivelComprado = (Consumivel) itemComprado;
            heroi.inserirItemInventario(consumivelComprado);

        } else {
            heroi.inserirItemEquipamentos(itemComprado);
        }

        // retirar o item da loja
        this.loja.remove(itemComprado);

        System.out.println(" ");
        System.out.println("Compra realizada com sucesso!");

    }
}
