package Funcoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static Funcoes.FuncoesGerais.*;

public class FuncoesCliente {

    /**
     * Função que simula registar um novo utilizador da plataforma
     */
    public static void novoRegisto() {

        //Criar scanner utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        String nomeUtilizador, contactoUtilizador, emailUtilizador;

        //Ler o nome
        System.out.print("Insira Nome: ");
        nomeUtilizador = input.nextLine();
        System.out.println(" ");

        //Ler o contacto
        System.out.print("Insira Contacto: ");
        contactoUtilizador = input.nextLine();
        System.out.println(" ");

        //Ler o email
        System.out.print("Insira Email: ");
        emailUtilizador = input.nextLine();
        System.out.println(" ");

        // Apresentar mensagem com as informações fornecidas
        System.out.print("Utilizador Inserido com Sucesso: " + nomeUtilizador + " | " + contactoUtilizador + " | " + emailUtilizador);

    }

/* ------------------------------------------------------------------------------------------- */

    /**
     * Função que lê uma matriz do tipo String e imprime apenas as duas colunas especificadas
     * @param matriz A matriz do tipo String a ser lida
     * @param indexColunaFilmes Numero inteiro que representa o index da primeira coluna a ser impressa
     * @param indexColunaRating Numero inteiro que representa o index da segunda coluna a ser impressa
     */
    public static void imprimirCatalogo (String [][] matriz, int indexColunaFilmes, int indexColunaRating) {

        for(int linha = 0; linha < matriz.length; linha ++) {
            System.out.print(matriz[linha][indexColunaFilmes] + " | ");
            System.out.println(matriz[linha][indexColunaRating]);
        }

    }

/* ------------------------------------------------------------------------------------------- */

    /**
     * Função que cria um menu switch com as opções de catálogos gráficos e imprime a opção escolhida
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public  static void menuCatalogosGraficos () throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("_*_*_*_*_*_ Imprimir Catálogos Gráficos _*_*_*_*_*_");
        System.out.println("1. Harry Potter");
        System.out.println("2. Interstellar");
        System.out.println("3. Lord of The Rings");
        System.out.println("4. Star Wars");
        System.out.println("0. Retornar ao Menu anterior");
        System.out.println(" ");
        System.out.print("Escolha uma opção de Catálogo Gráfico: ");
        int opcaoGrafico;
        opcaoGrafico = input.nextInt();

        switch (opcaoGrafico) {

            case 1:
                System.out.println(" ");
                System.out.println("_*_*_*_*_*_ Harry Potter _*_*_*_*_*_ ");
                System.out.println(" ");
                imprimirFile("Files/CatalogoGrafico/HarryPotter.txt");
                System.out.println(" ");

                break;

            case 2:
                System.out.println(" ");
                System.out.println("_*_*_*_*_*_ Interstellar _*_*_*_*_*_ ");
                System.out.println(" ");
                imprimirFile("Files/CatalogoGrafico/Interstellar.txt");
                System.out.println(" ");

                break;

            case 3:
                System.out.println(" ");
                System.out.println("_*_*_*_*_*_ Lord of The Rings _*_*_*_*_*_ ");
                System.out.println(" ");
                imprimirFile("Files/CatalogoGrafico/LordOfTheRings.txt");
                System.out.println(" ");

                break;

            case 4:
                System.out.println(" ");
                System.out.println("_*_*_*_*_*_ Star Wars _*_*_*_*_*_ ");
                System.out.println(" ");
                imprimirFile("Files/CatalogoGrafico/StarWars.txt");
                System.out.println(" ");

                break;

            case 0:
                System.out.println(" ");
                System.out.println("Retornando ao Menu anterior...");
                System.out.println(" ");

                break;

            default:
                System.out.println(" ");
                System.out.println("Opção inválida;");

        }

    }

/* ------------------------------------------------------------------------------------------- */


