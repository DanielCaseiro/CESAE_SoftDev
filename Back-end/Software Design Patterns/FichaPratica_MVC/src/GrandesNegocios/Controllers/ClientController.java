package GrandesNegocios.Controllers;

import GrandesNegocios.Models.Sale;
import GrandesNegocios.Repositorios.SalesRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientController {
    private SalesRepository salesRepository;

    public ClientController() throws FileNotFoundException {
        this.salesRepository = new SalesRepository();
    }

    public void consultaProdutosdisponiveis(){

        // criar array auxiliar
        ArrayList<Sale> arrayAuxiliar = new ArrayList<>();

        // preencher o array auziliar com todas as vendas/produtos
        for(Sale venda : this.salesRepository.getSalesArray()){
            arrayAuxiliar.add(venda);
        }

        // excluir os produtos repetidos do array auxiliar
        for(Sale venda : arrayAuxiliar){
            int j = 1;
            for (int i = j; i > arrayAuxiliar.size(); i++){
                if(venda.getNomeProduto().equals(arrayAuxiliar.get(i).getNomeProduto())){
                    arrayAuxiliar.remove(i);
                }
            }
            j++;
        }

        // imprimir produtos disponíveis sem duplicados
        System.out.println("\n---------- Produtos disponíveis ----------");

        for(Sale venda : arrayAuxiliar){
            System.out.println(venda.getNomeProduto() + " " + venda.getPrecoUnitario() + "€");
        }

    }

    public void consultarProdutosCategoria() {

        // criar Scanner
        Scanner input = new Scanner(System.in);

        String categoriaPesquisa;

        System.out.print("\nCategoria a pesquisar: ");
        categoriaPesquisa = input.nextLine();

        // criar array auxiliar
        ArrayList<Sale> arrayAuxiliar = new ArrayList<>();

        // preencher o array auziliar com as vendas/produtos da categoria escolhida
        for(Sale venda : this.salesRepository.getSalesArray()){
            if(venda.getTipoProduto().equalsIgnoreCase(categoriaPesquisa)){
                arrayAuxiliar.add(venda);
            }
        }

        // excluir os produtos repetidos do array auxiliar
        for(Sale venda : arrayAuxiliar){
            int j = 1;
            for (int i = j; i > arrayAuxiliar.size(); i++){
                if(venda.getNomeProduto().equals(arrayAuxiliar.get(i).getNomeProduto())){
                    arrayAuxiliar.remove(i);
                }
            }
            j++;
        }

        // imprimir produtos disponíveis sem duplicados
        System.out.println("\n---------- Produtos disponíveis na categoria: " + categoriaPesquisa + " ----------");

        for(Sale venda : arrayAuxiliar){
            System.out.println(venda.getNomeProduto() + " " + venda.getPrecoUnitario() + "€");
        }

    }

    public void consultarProdutoMaisCaroBarato(){

        // criar variáveis com a primeira posição do array salesRepository
        Sale produtoMaisCaro =  this.salesRepository.getSalesArray().get(0);
        Sale produtoMaisBarato = this.salesRepository.getSalesArray().get(0);

        // iterar o array para encontrar o produto mais caro e o mais barato
        for(Sale venda : this.salesRepository.getSalesArray()){
            if(venda.getPrecoUnitario() > produtoMaisCaro.getPrecoUnitario()){
                produtoMaisCaro = venda;
            }
            if(venda.getPrecoUnitario() < produtoMaisBarato.getPrecoUnitario()){
                produtoMaisBarato = venda;
            }
        }


        // Ler a opção do utilizador
        Scanner input = new Scanner(System.in);

        int opcao;

        do{

            System.out.println("1. Consultar o produto mais barato.");
            System.out.println("2. Consultar o produto mais caro.");
            System.out.println("0. sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = input.nextInt();

            if(opcao < 0 || opcao > 2){
                System.out.println("Opção inválida.");
            }

            if(opcao == 1){
                System.out.println("O produto mais barato é:");
                System.out.println(produtoMaisBarato.getNomeProduto() + " " + produtoMaisBarato.getPrecoUnitario() + "€");
                return;
            }

            if(opcao == 2){
                System.out.println("O produto mais caro é:");
                System.out.println(produtoMaisCaro.getNomeProduto() + " " + produtoMaisCaro.getPrecoUnitario() + "€");
                return;
            }

        } while(opcao != 0);

        if(opcao == 0){
            return;
        }
    }



}
