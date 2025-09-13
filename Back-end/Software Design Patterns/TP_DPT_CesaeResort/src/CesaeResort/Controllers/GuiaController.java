package CesaeResort.Controllers;

import CesaeResort.Models.Experiencia;
import CesaeResort.Models.Venda;
import CesaeResort.Repositories.ExperienciasRepository;
import CesaeResort.Repositories.VendasRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GuiaController {
    // Atributos
    private ExperienciasRepository experienciasRepository;
    private VendasRepository vendasRepository;

    // Construtor
    public GuiaController() throws FileNotFoundException {
        this.experienciasRepository = new ExperienciasRepository();
        this.vendasRepository = new VendasRepository();
    }



    // Metodos

    /**
     * Metodo que itera os arrays de experiências e de vendas para obter as informações sobre
     * as experiências do guia cujo id foi passado por parâmetro
     * @param idGuia Uma String que representa o id do guia que está a utilizar o programa
     * @return Um ArrayLIst de Strings com as informações das exeriências sob responsabilidade do guia
     */
    public ArrayList<String> consultarHistoricoExperiencias(String idGuia){

        // Criar o ArrayList de Strings para armazenar as informações das experiências
        ArrayList<String> historicoExperiencias = new ArrayList<>();

        // Iterar o array de Experiências para encontrar aquelas que tem o Guia como responsável
        // (sabemos qual é o guia pelo username utilizado, uma vez que o id dos guias é igual a seu username e
        // este valor foi passado por parâmetro do menuLogin para o menuGuia e do menuGuia para cá)

        for (Experiencia experiencia : this.experienciasRepository.getExperienciasArray()) {
            // Filtrar experiências do guia
            if (experiencia.getIdGuiaExperiencia().equals(idGuia)) {

                // Criar contadores para os bilhetes de adultos e crianças
                int totalAdultos = 0;
                int totalCriancas = 0;

                // Iterar o array vendas e, para cada venda, verificar se corresponde à experiência do guia
                for (Venda venda : this.vendasRepository.getVendasArray()) {
                    if (venda.getIdExperiencia().equals(experiencia.getIdExperiencia())) {

                        // Verificar o tipo de cliente e somar ao contador correspondente

                        if (venda.getTipoCliente().equalsIgnoreCase("adulto")) {
                            totalAdultos++;
                        } else if (venda.getTipoCliente().equalsIgnoreCase("crianca")) {
                            totalCriancas++;
                        }
                    }
                }


                // Calcular total arrecadado nesta experiência
                double totalArrecadado = (totalAdultos * experiencia.getPrecoAdulto()) + (totalCriancas * experiencia.getPrecoCrianca());

                // Criar String com as informações desta experiência
                String infoExperienciaGuia = experiencia.getNome() +
                        " | " + totalAdultos +
                        " | " + totalCriancas +
                        " | " + totalArrecadado + " €";

                // adicionar a String no Array do Historico
                historicoExperiencias.add(infoExperienciaGuia);
            }
        }

        return historicoExperiencias;
    }


}
