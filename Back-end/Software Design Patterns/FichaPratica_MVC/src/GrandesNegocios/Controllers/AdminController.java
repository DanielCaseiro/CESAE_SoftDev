package GrandesNegocios.Controllers;

import GrandesNegocios.Models.Sale;
import GrandesNegocios.Repositorios.SalesRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AdminController {
    private SalesRepository salesRepository;

    public AdminController() throws FileNotFoundException {
        this.salesRepository = new SalesRepository();
    }

    public double totalSalesValue() {

        double totalSalesValue = 0;

        for (Sale saleAtual : this.salesRepository.getSalesArray()) {
            totalSalesValue += saleAtual.getQuantidadeVendida() * saleAtual.getPrecoUnitario();
        }

        return totalSalesValue;
    }

    public Sale produtoMaisUnidadesVendidas(){

        // criar array auxiliar
        ArrayList<Sale> arrayAuxiliar = new ArrayList<>();

        // preencher o array auziliar com todas as vendas/produtos
        for(Sale venda : this.salesRepository.getSalesArray()){
            arrayAuxiliar.add(venda);
        }

        // somar as vendas dos produtos iguais
        for(Sale venda : arrayAuxiliar){
            int j = 1;
            for (int i = j; i > arrayAuxiliar.size(); i++){
                if(venda.getNomeProduto().equals(arrayAuxiliar.get(i).getNomeProduto())){
                    venda.setQuantidadeVendida(venda.getQuantidadeVendida() + arrayAuxiliar.get(i).getQuantidadeVendida());
                    arrayAuxiliar.remove(i);
                }
            }
            j++;
        }

        // iterar o array auxiliar para encontrar o produto que vendeu mais unidades
        Sale produtoMaisVendidoUnidades = arrayAuxiliar.get(0);

        for(Sale venda : arrayAuxiliar){
            if(venda.getQuantidadeVendida() > produtoMaisVendidoUnidades.getQuantidadeVendida()){
                produtoMaisVendidoUnidades =  venda;
            }

        }

        return produtoMaisVendidoUnidades;

    }

    public double AverageSalesValue(){
        return this.AverageSalesValue()/this.salesRepository.getSalesArray().size();
    }
}
