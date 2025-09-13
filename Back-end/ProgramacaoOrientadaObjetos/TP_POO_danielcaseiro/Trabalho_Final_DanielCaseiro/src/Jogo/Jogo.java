package Jogo;

import Entidades.*;
import Itens.Arma;
import Itens.Consumivel;
import Itens.ItemHeroi;
import Itens.Pocao;
import Locais.Local;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static Funcoes.Funcoes.imprimirFile;


public class Jogo {

    // criar sala1 apenas para inicializar o objeto reerido nos metodos desta classe (local para onde o jogador vai quando morre)
    Local sala1 = new Local("Entrada de Eirenfall", "src/Assets/Descricoes/Sala1 _ Entrada_do_Castelo_de_Eirenfall.txt", "src/Assets/Imagens/PlaceHolderImageLocal.txt");



    // Metodo criar personagem/ Inicio do jogo

    /**
     * Metodo que inicia o jogo e cria a personagem do jogador com base em suas escolhas (define também a dificuldade)
     * @return O heroi criado pelo jogador.
     * @throws FileNotFoundException Caso a mensagem de inicio do jogo não seja encontrada
     */
    public Heroi inicioJogo() throws FileNotFoundException {

        System.out.println(" ");
        imprimirFile("src/Assets/Imagens/inicioJogoImagem.txt");

        System.out.println("============================== CRONICAS DE EIRENFALL ============================== ");
        System.out.println(" ");
        imprimirFile("src/Assets/MensagensChave/Mnsg_Comeco_Jogo.txt");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        String classeEscolhida = "";
        String nomeHeroi = "";
        int pontosCriacao = 0;
        int ouroInicial = 0;

        // Escolher Classe
        System.out.println(" ");
        System.out.println("--------------- Classes ---------------");
        System.out.println("1. Cavaleiro");
        System.out.println("2. Feiticeiro");
        System.out.println("3. Arqueiro");

        int opcaoClasse;
        do {
            System.out.print("Escolha a sua classe: ");
            opcaoClasse = sc.nextInt();
            sc.nextLine(); // Limpa o buffer pendente

            switch (opcaoClasse) {
                case 1:
                    classeEscolhida = "Cavaleiro";
                    break;
                case 2:
                    classeEscolhida = "Feiticeiro";
                    break;
                case 3:
                    classeEscolhida = "Arqueiro";
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcaoClasse < 1 || opcaoClasse > 3);

        // Escolher Nome
        System.out.println(" ");
        System.out.print("Digite o nome do seu herói: ");
        nomeHeroi = sc.nextLine();

        // Escolher Dificuldade
        System.out.println(" ");
        System.out.println("--------------- Dificuldade ---------------");
        System.out.println("1. Fácil (30 pontos de criação, 20 moedas de ouro)");
        System.out.println("2. Difícil (22 pontos de criação, 15 moedas de ouro)");
        System.out.println(" ");

        int opcaoDificuldade;
        do {
            System.out.print("Escolha a dificuldade: ");
            opcaoDificuldade = sc.nextInt();

            switch (opcaoDificuldade) {
                case 1:
                    pontosCriacao = 30;
                    ouroInicial = 20;
                    break;
                case 2:
                    pontosCriacao = 22;
                    ouroInicial = 15;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcaoDificuldade < 1 || opcaoDificuldade > 2);

        // Distribuir Pontos
        int vida = 0;
        int forca = 0;
        boolean distribuicaoValida = false;

        while (!distribuicaoValida) {
            System.out.println(" ");
            System.out.println("Você tem " + pontosCriacao + " pontos de criação.");
            System.out.println("Cada ponto de vida custa 1 ponto.");
            System.out.println("Cada ponto de força custa 5 pontos.");

            System.out.println(" ");
            System.out.print("Quantos pontos deseja colocar em vida? ");
            vida = sc.nextInt();

            System.out.println(" ");
            System.out.print("Quantos pontos deseja colocar em força? ");
            forca = sc.nextInt();

            int custoTotal = vida + (forca * 5);

            if (custoTotal == pontosCriacao) {
                distribuicaoValida = true;
            } else {
                System.out.println(" ");
                System.out.println("Distribuição inválida! Total utilizado: " + custoTotal + " pontos.");
                System.out.println("Você precisa usar exatamente " + pontosCriacao + " pontos.");
            }
        }

        // --- Criar Herói ---
        Heroi heroi;

        if (classeEscolhida.equals("Cavaleiro")) {
            heroi = new Cavaleiro(nomeHeroi, vida, forca, ouroInicial);
        } else if (classeEscolhida.equals("Feiticeiro")) {
            heroi = new Feiticeiro(nomeHeroi, vida, forca, ouroInicial);
        } else {
            heroi = new Arqueiro(nomeHeroi, vida, forca, ouroInicial);
        }

        Arma armaInicial = new Arma("adaga",1,1,2);
        heroi.setArmaPrincipal(armaInicial);

        System.out.println(" ");
        System.out.println("Personagem criado com sucesso!");
        System.out.println("Nome: " + heroi.getNome());
        System.out.println("Classe: " + classeEscolhida);
        System.out.println("Vida: " + heroi.getMaxHP());
        System.out.println("Força: " + heroi.getForca());
        System.out.println("Ouro: " + heroi.getOuro());

        return heroi;
    }




    // Metodo visitar local

    /**
     * Metodo que gerencia a "movimentação" pelas salas do jogo. Aqui estão todas as opções iniciais do jogador a cada momento do jogo.
     * @param localAtual O local onde o jogador está
     * @param heroi O heroi do jogador
     * @throws FileNotFoundException Caso alguns dos arquivos de imagem ou mensagem não seja encontrado
     */
    public void visitarLocal(Local localAtual, Heroi heroi) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        // Imprimir nome
        System.out.println(" ");
        System.out.println("*_*_*_*_*_*_*_*_*_* " + localAtual.getNome() + " *_*_*_*_*_*_*_*_*_*");

        // Imprimir imagem
        System.out.println(" ");
        imprimirFile(localAtual.getImagemFilePath());

        // Checar se o local precisa de uma chave para ser explorado
        if (localAtual.getChave() != null && !heroi.getEquipamentos().contains(localAtual.getChave())) {
            imprimirFile(localAtual.getMensagemChave());
            visitarLocal(localAtual.getSaidas().get(0), heroi); // volta para o local anterior
            return;
        }

        // Imprimir descrição
        System.out.println(" ");
        imprimirFile(localAtual.getDescricaoFilePath());

        // Verificar se há inimigos visiveis
        if (!localAtual.getInimigos().isEmpty()) {
            System.out.println(" ");
            System.out.println("Há inimigos no local!");
        }

        // caso haja, combate com inimigos visíveis

        int opcao;

        while (!localAtual.getInimigos().isEmpty()) {
            System.out.println(" ");
            System.out.println("--------------- Inimigos ---------------");
            int i = 1;
            for (NPC inimigo : localAtual.getInimigos()) {
                System.out.println(i + ". " + inimigo.getNome());
                i++;
            }
            System.out.println("0. FUGIR");
            System.out.println(" ");
            System.out.print("Escolha um inimigo para atacar ou 0 para fugir: ");
            opcao = sc.nextInt();

            if (opcao == 0) {
                visitarLocal(localAtual.getSaidas().get(0), heroi);
                return;
            }

            if (opcao < 0 || opcao > localAtual.getInimigos().size()) {
                System.out.println("Opção inválida.");
            }

            if (opcao > 0 && opcao <= localAtual.getInimigos().size()) {
                int indexInimigo = opcao - 1;
                NPC inimigo = localAtual.getInimigos().get(opcao - 1);
                boolean vitoria = heroi.atacar(inimigo);

                if (vitoria) {
                    localAtual.removerInimigo(inimigo);
                } else {
                    visitarLocal(sala1, heroi);
                    return;
                }

            }

        }


        // --- Menu de interação com o local ---
        int opcaoAcao;
        do {
            System.out.println("\n-------------- O que quer fazer agora? --------------");

            int numeroOpcao = 1;

            int inicioVendedores = numeroOpcao;
            if (!localAtual.getVendedores().isEmpty()) {
                for (Vendedor vendedor : localAtual.getVendedores()) {
                    System.out.println(numeroOpcao + ". Conversar com o vendedor " + vendedor.getNome());
                    numeroOpcao++;
                }
            }

            int inicioAmigos = numeroOpcao;
            if (!localAtual.getAmigos().isEmpty()) {
                for (NPC amigo : localAtual.getAmigos()) {
                    System.out.println(numeroOpcao + ". Conversar com " + amigo.getNome());
                    numeroOpcao++;
                }
            }

            int inicioTesouros = numeroOpcao;
            if (!localAtual.getTesouros().isEmpty()) {
                for (ItemHeroi tesouro : localAtual.getTesouros()) {
                    System.out.println(numeroOpcao + ". Pegar tesouro: " + tesouro.getNome());
                    numeroOpcao++;
                }
            }

            int inicioExplorar = numeroOpcao;
            for (String opcaoExplorar : localAtual.getOpcoesExplorar()) {
                System.out.println(numeroOpcao + ". " + opcaoExplorar);
                numeroOpcao++;
            }

            int inicioSaidas = numeroOpcao;
            for (Local saida : localAtual.getSaidas()) {
                System.out.println(numeroOpcao + ". Sair para: " + saida.getNome());
                numeroOpcao++;
            }

            int inicioTrocarArma = numeroOpcao;
            System.out.println(numeroOpcao + ". Trocar de arma.");
            numeroOpcao++;

            int inicioUsarPocao = numeroOpcao;
            System.out.println(numeroOpcao + ". Usar poção.");
            numeroOpcao++;

            int inicioExibirInventario = numeroOpcao;
            System.out.println(numeroOpcao + ". Exibir Inventário.");
            numeroOpcao++;

            int inicioExibirEquipamentos = numeroOpcao;
            System.out.println(numeroOpcao + ". Exibir equipamentos.");
            numeroOpcao++;

            System.out.println("0. Encerrar o jogo");

            System.out.print("Escolha uma opção: ");

            // Validação de input para o menu principal
            boolean inputValidoAcao = false;
            opcaoAcao = -1; // Inicializa para garantir que está fora do range
            while (!inputValidoAcao) {
                try {
                    opcaoAcao = sc.nextInt();
                    sc.nextLine(); // Consome a quebra de linha
                    if (opcaoAcao >= 0 && opcaoAcao < numeroOpcao) { // numeroOpcao é o limite superior exclusivo
                        inputValidoAcao = true;
                    } else {
                        System.out.println("Opção fora do intervalo. Digite um número entre 0 e " + (numeroOpcao - 1) + ".");
                        System.out.print("Escolha novamente: ");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número.");
                    sc.nextLine(); // Consome a entrada inválida
                    System.out.print("Escolha novamente: ");
                }
            }


            // --- Lógica de Decisão das Ações ---
            if (opcaoAcao == 0) {
                System.out.println("Encerrando o jogo...");
                inicioJogo(); // Ou System.exit(0); se quiser finalizar de vez
                return;
            }

            // Vendedores
            if (opcaoAcao >= inicioVendedores && opcaoAcao < inicioAmigos) {
                int index = opcaoAcao - inicioVendedores;
                if (index < localAtual.getVendedores().size()) {
                    localAtual.getVendedores().get(index).vender(heroi);
                } else {
                    System.out.println("Erro: Opção de vendedor inválida.");
                }
            }
            // Amigos
            else if (opcaoAcao >= inicioAmigos && opcaoAcao < inicioTesouros) {
                int index = opcaoAcao - inicioAmigos;
                if (index < localAtual.getAmigos().size()) {
                    localAtual.getAmigos().get(index).dialogar();
                } else {
                    System.out.println("Erro: Opção de amigo inválida.");
                }
            }
            // Tesouros
            else if (opcaoAcao >= inicioTesouros && opcaoAcao < inicioExplorar) {
                int index = opcaoAcao - inicioTesouros;
                if (index < localAtual.getTesouros().size()) {
                    ItemHeroi tesouro = localAtual.getTesouros().get(index);
                    if (tesouro instanceof Arma) {
                        heroi.inserirArma((Arma) tesouro);
                    } else if (tesouro instanceof Consumivel) {
                        heroi.inserirItemInventario((Consumivel) tesouro);
                    } else {
                        heroi.inserirItemEquipamentos(tesouro);
                    }
                    localAtual.removerTesouro(tesouro);
                    System.out.println("O " + tesouro.getNome() + " foi adicionado aos seus pertences.");
                } else {
                    System.out.println("Erro: Opção de tesouro inválida.");
                }
            }
            // Opções de Explorar
            else if (opcaoAcao >= inicioExplorar && opcaoAcao < inicioSaidas) {
                int index = opcaoAcao - inicioExplorar;
                if (index < localAtual.getOpcoesExplorar().size()) {
                    String exploracao = localAtual.getOpcoesExplorar().get(index);
                    realizarExploracao(localAtual, heroi, exploracao);
                } else {
                    System.out.println("Erro: Opção de explorar inválida.");
                }
            }
            // Saídas
            else if (opcaoAcao >= inicioSaidas && opcaoAcao < inicioTrocarArma) {
                int index = opcaoAcao - inicioSaidas;
                if (index < localAtual.getSaidas().size()) {
                    Local proximoLocal = localAtual.getSaidas().get(index);
                    System.out.println("Você está a ir para " + proximoLocal.getNome() + "...");
                    visitarLocal(proximoLocal, heroi);
                    return; // Retorna pois o local foi alterado
                } else {
                    System.out.println("Erro: Opção de saída inválida.");
                }
            }
            // Opções Fixas
            else if (opcaoAcao == inicioTrocarArma) {
                heroi.trocarArma();
            } else if (opcaoAcao == inicioUsarPocao) {
                heroi.usarPocao();
            } else if (opcaoAcao == inicioExibirInventario) {
                heroi.exibirInventario();
            } else if (opcaoAcao == inicioExibirEquipamentos) {
                heroi.exibirEquipamentos();
            }
            else {
                System.out.println("Opção inválida. Por favor, tente novamente.");
            }

        } while (true); // O loop continua até uma ação de "return" ser executada
    }



    // Metodo realizar exploracao

    /**
     * Metodo que representa a exploração dos locais pelo jogador. Gera um evento aleatorio quando o jogador explora, que pode ser encontrar um tesouro, um inimigo, uma passagem secreta etc.
     * @param localAtual O local onde o heroi está (e que será explorado)
     * @param heroi O heroi do jogador
     * @param opcaoExplorar String que rerpesenta uma chance explorar o local (é atributo do Local)
     * @throws FileNotFoundException Caso algum dos aruivos de texto não sejam encontrados
     */
    public void realizarExploracao(Local localAtual, Heroi heroi, String opcaoExplorar) throws FileNotFoundException {

        // Se há uma chave oculta necessária para progredir na história, é importante que o jogador a obtenha logo
        if(localAtual.getChaveOculta() != null) {
            System.out.println(" ");
            System.out.println("Encontrou um item!");
            System.out.println(localAtual.getChaveOculta().getNome() + " foi adicionado aos seus equipamentos.");
            heroi.inserirItemEquipamentos(localAtual.getChaveOculta());
            // remover a chave oculta do local
            localAtual.setChaveOculta(null);

            // remover a opcao já explotada do local
            localAtual.removerOpcoesExplorar(opcaoExplorar);
            return;
        }

        // se não há chave oculta, as outras possibilidades são geradas aleatoriamente
        Random r = new Random();

        // Criar array auxiliar
        ArrayList<String> eventosPossiveis = new ArrayList<>();

        if (localAtual.getInimigoOculto() != null){
            eventosPossiveis.add("inimigoOculto");
        }
        if (localAtual.getTesouroOculto() != null){
            eventosPossiveis.add("tesouroOculto");
        }
        if (localAtual.getPassagemSecreta() != null){
            eventosPossiveis.add("passagemSecreta");
        }

        eventosPossiveis.add("armadilha");
        eventosPossiveis.add("ouro");
        eventosPossiveis.add("pocao");

        // Escolher evento aleatório
        String evento = eventosPossiveis.get(r.nextInt(eventosPossiveis.size()));

        switch (evento) {
            case "inimigoOculto":
                boolean vitoria = heroi.atacar(localAtual.getInimigoOculto());

                if (vitoria) {
                    localAtual.setInimigoOculto(null); // só acontece uma vez
                } else {
                    visitarLocal(sala1, heroi);
                    return;
                }

                break;
            case "tesouroOculto":
                ItemHeroi tesouro = localAtual.getTesouroOculto();
                System.out.println("Você encontrou um tesouro oculto: " + tesouro.getNome());

                // Inserir o tesouro no siito certo
                if (tesouro instanceof Arma) {
                    Arma armaEncontrada = (Arma) tesouro;
                    heroi.inserirArma(armaEncontrada);
                } else if (tesouro instanceof Consumivel) {
                    Consumivel consumivelEncontrado = (Consumivel) tesouro;
                    heroi.inserirItemInventario(consumivelEncontrado);
                } else {
                    heroi.inserirItemEquipamentos(tesouro);
                }
                // retirar o tesouro oculto do local
                localAtual.setTesouroOculto(null);
                break;

            case "passagemSecreta":
                System.out.println("Você encontrou uma passagem secreta! Agora poderá sair por ela.");
                localAtual.inserirSaida(localAtual.getPassagemSecreta());

                break;
            case "armadilha":
                System.out.println("Você caiu em uma armadilha! Perdeu 10 pontos de vida.");
                heroi.setHp(heroi.getHp() - 10);
                break;
            case "ouro":
                int ouro = r.nextInt(10) + 5; // entre 5 e 15 moedas
                System.out.println("Você encontrou " + ouro + " moedas de ouro.");
                heroi.setOuro(heroi.getOuro() + ouro);
                break;
            case "pocao":
                System.out.println("Você encontrou uma poção de cura que foi adicionada ao seu inventário");
                Pocao pocaoCura = new Pocao("Poção de Cura simples", 1, 25, 0);
                pocaoCura.inserirHeroiPermitido("Cavaleiro");
                pocaoCura.inserirHeroiPermitido("Feiticeiro");
                pocaoCura.inserirHeroiPermitido("Arqueiro");
                heroi.inserirItemInventario(pocaoCura);
                break;
        }

        // Remover a opção do local
        localAtual.removerOpcoesExplorar(opcaoExplorar);
    }



    // Metodo fim de jogo

    /**
     * Metodo que exibe a mensagem de fim de jogo e efetivamente finaliza a execução do programa
     * @throws FileNotFoundException
     */
    public static void fimDeJogo() throws FileNotFoundException {

        imprimirFile("src/Assets/MensagensChave/Mnsg_Fim_de_Jogo.txt");
        System.exit(0); // encerrar o programa
    }






}
