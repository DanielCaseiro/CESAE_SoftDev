package Classes;

import Classes.SeresVivos.Animal;
import Classes.SeresVivos.Inseto;
import Classes.SeresVivos.Planta;
import Classes.SeresVivos.SerVivo;
import Enumeracoes.Familia;

import java.util.ArrayList;
import java.util.Random;

public class MeioAmbiente {
    private String nome;
    private double agua;
    private ArrayList<SerVivo> seres;

    // Construtor

    public MeioAmbiente(String nome, double agua) {
        this.nome = nome;
        this.agua = agua;
        this.seres = new ArrayList<SerVivo>();
    }

    // Inserir SerVivo
    public void inserirSerVivo(SerVivo novoSerVivo){
        this.seres.add(novoSerVivo);
    }


    // Remover SerVivo
    public void removerSerVivo(SerVivo serVivoRemover){
        this.seres.remove(serVivoRemover);
    }

    // Exibir Detalhes
    public void exibirDetalhes(){
        System.out.println("--------------- Detalhes do Meio Ambiente " + this.nome + " ---------------");
        System.out.println(" ");
        System.out.print("nome: " + this.nome +
                " | água: " + this.agua + " litros"
        );

        System.out.println(" ");
        System.out.println("--------------- Seres Vivos neste ambiente ---------------");

        int i = 0;
        for (SerVivo serAtual : this.seres){
            System.out.print("| index: " + i);
            System.out.println(" | " + serAtual.getNome() + " " + serAtual.getEspecie());
            i++;
        }
    }


    // Metodo Boolean plantaBebeAgua
    public boolean plantaBebeAgua(SerVivo agente) {
        System.out.println(" ");
        System.out.println("--------------- Planta Tenta Beber Água ---------------");
        System.out.println(" ");


        Planta plantaAgente = (Planta) agente;

        double aguaNecessaria = 0.0;

        // Determinando a quantidade de água necessária
        switch (plantaAgente.getFamilia()) {
            case ARVORE:
                aguaNecessaria = 1.0;
                break;

            case FLORES:
                aguaNecessaria = 0.1;
                break;

            case ERVAS:
                aguaNecessaria = 0.25;
                break;

            case COME_INSETOS:
                System.out.println("Plantas da família Come Insetos não bebem água.");
                System.out.println(" ");
                return false;

            default:
                System.out.println("Família da planta desconhecida.");
                System.out.println(" ");
                return false;
        }

        // Verifica se há água suficiente
        if (this.agua < aguaNecessaria) {
            System.out.println("Não há água suficiente! A planta " + plantaAgente.getNome() + " não bebeu água e morreu de sede.");
            System.out.println(" ");
            seres.remove(plantaAgente);
            return false;
        }

        // Planta bebe água
        this.agua -= aguaNecessaria;
        System.out.println("A planta " + plantaAgente.getNome() + " bebeu " + aguaNecessaria + "l de água!");
        System.out.println("A quantidade de água no Meio Ambiente agora é de " + this.agua + " litros.");
        System.out.println(" ");

        return true;
    }

   // Metodo Boolean plantaComeInsetos
    public boolean plantaComeInsetos (SerVivo agente) {
        System.out.println(" ");
        System.out.println("--------------- Planta Tenta Comer Insetos ---------------");
        System.out.println(" ");

        Planta plantaAgente = (Planta) agente;

        // Verifica se é uma planta e da família Come Insetos
        if (plantaAgente.getFamilia() != Familia.COME_INSETOS) {
            System.out.println("Esta planta não pertence à família Come Insetos.");
            System.out.println(" ");
            return false;
        }

        // gerar um array auxiliar de insetos
        ArrayList<SerVivo> arrayInsetos = arrayAuxiliar(3);

        // Caso não haja mais insetos no ambiente:
        if(arrayInsetos.isEmpty()) {
            System.out.println("Não há insetos! A planta " + plantaAgente.getNome() + " não comeu nada e morreu de fome.");
            System.out.println(" ");
            this.seres.remove(plantaAgente);
            return false;
        }

        // Encontrar um inseto
        Random r = new Random();
        int indexInseto = r.nextInt(arrayInsetos.size());

        Inseto insetoComida = (Inseto) arrayInsetos.get(indexInseto);

        System.out.println("A planta " + plantaAgente.getNome() + " comeu o inseto "  + insetoComida.getNome() + ".");
        System.out.println(" ");
        this.seres.remove(insetoComida);
        return true;

    }

