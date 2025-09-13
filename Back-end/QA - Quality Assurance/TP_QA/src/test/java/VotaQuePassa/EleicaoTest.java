package VotaQuePassa;

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
    public void testeAdicionarCandidatoIdadeMenorMinima(){

        // eleição autárquica, idade minima 18

        // adicionar candidato aut1, idade 17
        assertThrows(IllegalArgumentException.class, () -> eleicaoAutarquica.adicionarCandidato(aut1));


        // CONTROLO

        // eleição ass. estudantes, idade minima 14

        // adicionar candidato ass1, idade 13

        assertThrows(IllegalArgumentException.class, () -> eleicaoAssociacaoEstudantes.adicionarCandidato(ass1));



    }

    @Test
    public void testeAdicionarCandidatoRepetido(){

        // eleição autárquica, idade minima 18

        // adicionar candidato aut2 (idade 18) via metodos nativos do Java
        eleicaoAutarquica.getCandidatos().add(aut2);

        // tentar adicionar candidato aut2 novamente via metodo da classe Eleição
        assertThrows(IllegalArgumentException.class, () -> eleicaoAutarquica.adicionarCandidato(aut2));


        // CONTROLO

        // eleição ass. estudantes, idade minima 14

        // adicionar candidato ass2 (idade 14) via metodos nativos do Java
        eleicaoAssociacaoEstudantes.getCandidatos().add(ass2);

        // tentar adicionar candidato ass2 novamente via metodo da classe Eleição
        assertThrows(IllegalArgumentException.class, () -> eleicaoAssociacaoEstudantes.adicionarCandidato(ass2));





    } // CHECAR

    @Test
    public void testeAdicionarCandidatoNull(){

        // eleição autárquica

        // adicionar candidato null
        Candidato autNull = null;
        assertThrows(IllegalArgumentException.class, () -> eleicaoAutarquica.adicionarCandidato(autNull));


        // CONTROLO

        // eleição ass. estudantes

        // adicionar candidato null
        Candidato assNull = null;
        assertThrows(IllegalArgumentException.class, () -> eleicaoAssociacaoEstudantes.adicionarCandidato(assNull));



    }


    // Testes para o metodo votar

    @Test
    public void testeVotarEleitorIdadeMinima(){

        // aleição autárquica, idade minima 18

        // adicionar candidato
        eleicaoAutarquica.adicionarCandidato(aut2);

        // testar metodo votar com eleitor2, idade 18
        eleicaoAutarquica.votar(eleitor2, aut2);

        assertEquals(1, eleicaoAutarquica.getVotos().size());



        // CONTROLO

        // eleição ass. estudantes, idade minima 14

        // adicionar candidato
        eleicaoAssociacaoEstudantes.adicionarCandidato(ass2);

        // testar metodo votar com eleitor6, idade 14
        eleicaoAutarquica.votar(eleitor6, ass2);

        assertEquals(1, eleicaoAssociacaoEstudantes.getVotos().size());


    }


    @Test
    public void testeVotarEleitorIdadeMaiorMinima(){

        // aleição autárquica, idade minima 18

        // adicionar candidato
        eleicaoAutarquica.adicionarCandidato(aut2);

        // testar metodo votar com eleitor3, idade 19
        eleicaoAutarquica.votar(eleitor3, aut2);

        assertEquals(1, eleicaoAutarquica.getVotos().size());


        // CONTROLO

        // eleição ass. estudantes, idade minima 14

        // adicionar candidato
        eleicaoAssociacaoEstudantes.adicionarCandidato(ass2);

        // testar metodo votar com eleitor7, idade 15
        eleicaoAutarquica.votar(eleitor7, ass2);

        assertEquals(1, eleicaoAssociacaoEstudantes.getVotos().size());

    }

    @Test
    public void testeVotarEleitorIdadeMenorMinima(){

        // aleição autárquica, idade minima 18

        // adicionar candidato
        eleicaoAutarquica.adicionarCandidato(aut2);

        // testar metodo votar com eleitor1, idade 17
        assertThrows(IllegalArgumentException.class, () -> eleicaoAutarquica.votar(eleitor3, aut2));



        // CONTROLO

        // eleição ass. estudantes, idade minima 14

        // adicionar candidato
        eleicaoAssociacaoEstudantes.adicionarCandidato(ass2);

        // testar metodo votar com eleitor5, idade 13
        assertThrows(IllegalArgumentException.class, () -> eleicaoAssociacaoEstudantes.votar(eleitor7, ass2));


    }

    @Test
    public void testeVotarCandidatoInexistente(){

        // aleição autárquica, idade minima 18

        // NÃO adicionar candidato

        // testar metodo votar com eleitor4, idade 40
        assertThrows(IllegalArgumentException.class, () -> eleicaoAutarquica.votar(eleitor4, aut2));


        // CONTROLO

        // eleição ass. estudantes, idade minima 14

        // NÃO adicionar candidato

        // testar metodo votar com eleitor8, idade 19
        assertThrows(IllegalArgumentException.class, () -> eleicaoAssociacaoEstudantes.votar(eleitor8, ass2));




    }

    @Test
    public void testeVotarEleitorJaVotouMesmoObjeto(){

        // aleição autárquica, idade minima 18

        // adicionar candidato
        eleicaoAutarquica.adicionarCandidato(aut2);

        // votar com eleitor3, idade 19
        eleicaoAutarquica.votar(eleitor3, aut2);

        // tentar votar novamente
        assertThrows(IllegalArgumentException.class, () -> eleicaoAutarquica.votar(eleitor3, aut2));



        // CONTROLO

        // eleição ass. estudantes, idade minima 14

        // adicionar candidato
        eleicaoAssociacaoEstudantes.adicionarCandidato(ass2);

        // votar com eleitor7, idade 15
        eleicaoAutarquica.votar(eleitor7, ass2);

        // tentar votar novamente
        assertThrows(IllegalArgumentException.class, () -> eleicaoAssociacaoEstudantes.votar(eleitor7, aut2));


    }

    @Test
    public void testeVotarEleitorJaVotouObjetosDiferentesMesmoNome(){

        // aleição autárquica, idade minima 18

        // adicionar candidato
        eleicaoAutarquica.adicionarCandidato(aut2);

        // votar com eleitor3, idade 19
        eleicaoAutarquica.votar(eleitor3, aut2);

        // criar novo eleitor com mesmo nome que eleitor3
        Eleitor eleitorRepetido1 = new Eleitor("Carla Mendes", "E003", 19, "carla@mail.com", "911000003");

        // tentar votar novamente
        assertThrows(IllegalArgumentException.class, () -> eleicaoAutarquica.votar(eleitorRepetido1, aut2));



        // CONTROLO

        // eleição ass. estudantes, idade minima 14

        // adicionar candidato
        eleicaoAssociacaoEstudantes.adicionarCandidato(ass2);

        // votar com eleitor7, idade 15
        eleicaoAutarquica.votar(eleitor7, ass2);

        // criar novo eleitor com mesmo nome que eleitor7

        Eleitor eleitorRepetido2 = new Eleitor("Inês Pires", "E007", 15, "ines@mail.com", "911000007");


        // tentar votar novamente
        assertThrows(IllegalArgumentException.class, () -> eleicaoAssociacaoEstudantes.votar(eleitorRepetido2, aut2));


    }

    @Test
    public void testeVotarEleitorJaVotouCandidatosDistintos(){

        // aleição autárquica, idade minima 18

        // adicionar candidato aut2
        eleicaoAutarquica.adicionarCandidato(aut2);

        // adicionar candidato aut3
        eleicaoAutarquica.adicionarCandidato(aut3);

        // votar com eleitor3 em aut2
        eleicaoAutarquica.votar(eleitor3, aut2);

        // tentar votar com eleitor3 em aut3
        assertThrows(IllegalArgumentException.class, () -> eleicaoAutarquica.votar(eleitor3, aut3));



        // CONTROLO

        // eleição ass. estudantes, idade minima 14

        // adicionar candidato ass2
        eleicaoAssociacaoEstudantes.adicionarCandidato(ass2);

        // adicionar candidato ass3
        eleicaoAssociacaoEstudantes.adicionarCandidato(ass3);

        // votar com eleitor7 em ass2
        eleicaoAutarquica.votar(eleitor7, ass2);

        // tentar votar com eleitor7 em ass3
        assertThrows(IllegalArgumentException.class, () -> eleicaoAssociacaoEstudantes.votar(eleitor7, ass3));


    }



    // Testes contar votos

    @Test
    public void testeContarVotos(){

        // aleição autárquica, idade minima 18

        // adicionar candidato
        eleicaoAutarquica.adicionarCandidato(aut2);

        // votar com eleitor3, idade 19
        eleicaoAutarquica.votar(eleitor3, aut2);

        // testar contar votos
        assertEquals(1, eleicaoAutarquica.contarVotos(aut2));

        // CONTROLO

        // eleição ass. estudantes, idade minima 14

        // adicionar candidato
        eleicaoAssociacaoEstudantes.adicionarCandidato(ass2);

        // votar com eleitor7, idade 15
        eleicaoAutarquica.votar(eleitor7, ass2);

        // testar contar votos
        assertEquals(1, eleicaoAssociacaoEstudantes.contarVotos(ass2));


    }


    // Testes obter vencedor

    @Test
    public void testeObterVencedorSemEmpate(){

        // aleição autárquica, idade minima 18

        // adicionar candidato aut2
        eleicaoAutarquica.adicionarCandidato(aut2);

        // adicionar candidato aut3
        eleicaoAutarquica.adicionarCandidato(aut3);

        // adicionar candidato aut4
        eleicaoAutarquica.adicionarCandidato(aut4);

        // votar em aut2 com eleitor2, idade 18
        eleicaoAutarquica.votar(eleitor2, aut2);

        // votar em aut2 com eleitor3, idade 19
        eleicaoAutarquica.votar(eleitor3, aut2);

        // votar em aut2 com eleitor4, idade 40
        eleicaoAutarquica.votar(eleitor4, aut2);

        // testar obter vencedor
        assertEquals(aut2, eleicaoAutarquica.obterVencedor());

        // CONTROLO

        // aleição ass. estudantes, idade minima 14

        // adicionar candidato ass2
        eleicaoAutarquica.adicionarCandidato(ass2);

        // adicionar candidato ass3
        eleicaoAutarquica.adicionarCandidato(ass3);

        // adicionar candidato ass4
        eleicaoAutarquica.adicionarCandidato(ass4);

        // votar em ass2 com eleitor6, idade 14
        eleicaoAutarquica.votar(eleitor6, ass2);

        // votar em ass2 com eleitor7, idade 15
        eleicaoAutarquica.votar(eleitor7, ass2);

        // votar em ass2 com eleitor8, idade 19
        eleicaoAutarquica.votar(eleitor8, ass2);

        // testar obter vencedor
        assertEquals(ass2, eleicaoAssociacaoEstudantes.obterVencedor());

    }

    @Test
    public void testeObterVencedorComEmpate(){

        // aleição autárquica, idade minima 18

        // adicionar candidato aut2
        eleicaoAutarquica.adicionarCandidato(aut2);

        // adicionar candidato aut3
        eleicaoAutarquica.adicionarCandidato(aut3);

        // adicionar candidato aut4
        eleicaoAutarquica.adicionarCandidato(aut4);

        // votar em aut2 com eleitor2, idade 18
        eleicaoAutarquica.votar(eleitor2, aut2);

        // votar em aut2 com eleitor3, idade 19
        eleicaoAutarquica.votar(eleitor3, aut2);

        // votar em aut3 com eleitor4, idade 40
        eleicaoAutarquica.votar(eleitor4, aut3);

        // testar obter vencedor
        assertNull(eleicaoAutarquica.obterVencedor());

        // CONTROLO

        // aleição ass. estudantes, idade minima 14

        // adicionar candidato ass2
        eleicaoAutarquica.adicionarCandidato(ass2);

        // adicionar candidato ass3
        eleicaoAutarquica.adicionarCandidato(ass3);

        // adicionar candidato ass4
        eleicaoAutarquica.adicionarCandidato(ass4);

        // votar em ass2 com eleitor6, idade 14
        eleicaoAutarquica.votar(eleitor6, ass2);

        // votar em ass2 com eleitor7, idade 15
        eleicaoAutarquica.votar(eleitor7, ass2);

        // votar em ass3 com eleitor8, idade 19
        eleicaoAutarquica.votar(eleitor8, ass3);

        // testar obter vencedor
        assertNull(eleicaoAssociacaoEstudantes.obterVencedor());

    }





}







