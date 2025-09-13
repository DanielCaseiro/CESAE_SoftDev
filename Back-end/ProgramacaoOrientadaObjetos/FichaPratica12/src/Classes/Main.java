package Classes;

import Classes.SeresVivos.Animal;
import Classes.SeresVivos.Inseto;
import Classes.SeresVivos.Planta;
import Enumeracoes.AlimentacaoDieta;
import Enumeracoes.Familia;

public class Main {
    public static void main(String[] args) {

        // Criando o ambiente
        MeioAmbiente meioAmbiente1 = new MeioAmbiente("Galapagos", 100.0); // 100 litros de água
        
        // Instanciar e inserir os Seres Vivos
        // Plantas
        meioAmbiente1.inserirSerVivo(new Planta("Jatobá", "Hymenaea courbaril", "Brasil", 80, Familia.ARVORE, 4));
        meioAmbiente1.inserirSerVivo(new Planta("Rosa Vermelha", "Rosa gallica", "França", 2, Familia.FLORES, 2));
        meioAmbiente1.inserirSerVivo(new Planta("Camomila", "Matricaria chamomilla", "Alemanha", 1, Familia.ERVAS, 1));
        meioAmbiente1.inserirSerVivo(new Planta("Carvalho", "Quercus robur", "Portugal", 50, Familia.ARVORE, 5));
        meioAmbiente1.inserirSerVivo(new Planta("Girassol", "Helianthus annuus", "Ucrânia", 1, Familia.FLORES, 1));
        meioAmbiente1.inserirSerVivo(new Planta("Manjericão", "Ocimum basilicum", "Índia", 1, Familia.ERVAS, 0));
        meioAmbiente1.inserirSerVivo(new Planta("Orquídea", "Phalaenopsis", "Tailândia", 3, Familia.FLORES, 3));
        meioAmbiente1.inserirSerVivo(new Planta("Alecrim", "Rosmarinus officinalis", "Itália", 2, Familia.ERVAS, 2));
        meioAmbiente1.inserirSerVivo(new Planta("Dioneia", "Dionaea muscipula", "EUA", 4, Familia.COME_INSETOS, 4));
        meioAmbiente1.inserirSerVivo(new Planta("Nepenthes", "Nepenthes rajah", "Malásia", 6, Familia.COME_INSETOS, 5));

        // Animais
        meioAmbiente1.inserirSerVivo(new Animal("Leão", "Panthera leo", "África do Sul", 8, 190.0, 80, AlimentacaoDieta.CARNIVORO, "Rugido"));
        meioAmbiente1.inserirSerVivo(new Animal("Vaca", "Bos taurus", "Brasil", 5, 600.0, 40, AlimentacaoDieta.HERBIVIRO, "Muu"));
        meioAmbiente1.inserirSerVivo(new Animal("Urso", "Ursus arctos", "Rússia", 10, 400.0, 70, AlimentacaoDieta.OMNIVORO, "Roar"));
        meioAmbiente1.inserirSerVivo(new Animal("Gato", "Felis catus", "Egito", 3, 4.5, 65, AlimentacaoDieta.CARNIVORO, "Miau"));
        meioAmbiente1.inserirSerVivo(new Animal("Cavalo", "Equus ferus caballus", "Espanha", 7, 500.0, 60, AlimentacaoDieta.HERBIVIRO, "Relincho"));
        meioAmbiente1.inserirSerVivo(new Animal("Chimpanzé", "Pan troglodytes", "Congo", 6, 50.0, 90, AlimentacaoDieta.OMNIVORO, "Uu-uh"));
        meioAmbiente1.inserirSerVivo(new Animal("Papagaio", "Amazona aestiva", "Brasil", 4, 0.9, 50, AlimentacaoDieta.OMNIVORO, "Squawk"));
        meioAmbiente1.inserirSerVivo(new Animal("Elefante", "Loxodonta africana", "Quênia", 15, 6000.0, 75, AlimentacaoDieta.HERBIVIRO, "Barrito"));
        meioAmbiente1.inserirSerVivo(new Animal("Raposa", "Vulpes vulpes", "Canadá", 4, 7.0, 55, AlimentacaoDieta.OMNIVORO, "Yip"));
        meioAmbiente1.inserirSerVivo(new Animal("Tigre", "Panthera tigris", "Índia", 6, 220.0, 85, AlimentacaoDieta.CARNIVORO, "Grrr"));

        // Insetos
        meioAmbiente1.inserirSerVivo(new Inseto("Formiga", "Formicidae", "Brasil", 1, false));
        meioAmbiente1.inserirSerVivo(new Inseto("Abelha", "Apis mellifera", "México", 2, false));
        meioAmbiente1.inserirSerVivo(new Inseto("Vespa", "Vespula vulgaris", "Espanha", 1, true));
        meioAmbiente1.inserirSerVivo(new Inseto("Besouro", "Scarabaeidae", "Alemanha", 1, false));
        meioAmbiente1.inserirSerVivo(new Inseto("Mariposa", "Lepidoptera", "França", 2, false));

        meioAmbiente1.simulador(10);

    }
}
