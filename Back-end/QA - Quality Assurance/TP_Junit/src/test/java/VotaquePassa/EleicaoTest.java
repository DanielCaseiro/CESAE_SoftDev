package VotaquePassa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EleicaoTest {

    // Eleições
    Eleicao eleicaoAutarquica;
    Eleicao eleicaoAssociacaoEstudantes;

    // Candidatos autarquicas
    Candidato aut1;
    Candidato aut2;
    Candidato aut3;
    Candidato aut4;

    // Candidatos ass. estudantes
    Candidato ass1;
    Candidato ass2;
    Candidato ass3;
    Candidato ass4;

    // Eleitores autárquica
    Eleitor eleitor1;
    Eleitor eleitor2;
    Eleitor eleitor3;
    Eleitor eleitor4;

    // Eleitores ass. estudantes
    Eleitor eleitor5;
    Eleitor eleitor6;
    Eleitor eleitor7;
    Eleitor eleitor8;

    @BeforeEach
    void setUp() {

        // Criar eleições
        eleicaoAutarquica = new Eleicao("Eleicoes Autarquicas 2025", 18);
        eleicaoAssociacaoEstudantes = new Eleicao("Associacao de Estudantes - Secundaria Freixo de Espada a Cinta", 14);

        // Candidatos para a eleição autárquica
        aut1 = new Candidato("Joana Almeida", 17, "Trofa");
        aut2 = new Candidato("Ricardo Meireles", 18, "Maia");
        aut3 = new Candidato("Cristiano Ronaldo", 19, "Porto");
        aut4 = new Candidato("Joaquim Alberto", 45, "Gaia");

        // Candidatos para a associação de estudantes
        ass1 = new Candidato("Mariana Costa", 13, "Trofa");
        ass2 = new Candidato("Luis Pereira", 14, "Trofa");
        ass3 = new Candidato("Sofia Matos", 15, "Santo Tirso");
        ass4 = new Candidato("Bruno Gomes", 18, "Maia");

        // Eleitores para a eleição autárquica

        eleitor1 = new Eleitor("Ana Rocha", "E001", 17, "ana@mail.com", "911000001");
        eleitor2 = new Eleitor("João Santos", "E002", 18, "joao@mail.com", "911000002");
        eleitor3 = new Eleitor("Carla Mendes", "E003", 19, "carla@mail.com", "911000003");
        eleitor4 = new Eleitor("Tiago Lopes", "E004", 40, "tiago@mail.com", "911000004");

        // Eleitores para a associação de estudantes

        eleitor5 = new Eleitor("Rita Faria", "E005", 13, "rita@mail.com", "911000005");
        eleitor6 = new Eleitor("Miguel Almeida", "E006", 14, "miguel@mail.com", "911000006");
        eleitor7 = new Eleitor("Inês Pires", "E007", 15, "ines@mail.com", "911000007");
        eleitor8 = new Eleitor("Bruno Carvalho", "E008", 19, "bruno@mail.com", "911000008");


    }

    // Testes para o metodo adicionarCandidato

    @Test
    public void testeAdicionarCandidatoIdadeMinima(){

        // eleição autárquica, idade minima 18

        // adicionar candidato aut2, idade 18
        eleicaoAutarquica.adicionarCandidato(aut2);

        assertEquals(aut2, eleicaoAutarquica.getCandidatos().get(0));


        // CONTROLO

        // eleição ass. estudantes, idade minima 14

        // adicionar candidato ass2, idade 14
        eleicaoAssociacaoEstudantes.adicionarCandidato(ass2);

        assertEquals(ass2, eleicaoAssociacaoEstudantes.getCandidatos().get(0));


    }

    @Test
    public void testeAdicionarCandidatoIdadeMaiorMinima(){

        // eleição autárquica, idade minima 18

        // adicionar candidato aut3, idade 19
        eleicaoAutarquica.adicionarCandidato(aut3);

        assertEquals(aut3, eleicaoAutarquica.getCandidatos().get(0));


        // CONTROLO

        // eleição ass. estudantes, idade minima 14

        // adicionar candidato ass3, idade 15
        eleicaoAssociacaoEstudantes.adicionarCandidato(ass3);

        assertEquals(ass2, eleicaoAssociacaoEstudantes.getCandidatos().get(0));


    }

    @Test
    public void testeAdicionarCandidatoIdadeInvalida(){


    }

    @Test
    public void testeAdicionarCandidatoRepetido(){


    }

    @Test
    public void testeAdicionarCandidatoNull(){


    }



}