    /**
     * Função que soma todos os ratings de cada estúdio e retorna um array com as médias
     * @param matriz A matriz completa do tipo String com os valores a serem analisados
     * @param arrayEstudios Um array do tipo String com os nomes dos estúdios
     * @return Um array do tipo double com as médias de modo que o index de cada media corresponda ao index de cada estúdio no arrayEstúdios
     */
    public static double [] arrayMediaEstudios (String [][] matriz, String [] arrayEstudios) {

        // Iterar a matriz linha a linha.
        // Para cada iteração da matriz, iterar o array de estúdios e encontrar o estúdio correspondente ao valor da coluna[5] da matriz.
        // Somar o rating (coluna de index[2] na matriz) para dentro de um novo arraySomaRatings na posição do estúdio correspondente
        // Finalmente, somar 1 na posição correspondente de cada estúdio de um novo arrayContagem

        double arraySomaRatings[] = new double[arrayEstudios.length];
        double arrayContagem[] = new double[arrayEstudios.length];

        for (int linhaMatriz = 0; linhaMatriz < matriz.length; linhaMatriz++) {
            for (int i = 0; i < arrayEstudios.length; i++) {
                if (matriz[linhaMatriz][5].equals(arrayEstudios[i])) {
                    arraySomaRatings[i] = arraySomaRatings[i] + Double.parseDouble(matriz[linhaMatriz][2]);
                    arrayContagem[i] += 1;
                }
            }
        }

        // Dividir os valores do arraySomaRating pelos valores correspondentes do arrayContagem
        // para obter a média de cada estúdio e passar o resultado para um novo arrayMedia

        double arrayMediaEstudios[] = new double[arrayEstudios.length];

        for (int i = 0; i < arraySomaRatings.length; i++) {
            arrayMediaEstudios[i] = arraySomaRatings[i] / arrayContagem[i];
        }

        return arrayMediaEstudios;
    }

/* ------------------------------------------------------------------------------------------- */


    /**
     * Função que recebe um array com as médias e um array com os estúdios (em posições/index equivalentes) e imprime a maior media e o estudio correspondente
     * @param arrayMediaEstudios Array do tipo double com as medias dos estúdios
     * @param arrayEstudios Array do tipo String com os nomes dos estúdios
     */
    public static void imprimirMelhorStudio (double [] arrayMediaEstudios, String [] arrayEstudios) {

        // Encontrar o index da maior media

        double maiorMedia = arrayMediaEstudios[0];
        int indexMaiorMedia = 0;

        for (int i = 0; i < arrayMediaEstudios.length; i ++ ){
            if(arrayMediaEstudios[i] > maiorMedia) {
                maiorMedia = arrayMediaEstudios[i];
                indexMaiorMedia = i;
            }
        }

        // apresentar os resultados

        System.out.println(" ");
        System.out.println("O Estúdio com maior classificação média é: ");
        System.out.println(arrayEstudios[indexMaiorMedia]);
        System.out.println("Com uma classificação média de: ");
        System.out.println(maiorMedia);
        System.out.println(" ");


    }

/* ------------------------------------------------------------------------------------------- */


    /**
     * Função que recebe um array com as médias e um array com os estúdios (em posições/index equivalentes) e imprime a menor media e o estudio correspondente
     * @param arrayMediaEstudios Array do tipo double com as medias dos estúdios
     * @param arrayEstudios Array do tipo String com os nomes dos estúdios
     */
    public static void imprimirPiorStudio (double [] arrayMediaEstudios, String [] arrayEstudios) {

        // Encontrar o index da maior media

        double menorMedia = arrayMediaEstudios[0];
        int indexMenorMedia = 0;

        for (int i = 0; i < arrayMediaEstudios.length; i ++ ){
            if(arrayMediaEstudios[i] < menorMedia) {
                menorMedia = arrayMediaEstudios[i];
                indexMenorMedia = i;
            }
        }

        // apresentar os resultados

        System.out.println(" ");
        System.out.println("O Estúdio com menor classificação média é: ");
        System.out.println(arrayEstudios[indexMenorMedia]);
        System.out.println("Com uma classificação média de: ");
        System.out.println(menorMedia);
        System.out.println(" ");


    }

/* ------------------------------------------------------------------------------------------- */

    /**
     * Função que le um ficheiro CSV e imprime o cabeçalho e a última linha
     * @param caminho Caminho para o ficheiro
     * @param delimitador Uma string que representa o delimitador utilizado no ficheiro csv
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static void criticaMaisRecente (String caminho, String delimitador) throws FileNotFoundException {

        File myFile = new File(caminho);
        Scanner sc = new Scanner(myFile);

        // Imprimir o cabeçalho

        System.out.println("------------------------------------------------------------------------------------");

        String linha = sc.nextLine();
        String[ ] tokensDaLinha = linha.split(delimitador);
        for (int i = 0; i < tokensDaLinha.length; i++) {
            if (i < tokensDaLinha.length -1) {
                System.out.print(tokensDaLinha[i] + " | ");
            } else {
                System.out.println(tokensDaLinha[i]);
                System.out.print("------------------------------------------------------------------------------------");
            }
        }
        System.out.println(" ");

        // imprimir a última linha

       int numeroLinha = 1;

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            tokensDaLinha = linha.split(delimitador);
            numeroLinha ++;
            if (numeroLinha == numLinhasCSV(caminho)) {
                for (int i = 0; i < tokensDaLinha.length; i++) {
                    if (i < tokensDaLinha.length -1) {
                        System.out.print(tokensDaLinha[i] + " | ");
                    } else {
                        System.out.println(tokensDaLinha[i]);
                        System.out.print(" ");
                    }
                }
            }
        }

        System.out.print("------------------------------------------------------------------------------------");

    }

/* ------------------------------------------------------------------------------------------- */

