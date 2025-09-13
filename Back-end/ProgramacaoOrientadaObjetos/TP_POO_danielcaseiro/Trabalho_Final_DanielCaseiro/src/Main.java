import Entidades.Heroi;
import Entidades.NPC;
import Entidades.Vendedor;
import Itens.Arma;
import Itens.ConsumivelCombate;
import Itens.ItemHeroi;
import Itens.Pocao;
import Jogo.Jogo;
import Locais.Local;

import java.io.FileNotFoundException;

import static Funcoes.Funcoes.imprimirFile;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // Instanciando os 15 itens do vendedor
        Arma espadaLonga = new Arma("Espada Longa", 15, 6, 10);
        espadaLonga.inserirHeroiPermitido("Cavaleiro");

        Arma cajadoMistico = new Arma("Cajado Místico", 18, 5, 12);
        cajadoMistico.inserirHeroiPermitido("Feiticeiro");

        Arma arcoRunico = new Arma("Arco Rúnico", 20, 7, 9);
        arcoRunico.inserirHeroiPermitido("Arqueiro");

        Arma machadoGuerreiro = new Arma("Machado do Guerreiro", 22, 8, 11);
        machadoGuerreiro.inserirHeroiPermitido("Cavaleiro");

        Arma varaSombria = new Arma("Vara Sombria", 25, 6, 14);
        varaSombria.inserirHeroiPermitido("Feiticeiro");

        ConsumivelCombate bombaFumaca = new ConsumivelCombate("Bomba de Fumaça", 10, 5);
        bombaFumaca.inserirHeroiPermitido("Arqueiro");
        bombaFumaca.inserirHeroiPermitido("Cavaleiro");
        bombaFumaca.inserirHeroiPermitido("Feiticeiro");

        ConsumivelCombate facaArremesso = new ConsumivelCombate("Faca de Arremesso", 12, 6);
        facaArremesso.inserirHeroiPermitido("Arqueiro");
        facaArremesso.inserirHeroiPermitido("Cavaleiro");
        facaArremesso.inserirHeroiPermitido("Feiticeiro");

        ConsumivelCombate granadaMagica = new ConsumivelCombate("Granada Mágica", 15, 8);
        granadaMagica.inserirHeroiPermitido("Arqueiro");
        granadaMagica.inserirHeroiPermitido("Cavaleiro");
        granadaMagica.inserirHeroiPermitido("Feiticeiro");

        Pocao pocaoVida = new Pocao("Poção de Vida", 8, 25, 0);
        pocaoVida.inserirHeroiPermitido("Arqueiro");
        pocaoVida.inserirHeroiPermitido("Cavaleiro");
        pocaoVida.inserirHeroiPermitido("Feiticeiro");

        Pocao pocaoForca = new Pocao("Poção de Força", 10, 0, 5);
        pocaoForca.inserirHeroiPermitido("Arqueiro");
        pocaoForca.inserirHeroiPermitido("Cavaleiro");
        pocaoForca.inserirHeroiPermitido("Feiticeiro");

        Pocao pocaoMista = new Pocao("Poção Mista", 12, 15, 3);
        pocaoMista.inserirHeroiPermitido("Arqueiro");
        pocaoMista.inserirHeroiPermitido("Cavaleiro");
        pocaoMista.inserirHeroiPermitido("Feiticeiro");

        Pocao pocaoGrande = new Pocao("Poção Grande de Vida", 16, 50, 0);
        pocaoGrande.inserirHeroiPermitido("Arqueiro");
        pocaoGrande.inserirHeroiPermitido("Cavaleiro");
        pocaoGrande.inserirHeroiPermitido("Feiticeiro");

        Pocao pocaoForcaAvancada = new Pocao("Poção de Força Avançada", 20, 0, 10);
        pocaoForcaAvancada.inserirHeroiPermitido("Arqueiro");
        pocaoForcaAvancada.inserirHeroiPermitido("Cavaleiro");
        pocaoForcaAvancada.inserirHeroiPermitido("Feiticeiro");

        Pocao pocaoCompleta = new Pocao("Poção Completa", 25, 30, 10);
        pocaoCompleta.inserirHeroiPermitido("Arqueiro");
        pocaoCompleta.inserirHeroiPermitido("Cavaleiro");
        pocaoCompleta.inserirHeroiPermitido("Feiticeiro");

