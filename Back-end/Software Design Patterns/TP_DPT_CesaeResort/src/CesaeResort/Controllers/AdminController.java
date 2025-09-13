package CesaeResort.Controllers;

import CesaeResort.Models.*;
import CesaeResort.Repositories.*;

import java.io.File;
import java.io.FileNotFoundException;

public class AdminController {
    // Atributos
    private ReservasRepository reservasRepository;
    private ExperienciasRepository experienciasRepository;
    private QuartosRepository quartosRepository;
    private TipologiasRepository tipologiasRepository;
    private VendasRepository vendasRepository;

    // Construtor
    public AdminController() throws FileNotFoundException {
        this.reservasRepository = new ReservasRepository();
        this.experienciasRepository = new ExperienciasRepository();
        this.quartosRepository = new QuartosRepository();
        this.tipologiasRepository = new TipologiasRepository();
        this.vendasRepository = new VendasRepository();
    }


    // Metodos

    /**
     * Apanha o tamanho do array de reservas (no repositorio de reservas) que corresponde ao total de reservas.
     * @return retorna um inteiro que corresponde ao número total de reservas
     */
    public int totalReservas() {

        return this.reservasRepository.getReservasArray().size();
    }

    /**
     * Calcula o total de receitas (Soma de preço_por_semana das reservas dos quartos + preços de bilhetes das experiências).
     * @return Retorna um double que é o resultado do cálculo do total de receitas.
     */
    public double totalReceitas() {

        double totalReceitas = 0;

        return totalReceitas;
    }

    /**
     * Calcula a receita de um mês específico
     * (Soma de preço_por_semana das reservas dos quartos naquele mês + preços de bilhetes
     * das experiências vendidas naquele mês)
     * @param anoPesquisar Um inteiro que representa o ano em que se encontra o mês cuja receita será calculada.
     * @param mesPesquisar Um inteiro que representa o mês cuja receita será calculada.
     * @return Retorna um double que representa a receita total do mês especificado nos parâmetros.
     */
    public double receitaMensal(int anoPesquisar, int mesPesquisar){

        double receitaMensalTotal = 0.0;

        // Receita mensal da reserva/aluguel dos quartos

        // Iterar os arrays de reservas, quartos e tipologias para calcular a receita dos quartos reservados

        // para cada reserva (que sempre é de uma semana) no mês em questão, encontrar o número do quarto correspondente
        for (Reserva reserva : this.reservasRepository.getReservasArray()) {
            if (reserva.getAnoReserva() == anoPesquisar && reserva.getMesReserva() == mesPesquisar) {
                int numQuartoReservado = reserva.getNumQuarto();

                // A seguir, encontrar o quarto correspondente
                for (Quarto quarto : this.quartosRepository.getQuartosArray()) {
                    if (quarto.getNumQuarto() == numQuartoReservado) {
                        int idTipologiaReservada = quarto.getIdIipologia();

                        // Finalmente, encontrar a tipologia correspondente e somar o preço à receita
                        for (Tipologia tipologia : this.tipologiasRepository.getTipologiasArray()) {
                            if (tipologia.getIdTipologia() == idTipologiaReservada) {
                                receitaMensalTotal += tipologia.getPrecoPorSemana();
                            }
                        }
                    }
                }
            }
        }

        // Receita mensal da venda de bilhetes das experiências

        // Iterar os arrays de vendas e de experiências para calcular a receita dos bilhetes vendidos

        // Para cada venda do mes em questão, encontrar a experiencia vendida e o tipo de cliente/bilhete
        for (Venda venda : this.vendasRepository.getVendasArray()) {
            if (venda.getAnoVenda() == anoPesquisar && venda.getMesVenda() == mesPesquisar) {
                String idExperienciaVendida = venda.getIdExperiencia();
                String tipoClienteVenda = venda.getTipoCliente();

                // A seguir, encontrar a experiencia correspondente e somar o preço correspondente à receita
                for(Experiencia experiencia : this.experienciasRepository.getExperienciasArray()) {
                    if(experiencia.getIdExperiencia().equalsIgnoreCase(idExperienciaVendida)){

                        if(tipoClienteVenda.equalsIgnoreCase("adulto")){
                            receitaMensalTotal += experiencia.getPrecoAdulto();
                        } else {
                            receitaMensalTotal += experiencia.getPrecoCrianca();
                        }
                    }
                }

            }
        }


        return receitaMensalTotal;

    }

