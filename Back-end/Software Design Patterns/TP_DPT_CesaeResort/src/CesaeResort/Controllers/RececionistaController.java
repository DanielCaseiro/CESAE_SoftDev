package CesaeResort.Controllers;

import CesaeResort.Models.Cliente;
import CesaeResort.Models.Quarto;
import CesaeResort.Models.Reserva;
import CesaeResort.Models.Tipologia;
import CesaeResort.Repositories.*;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class RececionistaController {
    // Atributos
    private ReservasRepository reservasRepository;
    private ExperienciasRepository experienciasRepository;
    private QuartosRepository quartosRepository;
    private TipologiasRepository tipologiasRepository;
    private ClientesRepository clientesRepository;

    // Construtor
    public RececionistaController() throws FileNotFoundException {
        this.reservasRepository = new ReservasRepository();
        this.experienciasRepository = new ExperienciasRepository();
        this.quartosRepository = new QuartosRepository();
        this.tipologiasRepository = new TipologiasRepository();
        this.clientesRepository = new ClientesRepository();
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
     * Metodo que itera os arrays de reservas, quartos, tipologias e clientes para obter as informações
     * dos quartos reservados
     * @return Retorna um ArrayList de Strings com as informações dos quartos reservados
     */
    public ArrayList<String> consultarQuartosReservados(){

        ArrayList<String> quartosReservados = null;

        return quartosReservados;

    }

    /**
     * Metodo que itera os arrays de reservas, quartos, tipologias e clientes para obter as informações
     * das reservas da semana atual
     * @return Retorna um ArrayList de Strings com as informações das reservas da semana atual
     */
    public ArrayList<String> consultarReservasAtuais(){
        // criar um ArrayList de Strings para guardar as informações das reservsa atuais
        ArrayList<String> reservasAtuais = new ArrayList<>();

        // Dados da semana atual
        int anoAtual = 2025;
        int mesAtual = 7;
        int semanaAtual = 2;

        // Iterar o array das reservas para encontrar as reservas desta semana
        for (Reserva reserva : this.reservasRepository.getReservasArray()) {
            if (reserva.getAnoReserva() == anoAtual && reserva.getMesReserva() == mesAtual && reserva.getSemanaReserva() == semanaAtual) {

                // Apanhar as informações do numQuarto e idCliente
                int numQuartoReserva = reserva.getNumQuarto();
                String idClienteReserva = reserva.getIdCliente();

                // Pelo numQuarto, buscar o objeto Quarto correspondente
                Quarto quartoReserva = null;

                for (Quarto quarto : this.quartosRepository.getQuartosArray()) {
                    if (quarto.getNumQuarto() == numQuartoReserva) {
                        quartoReserva = quarto;
                        break;
                    }
                }

                // Buscar a tipologia do quarto reservado
                Tipologia tipologiaReserva = null;

                for (Tipologia tipologia : this.tipologiasRepository.getTipologiasArray()) {
                    if (tipologia.getIdTipologia() == quartoReserva.getIdIipologia()) {
                        tipologiaReserva = tipologia;
                        break;
                    }
                }

                // Buscar o cliente da reserva
                Cliente clienteReserva = null;

                for (Cliente cliente : this.clientesRepository.getClientesArray()) {
                    if (cliente.getId().equalsIgnoreCase(idClienteReserva)) {
                        clienteReserva = cliente;
                        break;
                    }
                }

                // Construir a string que será impressa e adicioná-la no ArrayList

                String infoReserva = quartoReserva.getNumQuarto() +
                        " | " + tipologiaReserva.getDescricaoTipologia() +
                        " | " + clienteReserva.getId() +
                        " | " + clienteReserva.getNome() +
                        " | " + clienteReserva.getEmail() +
                        " | " + clienteReserva.getNacionalidade();


                reservasAtuais.add(infoReserva);


            }
        }

        return reservasAtuais;

    }

    /**
     * Metodo que reserva um quarto para um cliente
     * @param idClienteReservaQuarto String que representa o Id do cliente
     * @param numQuarto Inteiro que representa o número do quarto
     * @param ano Inteiro que representa o ano da reserva
     * @param mes Inteiro que representa o mes da reserva
     * @param semana Inteiro que representa a semana da reserva
     * @return Retorna um booleano que indica se a reserva foi realizada ou não
     */
    public boolean reservarQuarto(String idClienteReservaQuarto, int numQuarto, int ano, int mes, int semana){
        return false;
    }

    /**
     * Metodo que reserva uma experiência para um cliente
     * @param idClienteReservaExperiencia String que representa o Id do cliente
     * @param idExperienciaReserva String que representa o Id da experiencia a ser reservada
     * @param numAdultos Inteiro que representa o número de adultos que participarão da experiência
     * @param numCriancas Inteiro que representa o número de crianças que participarão da experiência
     * @return Retorna um booleano que indica se a reserva foi realizada ou não
     */
    public boolean reservarExperiencia(String idClienteReservaExperiencia, String idExperienciaReserva, int numAdultos, int numCriancas){
        return false;
    }


}
