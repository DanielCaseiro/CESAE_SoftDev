package Ex03.Classes;


import Ex03.Enumeracoes.Extensoes;
import Ex03.Enumeracoes.TipoDoc;

public class DocFactory {

    public static Document createDoc(TipoDoc type, String autor, String nome) {
        switch (type) {
            case texto:
                return new DocTexto(autor, nome, Extensoes.docx);
            case calculo:
                return new DocCalculo(autor, nome,Extensoes.xlsx );
            case apresentacao:
                return new DocApresentacao(autor, nome, Extensoes.pptx );
            default:
                throw new IllegalArgumentException("\nTipo de documento inválido: " + type);
        }
    }

}