    /**
     * Itera os Arrays de reservas, quartos e tipologias para encontrar
     * a tipologia de quarto mais reservada.
     * @return Retorna um objeto da classe Tipologia que representa a tipologia de quarto mais reservada.
     * Em caso de empate ou se nenhuma reserva ou tipologia for encontrada, retorna null;
     */
    public Tipologia tipologiaMaisReservada() {

        Tipologia tipologiaMaisReservada = null;

        return tipologiaMaisReservada;

    }

    /**
     * Itera os Arrays de vendas e de experiências para calcular
     * a experiência com mais bilhetes vendidos para adultos.
     * @return Retorna um objeto da classe Experiência que representa a experiência mais procurada por adultos.
     */
    public Experiencia experienciaMaisProcuradaAdultos(){

        Experiencia experienciaMaisProcuradaAdultos = null;

        return experienciaMaisProcuradaAdultos;
    }

    /**
     * Itera os Arrays de vendas e de experiências para calcular
     * a experiência com mais bilhetes vendidos para crianças.
     * @return Retorna um objeto da classe Experiência que representa a experiência mais procurada por crianças.
     */
    public Experiencia experienciaMaisProcuradaCriancas() {

        Experiencia experienciaMaisProcuradaCriancas = null;

        return experienciaMaisProcuradaCriancas;

    }

    /**
     * Itera os Arrays de vendas e de experiências para calcular o valor arrecadado
     * com a venda de bilhetes (para adultos e crianças) por cada experiência e
     * encontrar assim qual foi a experiência mais lucrativa para o Resort.
     * @return Retorna um objeto da classe Experiência que representa a experiência mais lucrativa.
     */
    public Experiencia experienciaMaisLucrativa() {

        Experiencia experienciaMaisLucrativa = null;

        return experienciaMaisLucrativa;

    }

    /**
     * Itera os Arrays de vendas e de experiências para calcular o valor arrecadado
     * com a venda de bilhetes (para adultos e crianças) por cada experiência e
     * encontrar assim qual foi a experiência menos lucrativa para o Resort.
     * @return Retorna um objeto da classe Experiência que representa a experiência menos lucrativa.
     */
    public Experiencia experienciaMenosLucrativa(){

        Experiencia experienciaMenosLucrativa = null;

        return experienciaMenosLucrativa;

    }

    /**
     * Itera os Arrays de quartos e tipologias para encontrar o quarto com melhor preço/semana.
     * @return Retorna um objeto da classe Quarto que rerpesenta  o quarto com melhor preço/semana.
     */
    public Quarto quartoMelhorPrecoSemana(){
        Quarto quartoMelhorPrecoSemana = null;

        return quartoMelhorPrecoSemana;
    }

    /**
     * Metodo que recebe um username, password e tipo de acesso, confere se o username já existe e,
     * caso não exista, adiciona os novos dados ao ficheiro de logins.
     * @param username Uma String que representa o novo username a ser adicionado.
     * @param password Uma String que representa a nova password a ser adicionada.
     * @param tipo_acesso Uma String que representa o tipo de acesso do usuário que está a ser cadastrado.
     * @return Retorna um booleano que representa se o novo login foi adicionado ou não.
     * @throws FileNotFoundException Caso haja algum problema com o filepath e o ficheiro de logins não seja encontrado/não exista.
     */
    public boolean adicionarNovoLogin(String username, String password, String tipo_acesso) throws FileNotFoundException {

        File loginsFile = new File("Files/logins.csv");

        return false;
    }


}