    // Metodo Void plantaAbanaComVento
    public void plantaAbanaComVento(SerVivo agente) {

        System.out.println("--------------- Planta Abana com o Vento ---------------");
        System.out.println(" ");

        System.out.println("A planta "  + agente.getNome() + " diz:");
        System.out.println("Está muito vento!");
        System.out.println(" ");




    }

    // Metodo Void animalFazBarulho
    public void animalFazBarulho(SerVivo agente) {

        System.out.println("--------------- Animal Faz Barulho ---------------");
        System.out.println(" ");

        Animal agenteAnimal = (Animal) agente;

        System.out.println("O animal " + agenteAnimal.getNome() + " fez:");
        System.out.println(agenteAnimal.getBarulho());
        System.out.println(" ");

    }

    // Metodo Void animalMovimenta
    public void animalMovimenta(SerVivo agente) {
        System.out.println("--------------- Animal se Movimenta ---------------");
        System.out.println(" ");

        Animal agenteAnimal = (Animal) agente;

        System.out.println("O animal " + agenteAnimal.getNome() + " movimentou-se");
        System.out.println(" ");

    }

    // Metodo Boolean animalBebeAgua
    public boolean animalBebeAgua (SerVivo agente) {
        System.out.println(" ");
        System.out.println("--------------- Animal Tenta Beber Água ---------------");
        System.out.println(" ");


        Animal animalAgente = (Animal) agente;

        double aguaNecessaria = 0.0;

        // Determinando a quantidade de água necessária
        aguaNecessaria = animalAgente.getPesoKg() * 0.025;

        // Verifica se há água suficiente
        if (this.agua < aguaNecessaria) {
            System.out.println("Não há água suficiente! O animal " + animalAgente.getNome() + " não bebeu água e morreu de sede.");
            System.out.println(" ");
            seres.remove(animalAgente);
            return false;
        }

        // Animal bebe água
        this.agua -= aguaNecessaria;
        System.out.println("O animal " + animalAgente.getNome() + " bebeu " + aguaNecessaria + "l de água!");
        System.out.println("A quantidade de água no Meio Ambiente agora é de " + this.agua + " litros.");
        System.out.println(" ");

        return true;

    }


    // TERMINAR!!! <--------------------------------------------------------------------------
    // Metodo Boolean animalCome
    public boolean animalCome(SerVivo agente) {
        System.out.println(" ");
        System.out.println("--------------- Animal Tenta Comer ---------------");
        System.out.println(" ");

        System.out.println("Método ainda em implementação...");
        System.out.println(" ");

//        System.out.println("Não há água suficiente! O animal " + animalAgente.getEspecie() + " " + animalAgente.getNome() + " não bebeu água e morreu de sede.");
//        System.out.println(" ");

        return true;
    }

    // Metodo Void insetoChateia
    public void insetoChateia(SerVivo agente){

        System.out.println("--------------- Inseto Chateia ---------------");
        System.out.println(" ");

        Random r = new Random();
        int tipoBarulho = r.nextInt(3) + 1;

        switch (tipoBarulho) {

            case 1:
                // Bzzzz bzzzz
                System.out.println("O inseto " + agente.getNome()  + " fez: ");
                System.out.println("Bzzzz bzzzz");
                System.out.println(" ");

                break;

            case 2:
                // Tic tic tic tic
                System.out.println("O inseto " + agente.getNome()  + " fez: ");
                System.out.println("Tic tic tic tic");
                System.out.println(" ");

                break;

            case 3:
                // Pssssssss
                System.out.println("O inseto " + agente.getNome()  + " fez: ");
                System.out.println("Pssssssss");
                System.out.println(" ");

                break;

            default:
                System.out.println("O inseto não fez nenhum barulho.");
                System.out.println(" ");
        }

    }