    /**
     * Função que le uma matriz String e utiliza seus valores para criar um quiz
     * @param matriz A matriz a ser lida
     */
    public static void quiz (String [][] matriz) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcaoMenuQuiz,
            opcaoRespostaUtilizador,
            RespostaCorreta,
            pontuacao;

        // Apresentar o Quiz

        // Cabeçalho:
        // [0] pergunta; [1] opcao1; [2]opcao2; [3]opcao3; [4]opcao4; [5] resposta

        opcaoMenuQuiz = 1;
        pontuacao = 0;

        do {

            // Iterar a matriz linha a linha
            for (int linhaMatriz = 0; linhaMatriz < matriz.length; linhaMatriz++) {

                // Apresentar a pergunta
                System.out.println(" ");
                System.out.println("_*_*_*_ Pergunta nº" + (linhaMatriz+1) + " _*_*_*_");
                System.out.println(" ");
                System.out.println(matriz[linhaMatriz][0]);

                // Apresentar as alternativas
                System.out.println(" ");
                System.out.println("1. " + matriz[linhaMatriz][1]);
                System.out.println("2. " + matriz[linhaMatriz][2]);
                System.out.println("3. " + matriz[linhaMatriz][3]);
                System.out.println("4. " + matriz[linhaMatriz][4]);
                System.out.println(" ");
                System.out.print("Escolha uma opção: ");
                opcaoRespostaUtilizador = input.nextInt();

                // Apresentar a resposta correta
                System.out.println(" ");
                System.out.println("A resposta correta é: " + matriz[linhaMatriz][5]);
                System.out.println(" ");

                // Converter a resposta de String para int e verificar a resposta do utilizador
                RespostaCorreta = Integer.parseInt(matriz[linhaMatriz][5]);
                if (opcaoRespostaUtilizador == RespostaCorreta) {
                    pontuacao++;
                    System.out.println("Parabéns! Acertou a resposta e ganhou um ponto!");
                    System.out.println(" ");
                } else {
                    System.out.println("Ops! A resposta certa não era essa, mas não desanime.");
                    System.out.println(" ");
                }
            }

            // Apresentar o resultado

            System.out.println("Sua pontuação total é " + pontuacao);
            System.out.println(" ");

            if (pontuacao == 5) {
                System.out.println("Um score perfeito! Já podes se considerar um grande cinéfilo!");
                System.out.println(" ");
            } else if (pontuacao == 4) {
                System.out.println("Parabéns! Acertou quase todas!");
                System.out.println(" ");
            } else if (pontuacao == 3 || pontuacao == 2) {
                System.out.println("Bom trabalho! Continue a assistir nosso filmes que chegas lá!");
                System.out.println(" ");
            } else {
                System.out.println("É, parece que não foi desta vez...");
                System.out.println("Aposto que estas a pegar no sono nos primeiros minutos do filme, não é? Melhor sorte na próxima!");
                System.out.println(" ");
            }

            // Perguntar se o utilizador quer jogar novamente ou quer sair do Quiz
            System.out.println(" ");
            System.out.println("Quer jogar novamente?");
            System.out.println("1. Sim.");
            System.out.println("0. Não.");
            System.out.print("Escolha uma opção: ");
            opcaoMenuQuiz = input.nextInt();
            System.out.println(" ");


        } while (opcaoMenuQuiz != 0);

    }