// Criar vendedor
        Vendedor vendedor1 = new Vendedor("Brom, o Mercador", 100, 5,
                "src/Assets/Imagens/PlaceholderImageNPC",
                "src/Assets/Dialogos/PlaceHolderDialogo");

// Adicionar os itens ao vendedor
        vendedor1.inserirItemLoja(espadaLonga);
        vendedor1.inserirItemLoja(cajadoMistico);
        vendedor1.inserirItemLoja(arcoRunico);
        vendedor1.inserirItemLoja(machadoGuerreiro);
        vendedor1.inserirItemLoja(varaSombria);
        vendedor1.inserirItemLoja(bombaFumaca);
        vendedor1.inserirItemLoja(facaArremesso);
        vendedor1.inserirItemLoja(granadaMagica);
        vendedor1.inserirItemLoja(pocaoVida);
        vendedor1.inserirItemLoja(pocaoForca);
        vendedor1.inserirItemLoja(pocaoMista);
        vendedor1.inserirItemLoja(pocaoGrande);
        vendedor1.inserirItemLoja(pocaoForcaAvancada);
        vendedor1.inserirItemLoja(pocaoCompleta);


        // Criar as salas do labirinto
        Local sala1 = new Local("Entrada de Eirenfall", "src/Assets/Descricoes/Sala1 _ Entrada_do_Castelo_de_Eirenfall.txt", "src/Assets/Imagens/PlaceHolderImageLocal.txt");
        Local sala2 = new Local("Corredor dos Estandartes", "src/Assets/Descricoes/Sala2_Corredor_dos_Estandartes.txt", "src/Assets/Imagens/PlaceHolderImageLocal.txt");
        Local sala4 = new Local("Capela em Ruínas", "src/Assets/Descricoes/Sala4_Capela _em_Ruinas.txt", "src/Assets/Imagens/PlaceHolderImageLocal.txt");
        Local sala5 = new Local("Biblioteca", "src/Assets/Descricoes/Sala5_Biblioteca.txt", "src/Assets/Imagens/PlaceHolderImageLocal.txt");
        Local sala6 = new Local("Jardins Sombrios", "src/Assets/Descricoes/Sala6 _Jardins_Sombrios.txt", "src/Assets/Imagens/PlaceHolderImageLocal.txt");
        Local sala7 = new Local("Quartos reais", "src/Assets/Descricoes/Sala7 _Quartos_Reais.txt", "src/Assets/Imagens/PlaceHolderImageLocal.txt");
        Local sala8 = new Local("Salão de Festas Fantasma", "src/Assets/Descricoes/Sala8_Salão_de_Festas_Fantasma.txt", "src/Assets/Imagens/PlaceHolderImageLocal.txt");
        Local sala11 = new Local("Adegas Sangrentas", "src/Assets/Descricoes/Sala11 _Adegas_Sangrentas.txt", "src/Assets/Imagens/PlaceHolderImageLocal.txt");
        Local sala12 = new Local("Cozinha Vazia", "src/Assets/Descricoes/Sala12_Cozinha_Vazia.txt", "src/Assets/Imagens/PlaceHolderImageLocal.txt");
        Local sala13 = new Local("Torre do Castelo", "src/Assets/Descricoes/Sala13_Torre_do_Castelo.txt", "src/Assets/Imagens/PlaceHolderImageLocal.txt");
        Local sala14 = new Local("Calabouço", "src/Assets/Descricoes/Sala14_Calabouço.txt", "src/Assets/Imagens/PlaceHolderImageLocal.txt");
        Local sala18 = new Local("Galerias Submersas", "src/Assets/Descricoes/Sala18 _Galerias_Submersas.txt", "src/Assets/Imagens/PlaceHolderImageLocal.txt");
        Local sala20 = new Local("Câmara do Coração", "src/Assets/Descricoes/Sala20 _Câmara_do_Coração.txt", "src/Assets/Imagens/PlaceHolderImageLocal.txt");
        Local sala21 = new Local("Sala Secreta", "src/Assets/Descricoes/sala21_Sala_Secreta.txt", "src/Assets/Imagens/PlaceHolderImageLocal.txt");


        // Conectar e preencher as salas

        // Entrada de Eirenfall
        sala1.inserirSaida(sala2); //Corredor dos Estandartes

        sala1.inserirVendedor(vendedor1); // Vendedor na entrada para suprimentos

        //Corredor dos Estandartes
        sala2.inserirSaida(sala1); // voltar para Entrada de Eirenfall
        sala2.inserirSaida(sala6); // Jardins Sombrios
        sala2.inserirSaida(sala7); // Quartos reais
        sala2.inserirSaida(sala8); // Salão de Festas Fantasma

        NPC esqueleto1 = new NPC("Esqueleto", 2, 1, 2, pocaoVida,"src/Assets/Imagens/PlaceHolderImageLocal.txt", "src/Assets/Dialogos/PlaceHolderDialogo");
        NPC esqueleto2 = new NPC("Esqueleto", 3, 2, 4, pocaoVida,"src/Assets/Imagens/PlaceHolderImageLocal.txt", "src/Assets/Dialogos/PlaceHolderDialogo");


        sala2.inserirInimigo(esqueleto1);
        sala2.inserirInimigo(esqueleto2);


        // Jardins Sombrios
        sala6.inserirSaida(sala2); // voltar para Corredor dos Estandartes
        sala6.inserirSaida(sala4); // Capela em Ruínas
        sala6.inserirSaida(sala13); // Torre do Castelo

        sala6.setPassagemSecreta(sala18); // passagem secreta Galerias Submersas (precisa de tocha para entrar)

        sala6.inserirOpcoesExplorar("Examinar os canteiros");
        sala6.inserirOpcoesExplorar("Investigar a fonte");
        sala6.inserirOpcoesExplorar("Procurar pistas no jardim");

        NPC plantaCarnivora = new NPC("Planta Carnivora", 10, 1, 1, pocaoVida,"src/Assets/Imagens/PlaceHolderImageLocal.txt", "src/Assets/Dialogos/PlaceHolderDialogo");


        sala6.inserirInimigo(plantaCarnivora);

        Pocao pocaoForcaMaior = new Pocao("Poção de Força Maior", 1, 0, 5);
        pocaoForcaMaior.inserirHeroiPermitido("Cavaleiro");
        pocaoForcaMaior.inserirHeroiPermitido("Feiticeiro");
        pocaoForcaMaior.inserirHeroiPermitido("Arqueiro");

        sala1.setTesouroOculto(pocaoForcaMaior); // Pequeno tesouro inicial

        // Torre do Castelo (encontra tocha)
        sala13.inserirSaida(sala6); // voltar para Jardins Sombrios

        ItemHeroi tocha = new ItemHeroi("Tocha Antiga", 1);
        tocha.inserirHeroiPermitido("Cavaleiro");
        tocha.inserirHeroiPermitido("Feiticeiro");
        tocha.inserirHeroiPermitido("Arqueiro");
        sala13.setChaveOculta(tocha);

        sala13.inserirOpcoesExplorar("Subir até o topo da torre");


        NPC harpia = new NPC("Harpia", 8, 2, 10, pocaoVida,"src/Assets/Imagens/PlaceHolderImageLocal.txt", "src/Assets/Dialogos/PlaceHolderDialogo");

        sala13.inserirInimigo(harpia);

        // Capela em Ruínas
        sala4.inserirSaida(sala6); // voltar para Jardins Sombrios
        sala4.inserirSaida(sala20); // Câmara do Coração (precisa de chave)

        sala4.inserirOpcoesExplorar("Investigar o altar");

        NPC espectroSombrio = new NPC("EspectroSombrio", 15, 5, 20, pocaoVida,"src/Assets/Imagens/PlaceHolderImageLocal.txt", "src/Assets/Dialogos/PlaceHolderDialogo");

        sala4.setInimigoOculto(espectroSombrio);


        // Câmara do Coração (Final Boss. precisa de chave)
        sala20.inserirSaida(sala4); // voltar para Capela em Ruínas

        ItemHeroi chaveCamara = new ItemHeroi("Chave de Ferro",0);

        sala20.setChave(chaveCamara);
        sala20.setMensagemChave("src/Assets/MensagensChave/Mnsg_Chave_Camara.txt");


        NPC reiLouco = new NPC("Thaelric, o Rei Louco", 150, 30, 200, pocaoCompleta,"src/Assets/Imagens/PlaceholderImageNPC","src/Assets/Dialogos/PlaceHolderDialogo"); // Final Boss
        sala20.inserirInimigo(reiLouco);

        // Quartos reais (encontra chave)
        sala7.inserirSaida(sala2); // voltar para Corredor dos Estandartes
        sala7.inserirSaida(sala12); // ir para a Cozinha

        sala7.setChaveOculta(chaveCamara);
        sala7.inserirOpcoesExplorar("Remexer gavetas antigas");
        sala7.inserirOpcoesExplorar("Arrastar cama");
        sala7.inserirOpcoesExplorar("Abrir baú");
        sala7.inserirInimigo(espectroSombrio);

        // Salão de Festas Fantasma
        sala8.inserirSaida(sala2); // voltar para Corredor dos Estandartes
        sala8.inserirSaida(sala5); // ir para Biblioteca
        sala8.inserirSaida(sala12); // ir para a Cozinha

        NPC fantasma1 = new NPC("Fantasma Dançarino", 3, 3, 0, pocaoVida,"src/Assets/Imagens/PlaceHolderImageLocal.txt", "src/Assets/Dialogos/PlaceHolderDialogo");
        NPC fantasma2 = new NPC("Fantasma Violinista", 3, 3, 5, pocaoVida,"src/Assets/Imagens/PlaceHolderImageLocal.txt", "src/Assets/Dialogos/PlaceHolderDialogo");
        NPC fantasma3 = new NPC("Fantasma Comilão", 6, 4, 10, pocaoVida,"src/Assets/Imagens/PlaceHolderImageLocal.txt", "src/Assets/Dialogos/PlaceHolderDialogo");


        sala8.inserirInimigo(fantasma1);
        sala8.inserirInimigo(fantasma2);
        sala8.inserirInimigo(fantasma3);



        // Biblioteca
        sala5.inserirSaida(sala8); // voltar para Salão de Festas Fantasma
        sala5.setPassagemSecreta(sala21);// passagem secreta para Sala Secreta

        sala5.inserirOpcoesExplorar("Examinar estantes");
        sala5.inserirOpcoesExplorar("Folhear livros");
        sala5.inserirOpcoesExplorar("Investigar mesa de leitura");

        NPC tracaGrimorio = new NPC("Traça de Grimório", 2, 2, 10, pocaoVida,"src/Assets/Imagens/PlaceHolderImageLocal.txt", "src/Assets/Dialogos/PlaceHolderDialogo");


        sala5.setInimigoOculto(tracaGrimorio);

        // Sala Secreta (encontra chave)
        sala21.inserirSaida(sala5); // voltar para a Biblioteca
        sala21.setChaveOculta(chaveCamara);

        sala5.inserirOpcoesExplorar("Abrir o baú");


        // Cozinha
        sala12.inserirSaida(sala8); // voltar para Salão de Festas Fantasma
        sala12.inserirSaida(sala11); // ir para Adegas
        sala12.inserirSaida(sala14); // ir para Calabouço

        sala12.inserirOpcoesExplorar("Abrir o forno");
        sala12.inserirOpcoesExplorar("Mexer nas panelas");
        sala12.inserirOpcoesExplorar("Investigar a despensa");

        sala12.setChaveOculta(tocha);

        NPC carniçal = new NPC("Carniçal", 9, 5, 7, pocaoVida,"src/Assets/Imagens/PlaceHolderImageLocal.txt", "src/Assets/Dialogos/PlaceHolderDialogo");


        sala12.inserirInimigo(carniçal);


        // Adegas
        sala11.inserirSaida(sala12); // voltar para a Cozinha

        Pocao pocaoSinistra = new Pocao("Poção Sinistra", 100, -5, 7);
        pocaoSinistra.inserirHeroiPermitido("Cavaleiro");
        pocaoSinistra.inserirHeroiPermitido("Feiticeiro");
        pocaoSinistra.inserirHeroiPermitido("Arqueiro");

        sala11.inserirTesouro(pocaoSinistra);

        // Calabouço (Mini Boss. Encontra chave. Encontra o seu irmão)
        sala14.inserirSaida(sala12); // voltar para a Cozinha
        sala14.inserirSaida(sala18); // Galerias Submersas

        NPC irmaoPerdido = new NPC("Laziel", 10, 10, 10, pocaoVida,"src/Assets/Imagens/lazielImage.txt","src/Assets/Dialogos/lazielDialogo.txt");

        sala14.inserirAmigo(irmaoPerdido); // irmão
        sala14.inserirTesouro(chaveCamara);

        NPC armaduraFantasma = new NPC("Armadura Fantasma", 15, 10, 0, pocaoVida,"src/Assets/Imagens/PlaceHolderImageLocal.txt", "src/Assets/Dialogos/PlaceHolderDialogo");
        NPC golemDePedra = new NPC("Golem de Pedra", 30, 15, 0, pocaoVida,"src/Assets/Imagens/PlaceHolderImageLocal.txt", "src/Assets/Dialogos/PlaceHolderDialogo");
        NPC vampiroCultista = new NPC("Vampiro Cultista", 10, 5, 50, pocaoVida,"src/Assets/Imagens/PlaceHolderImageLocal.txt", "src/Assets/Dialogos/PlaceHolderDialogo");


        sala14.inserirInimigo(armaduraFantasma);
        sala14.inserirInimigo(golemDePedra);
        sala14.inserirInimigo(vampiroCultista); // mini boss

        // Galerias Submersas (precisa de tocha para entrar)
        sala18.inserirSaida(sala14); // voltar para Calabouço
        sala18.inserirSaida(sala6); // ir para os Jardins Sombrios

        sala18.inserirVendedor(vendedor1);

        NPC ratoGigante = new NPC("Rato Gigante", 10, 2, 5, pocaoVida,"src/Assets/Imagens/PlaceHolderImageLocal.txt", "src/Assets/Dialogos/PlaceHolderDialogo");

        NPC monstroEsgoto = new NPC("Monstro do Esgoto", 20, 5, 5, pocaoVida,"src/Assets/Imagens/PlaceHolderImageLocal.txt", "src/Assets/Dialogos/PlaceHolderDialogo");


        sala18.inserirInimigo(ratoGigante);
        sala18.inserirInimigo(monstroEsgoto);

        sala18.setChave(tocha);
        sala18.setMensagemChave("src/Assets/MensagensChave/Msg_Chave_Galerias_Submersas.txt");





        // Jogo


        Jogo j = new Jogo();

        Heroi heroi = j.inicioJogo();

        j.visitarLocal(sala1, heroi);



    }

}