    // Metodo criar Array list auxiliar
    public ArrayList<SerVivo> arrayAuxiliar(int classeSerVivo) {

        // criar o Array List auxiliar vazio
        ArrayList<SerVivo> arrayAuxiliar = new ArrayList<>();

        // classes de seres vivos: 1.Planta, 2. Animal, 3. Inseto

        switch (classeSerVivo) {

            case 1:
                // adicionar todas as plantas no Array List auxiliar
                for (SerVivo serVivoAtual : this.seres) {
                    if (serVivoAtual instanceof Planta) {
                        arrayAuxiliar.add(serVivoAtual);
                    }
                }

                break;

            case 2:
                // criar um Array List só de animais
                for (SerVivo serVivoAtual : this.seres) {
                    if (serVivoAtual instanceof Animal) {
                        arrayAuxiliar.add(serVivoAtual);
                    }
                }

                break;

            case 3:
                // criar um Array List só de insetos
                for (SerVivo serVivoAtual : this.seres) {
                    if (serVivoAtual instanceof Inseto) {
                        arrayAuxiliar.add(serVivoAtual);
                    }
                }

                break;

            default:
                System.out.println("Nenhum acontecimento foi gerado.");
                System.out.println(" ");
        }


        return arrayAuxiliar;

    }


    // Metodo catastrofe natural
    public void gerarCatastrofeNatural(){

        System.out.println("--------------- Uma Catástrofe Natural Aconteceu! ---------------");
        System.out.println(" ");

        Random r = new Random();
        int catastrofe = r.nextInt(3) + 1;


        switch (catastrofe) {

            case 1:
                // Seca: Diminui a água para metade.
                this.agua /= 2;

                System.out.println("Ocorreu uma seca: a água do ambiente diminuiu pela metade.");
                System.out.println(" ");

                break;

            case 2:
                // Chuvas: Aumenta a água para o dobro.
                this.agua *= 2;

                System.out.println("Choveu! A quantidade de água no ambiente dobrou.");
                System.out.println(" ");

                break;

            case 3:
                // Erupção Vulcânica: Morrem metade das plantas e metade dos animais.

                System.out.println("Ocorreu uma Erupção VulcÂnica! Metade dos seres vivos no ambiente morreram.");
                System.out.println(" ");

                // classes de seres vivos: 1.Planta, 2. Animal, 3. Inseto

                // Matar plantas
                ArrayList<SerVivo> arrayPlantas =  arrayAuxiliar(1);
                for (int contadorDeMortes = 0; contadorDeMortes < (arrayPlantas.size()/2); contadorDeMortes++){

                    int indexVitima = r.nextInt(arrayPlantas.size());

                    SerVivo plantaVitima = arrayPlantas.get(indexVitima);

                    this.seres.remove(plantaVitima);

                    arrayPlantas.remove(indexVitima);

                }

                // Matar animais
                ArrayList<SerVivo> arrayAnimais =  arrayAuxiliar(2);
                for (int contadorDeMortes = 0; contadorDeMortes < (arrayAnimais.size()/2); contadorDeMortes++){

                    int indexVitima = r.nextInt(arrayAnimais.size());

                    SerVivo animalVitima = arrayAnimais.get(indexVitima);

                    this.seres.remove(animalVitima);

                    arrayAnimais.remove(indexVitima);
                }

                // Matar insetos
                ArrayList<SerVivo> arrayInsetos =  arrayAuxiliar(3);
                for (int contadorDeMortes = 0; contadorDeMortes < (arrayInsetos.size()/2); contadorDeMortes++){

                    int indexVitima = r.nextInt(arrayInsetos.size());

                    SerVivo insetoVitima = arrayInsetos.get(indexVitima);

                    this.seres.remove(insetoVitima);

                    arrayInsetos.remove(indexVitima);
                }


                break;

            default:
                System.out.println("Não aconteceu nenhuma catástrofe natural.");
                System.out.println(" ");
        }


    }