/* ------------------------------------------------------------------------------------------- */


    /**
     * Função que imprime todos os filmes de um determinado estúdio organizados por gênero
     * @param caminho Caminho para o ficheiro
     * @param delimitador Uma string que representa o delimitador utilizado no ficheiro csv
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static void catalogoEstudio (String caminho, String delimitador) throws FileNotFoundException {

        // Criar a matriz
        String [] [] matriz = csvParaMatrizString(caminho, delimitador);

        // Utilizar a função arrayColuna para criar um vetor com os Generos, sem duplicatas
        // Index da coluna com os generos: [7]
        String [] arrayGeneros = arrayColuna(matriz,7);

        // Ler o estudio a pesquisar
        Scanner input = new Scanner(System.in);

        String estudioPesquisa;

        System.out.println(" ");
        System.out.print("Estúdio a pesquisar: ");
        estudioPesquisa = input.nextLine();
        System.out.println(" ");

        // Remover espaços em branco no início e fim
        estudioPesquisa = estudioPesquisa.trim();

        // Iterar o arrayGeneros e a matriz linha a linha para descobrir
        // quais gêneros o estudioPesquisa tem (atribuir 1 ou 0 no arrayGenerosEstudio)

        int [] arrayGenerosEstudio = new int[arrayGeneros.length];
        boolean generoEncontrado = false;

        for (int i = 0; i < arrayGeneros.length; i++) {
            for (int linhaMatriz = 0; linhaMatriz < matriz.length; linhaMatriz++) {
                if (matriz[linhaMatriz][5].equalsIgnoreCase(estudioPesquisa) && matriz[linhaMatriz][7].equals(arrayGeneros[i])) {
                    generoEncontrado = true;
                }
            }

            if(generoEncontrado) {
                arrayGenerosEstudio[i] = 1;
            } else {
                arrayGenerosEstudio[i] = 0;
            }

            generoEncontrado = false;
        }

        // Apresentar os resultados
        System.out.println("**** " + estudioPesquisa + " *****");
        System.out.println(" ");

        // Iterar o arrayGeneros e, para cada posição,
        // iterar a matriz linha a linha em busca dos filmes (coluna[1]) do estudioPesquisa (coluna[5])
        // usar o arrayGenerosEstudido para filtrar o primeiro print do ciclo

        for (int i = 0; i < arrayGeneros.length; i++) {

            if (arrayGenerosEstudio[i] == 1) {
                System.out.println(" ");
                System.out.println("__ " + arrayGeneros[i] + " __");
            }

            for (int linhaMatriz = 0; linhaMatriz < matriz.length; linhaMatriz++) {
                if (matriz[linhaMatriz][5].equalsIgnoreCase(estudioPesquisa) && matriz[linhaMatriz][7].equals(arrayGeneros[i])) {

                    System.out.println(matriz[linhaMatriz][1]);

                }
            }


        }



    }

/* ------------------------------------------------------------------------------------------- */


    /**
     * Função que imprime todos os filmes de um determinado genero organizados por estudio
     * @param caminho Caminho para o ficheiro
     * @param delimitador Uma string que representa o delimitador utilizado no ficheiro csv
     * @throws FileNotFoundException Caso o ficheiro não exista
     */
    public static void catalogoCategoria (String caminho, String delimitador) throws FileNotFoundException {

        // Criar a matriz
        String [] [] matriz = csvParaMatrizString(caminho, delimitador);

        // Utilizar a função arrayColuna para criar um vetor com os Estúdios, sem duplicatas
        // Index da coluna com os estúdios: [5]
        String [] arrayEstudios = arrayColuna(matriz,5);

        // Ler o estudio a pesquisar
        Scanner input = new Scanner(System.in);

        String generoPesquisa;

        System.out.println(" ");
        System.out.print("Género a pesquisar: ");
        generoPesquisa = input.nextLine();
        System.out.println(" ");

        // Remover espaços em branco no início e fim
        generoPesquisa = generoPesquisa.trim();

        // Iterar o arrayEstudios e a matriz linha a linha para descobrir
        // quais estúdios possuem filmes do generoPesquisa (atribuir 1 ou 0 no arrayEstudioGenero)

        int [] arrayEstudioGenero = new int[arrayEstudios.length];
        boolean estudioEncontrado = false;

        for (int i = 0; i < arrayEstudios.length; i++) {
            for (int linhaMatriz = 0; linhaMatriz < matriz.length; linhaMatriz++) {
                if (matriz[linhaMatriz][7].equalsIgnoreCase(generoPesquisa) && matriz[linhaMatriz][5].equals(arrayEstudios[i])) {
                    estudioEncontrado = true;
                }
            }

            if(estudioEncontrado) {
                arrayEstudioGenero[i] = 1;
            } else {
                arrayEstudioGenero[i] = 0;
            }

            estudioEncontrado = false;
        }

        // Apresentar os resultados
        System.out.println("**** " + generoPesquisa + " *****");
        System.out.println(" ");

        // Iterar o arrayEstudios e, para cada posição,
        // iterar a matriz linha a linha em busca dos filmes (coluna[1]) do generoPesquisa (coluna[7])
        // usar o arrayGenerosEstudido para filtrar o primeiro print do ciclo

        for (int i = 0; i < arrayEstudios.length; i++) {

            if (arrayEstudioGenero[i] == 1) {
                System.out.println(" ");
                System.out.println("__ " + arrayEstudios[i] + " __");
            }

            for (int linhaMatriz = 0; linhaMatriz < matriz.length; linhaMatriz++) {
                if (matriz[linhaMatriz][7].equalsIgnoreCase(generoPesquisa) && matriz[linhaMatriz][5].equals(arrayEstudios[i])) {

                    System.out.println(matriz[linhaMatriz][1]);

                }
            }


        }



    }

