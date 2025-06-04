package Classes;

import Classes.SeresVivos.Planta;
import Classes.SeresVivos.SerVivo;

import java.util.ArrayList;

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
                " | água: " + this.agua
        );

        System.out.println("--------------- Seres Vivos neste ambiente ---------------");

        int i = 0;
        for (SerVivo serAtual : this.seres){
            System.out.print("| index: " + i);
            System.out.println(" | " + serAtual.getNome() + " " + serAtual.getEspecie());
            i++;
        }
    }

    // Metodo Boolean plantaBebeAgua(int indexPlanta)
    public boolean plantaBebeAgua(int indexPlanta) {
        boolean bebeuAgua = false;

        SerVivo plantaAtual = this.seres.get(indexPlanta);

        if(plantaAtual instanceof Planta){
            // logica a ser desenvolvida...
        } else {

        }

        return bebeuAgua;
    }

    // Boolean plantaBebe(int indexPlanta): analisa a água disponível no meio ambiente e, caso seja
    //possível, de acordo com a família: árvores bebem 1L, flores bebem 0.1L e ervas bebem 0.25L e
    //retorna true (a água em meio ambiente deve também diminuir). Se retornar true, então a planta
    //bebeu e água do meio diminuiu. Se retornar false, a planta não bebe e seca (deve ser retirada do
    //meio ambiente).



}