    // Metodo gerar ser vivo agente
    public SerVivo gerarSerVivoAgente(ArrayList<SerVivo> arrayAuxiliar){
        Random r = new Random();
        int serVivoAgente = r.nextInt(arrayAuxiliar.size());

        return arrayAuxiliar.get(serVivoAgente);

    }



    // Metodo gerar ação do SerVivo
    public void gerarAcao(SerVivo agente) {

        Random r = new Random();

        if(agente instanceof Planta) {

            if(((Planta) agente).getFamilia() == Familia.COME_INSETOS) {

                int acaoPlantaComeInsetos = r.nextInt(2) + 1;

                switch (acaoPlantaComeInsetos) {

                    case 1:
                        plantaAbanaComVento(agente);

                        break;

                    case 2:
                        plantaComeInsetos(agente);

                        break;

                    default:
                        System.out.println("Não aconteceu nenhuma ação.");
                        System.out.println(" ");
                }


            } else {

                int acaoPlanta = r.nextInt(2) + 1;

                switch (acaoPlanta) {

                    case 1:
                        plantaAbanaComVento(agente);

                        break;

                    case 2:
                        plantaBebeAgua(agente);

                        break;

                    default:
                        System.out.println("Não aconteceu nenhuma ação.");
                        System.out.println(" ");
                }

            }


        } else if (agente instanceof Animal) {
            int acaoAnimal = r.nextInt(4) + 1;

            switch (acaoAnimal) {

                case 1:
                    animalBebeAgua(agente);

                    break;

                case 2:
                    animalCome(agente);

                    break;

                case 3:
                    animalFazBarulho(agente);

                    break;

                case 4:
                    animalMovimenta(agente);

                    break;


                default:
                    System.out.println("Não aconteceu nenhuma ação.");
                    System.out.println(" ");

            }


        } else if (agente instanceof Inseto) {
            insetoChateia(agente);
        }


    }



    // TERMINAR!!! <--------------------------------------------------------------------------
    // Metodo Crie o metodo para MeioAmbiente chamado simulador:
    public void simulador(int numDias) {

        int dia = 1;

        do {

            // Começo do dia
            System.out.println(" ");
            System.out.println("_*_*_*_*_*_*_*_*_*_*_ Um novo dia começa _*_*_*_*_*_*_*_*_*_*_");
            System.out.println("                            Dia " + dia + "                            ");
            System.out.println(" ");

            // Criar ciclo Manhã, Tarde e Noite
            int periodo = 0;

            do {

                switch (periodo) {

                    case 0:
                        System.out.println("_*_*_*_*_*_ Manhã _*_*_*_*_*_");
                        System.out.println(" ");
                        break;

                    case 1:
                        System.out.println("_*_*_*_*_*_ Tarde _*_*_*_*_*_");
                        System.out.println(" ");
                        break;

                    case 2:
                        System.out.println("_*_*_*_*_*_ Noite _*_*_*_*_*_");
                        System.out.println(" ");
                        break;

                    default:
                        System.out.println("Nada aconteceu.");
                        System.out.println(" ");
                }

                // gerar acontecimento

                SerVivo agente = null;

                Random r = new Random();
                int tipoAcontecimento = r.nextInt(4) + 1;

                // tipo de acontecimento == classes de seres vivos: 1.Planta, 2. Animal, 3. Inseto

                if(tipoAcontecimento <=3) {

                    agente = gerarSerVivoAgente(arrayAuxiliar(tipoAcontecimento));

                } else {
                    gerarCatastrofeNatural();
                }

                // gerar ação
                gerarAcao(agente);


                periodo++;
            } while (periodo < 3);


            // Fim do dia
            System.out.println("_*_*_*_*_*_ fim do " + dia + "º dia _*_*_*_*_*_");
            System.out.println(" ");

            dia++;
        } while (dia <= numDias);

        this.exibirDetalhes();
        System.out.println(" ");

    }


}