/* ------------------------------------------------------------------------------------------- */


    /**
     * Função que cria o menu do Cliente para o programa Cinema Imdv
     * @throws FileNotFoundException Caso os ficheiros lidos pelas funções dentro do menu não sejam encontrados
     */
    public static void menuCliente () throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println(" ");
            System.out.println(" ");
            System.out.println("_*_*_*_*_*_*_*_*_*_ MENU CLIENTE _*_*_*_*_*_*_*_*_*_");
            System.out.println("1. Novo Registo");
            System.out.println("2. Imprimir Catálogo");
            System.out.println("3. Imprimir Catálogos Gráficos");
            System.out.println("4. Imprimir Melhor Estúdio");
            System.out.println("5. Imprimir Pior Estúdio");
            System.out.println("6. Imprimir Crítica Mais Recente");
            System.out.println("7. Quiz");
            System.out.println("8. Imprimir Catálogo Estúdio");
            System.out.println("9. Imprimir Catálogo Categoria");
            System.out.println("0. Sair");
            System.out.println(" ");

            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Novo Registo _*_*_*_*_*_");
                    System.out.println(" ");
                    novoRegisto();
                    System.out.println(" ");



                    break;

                case 2:

                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Imprimir Catálogo _*_*_*_*_*_");
                    System.out.println(" ");
                    System.out.println("Título  |  rating");
                    imprimirCatalogo(csvParaMatrizString("Files/IMDV.csv",";"),1,2);
                    System.out.println(" ");


                    break;

                case 3:

                    menuCatalogosGraficos();

                    break;

                case 4:

                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Melhor Estúdio _*_*_*_*_*_");
                    System.out.println(" ");
                    imprimirMelhorStudio(arrayMediaEstudios(csvParaMatrizString("Files/IMDV.csv",";"),arrayColuna(csvParaMatrizString("Files/IMDV.csv",";"),5)), arrayColuna(csvParaMatrizString("Files/IMDV.csv",";"),5));
                    System.out.println(" ");


                    break;

                case 5:

                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Pior Estúdio _*_*_*_*_*_");
                    System.out.println(" ");
                    imprimirPiorStudio(arrayMediaEstudios(csvParaMatrizString("Files/IMDV.csv",";"),arrayColuna(csvParaMatrizString("Files/IMDV.csv",";"),5)), arrayColuna(csvParaMatrizString("Files/IMDV.csv",";"),5));
                    System.out.println(" ");


                    break;

                case 6:

                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Crítica Mais Recente _*_*_*_*_*_");
                    System.out.println(" ");
                    criticaMaisRecente("Files/IMDV.csv",";");


                    break;

                case 7:

                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Quiz _*_*_*_*_*_");
                    System.out.println(" ");
                    System.out.println("Bem vindo ao quiz do IMDV!");
                    System.out.println("Neste jogo, poderá testar seus conhecimentos sobre o mundo do cinema.");
                    System.out.println("Responda cada pergunta com o seu melhor palpite e, ao final, confira quantos pontos fez.");
                    System.out.println(" ");
                    quiz(csvParaMatrizString("Files/IMDV_Quiz.csv",";"));


                    break;

                case 8:

                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Imprimir Catálogo Estúdio _*_*_*_*_*_");
                    System.out.println(" ");
                    catalogoEstudio("Files/IMDV.csv",";");
                    System.out.println(" ");


                    break;

                case 9:

                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Imprimir Catálogo Categoria _*_*_*_*_*_");
                    System.out.println(" ");
                    catalogoCategoria("Files/IMDV.csv",";");
                    System.out.println(" ");


                    break;

                case 0:
                    System.out.println(" ");
                    System.out.println("_*_*_*_*_*_ Programa Encerrado _*_*_*_*_*_ ");
                    System.out.println(" ");
                    imprimirFile("Files/IMDV_Copyright.txt");
                    System.out.println(" ");

                    break;

                default:
                    System.out.println(" ");
                    System.out.println("Opção inválida;");

            }

        } while (opcao != 0);
    }







/* ------------------------------------------------------------------------------------------- */
/* ------------------------------------------------------------------------------------------- */
/* ------------------------------------------------------------------------------------------- */
}
