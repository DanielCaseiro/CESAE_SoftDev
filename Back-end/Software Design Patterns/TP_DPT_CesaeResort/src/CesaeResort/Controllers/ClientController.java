package CesaeResort.Controllers;

import CesaeResort.Models.*;
import CesaeResort.Repositories.ExperienciasRepository;
import CesaeResort.Repositories.QuartosRepository;
import CesaeResort.Repositories.ReservasRepository;
import CesaeResort.Repositories.TipologiasRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class ClientController {
    // Atributos
    private ReservasRepository reservasRepository;
    private ExperienciasRepository experienciasRepository;
    private QuartosRepository quartosRepository;
    private TipologiasRepository tipologiasRepository;

    // Construtor
    public ClientController() throws FileNotFoundException {
        this.reservasRepository = new ReservasRepository();
        this.experienciasRepository = new ExperienciasRepository();
        this.quartosRepository = new QuartosRepository();
        this.tipologiasRepository = new TipologiasRepository();
    }


    // Metodos

    /**
     * Metodo que itera os arrays de quartos e de reservas para encontrar os quartos que estão disponíveis esta semana
     * @return Retorna um mapa de objetos das classes Quarto (os quartos disponíveis) e
     * Tipologia (a tipologia correspondente a cada quarto disponível)
     */
    public HashMap<Quarto, Tipologia> consultarQuartosDisponiveis(){
        // Criar arrayList vazio de quartos disponíveis
        ArrayList<Quarto> quartosDisponiveis = new ArrayList<>();

        // Criar variáveis para ano, mes e semana atuais
        int anoAtual = 2025;
        int mesAtual = 7;
        int semanaAtual = 1;

        // Iterar o array de quartos
        for (Quarto quarto : this.quartosRepository.getQuartosArray()) {

            // criar falg/boolean para filtrar quartos disponíveis de quartos já reservados
            boolean reservado = false;

            // Iterar o array de reservas para ver se o quarto está reservado esta semana
            for(Reserva reserva : this.reservasRepository.getReservasArray()){
                if (reserva.getNumQuarto() == quarto.getNumQuarto() && reserva.getAnoReserva() == anoAtual && reserva.getMesReserva() == mesAtual && reserva.getSemanaReserva() == semanaAtual) {
                    reservado = true;
                    break;
                }
            }

            // se o quarto não estiver reservado, adicioná-lo ao array de quartos disponíveis
            if (!reservado) {
                quartosDisponiveis.add(quarto);
            }
        }

        // Criar um Map com os quartos disponíveis e as respectivas tipologias
        HashMap<Quarto, Tipologia> mapaQuartoTipologia = new HashMap<>();

        for(Quarto quartoDisponivel : quartosDisponiveis) {
            for(Tipologia tipologia : this.tipologiasRepository.getTipologiasArray()) {
                if(quartoDisponivel.getIdIipologia() == tipologia.getIdTipologia()) {
                    mapaQuartoTipologia.put(quartoDisponivel,tipologia);
                    break;
                }
            }
        }


        return mapaQuartoTipologia;
    }

    /**
     * Metodo que itera os arrays de experiências, guias e ratings para criar ArrayList de Strings
     * com as informações a serem impressas na view (nome_experiencia, rating_experiencia, nome do guia,
     * rating_guia, preco_adulto, preco_crianca)
     * @return Retorna um ArrayList de Strings com as informações a serem impressas na view
     */
    public ArrayList<String> consultarExperienciasDisponiveis(){

        ArrayList<String> informacoesExperienciasDisponiveis = new ArrayList<>();

        return informacoesExperienciasDisponiveis;

    }

    /**
     * Metodo que itera os arrays de experincias e ratings para encontrar a experiência com melhor rating
     * @return Retorna um objeto da classe Experiência que representa a experiência com melhor rating
     */
    public Experiencia consultarExperienciaFavorita(){

        Experiencia experienciaFavorita = null;

        return experienciaFavorita;

    }

    /**
     * Metodo que itera os arrays de experincias e vendas para encontrar a experiência com mais bilhetes vendidos
     * @return Retorna um objeto da classe Experiência que representa a experiência com mais bilhetes vendidos
     */
    public Experiencia experienciaTopSeller(){

        Experiencia experienciaTopSeller = null;

        return experienciaTopSeller;

    }

    /**
     * Merodo que cria um objeto da classe rating com os parâmetros fornecidos e acrescenta-o ao array de Ratings do Repositorio de Ratings
     * @param nomeExperiencia Uma String que representa o nome da experiência a ser avaliada
     * @param ratingExperiencia Um inteiro que representa o rating da experiência
     * @param ratingGuia Um inteiro que representa o rating do guia
     * @return Retorna um booleano que indica se a avaliação foi realizada com sucesso ou não.
     */
    public boolean avaliarExperiencia(String nomeExperiencia, int ratingExperiencia, int ratingGuia) {
        return false;
    }

}
