import Ex01.Classes.Product;
import Ex01.Classes.ProductFactory;
import Ex02.Classes.Taco;
import Ex02.Classes.TacoFactory;
import Ex03.Classes.DocFactory;
import Ex03.Classes.Document;
import Ex03.Enumeracoes.TipoDoc;

public class Main {

    public static void main(String[] args) {

         // Products
        Product book = ProductFactory.createProduct("book");
        Product electronics = ProductFactory.createProduct("electronics");
        Product clothing = ProductFactory.createProduct("clothing");

        book.display();
        electronics.display();
        clothing.display();


        // Tacos
        Taco carne = TacoFactory.createTaco("carne",1, 1.5,true);
        Taco frango = TacoFactory.createTaco("frango",2,2.5,false);
        Taco vegetariano = TacoFactory.createTaco("vegetariano",1,1.0,true);

        carne.Prepare();
        carne.Bake();
        carne.Box();

        frango.Prepare();
        frango.Bake();
        frango.Box();


        vegetariano.Prepare();
        vegetariano.Bake();
        vegetariano.Box();


        // Documents
        Document docTexto1 = DocFactory.createDoc(TipoDoc.texto,"João","relatorio");
        Document docCalculo1 = DocFactory.createDoc(TipoDoc.calculo,"Maria","vendas");
        Document docApresentacao1 = DocFactory.createDoc(TipoDoc.apresentacao,"Joaquim","Resultado Trimestral");

        docTexto1.Open();
        docTexto1.Save();
        docTexto1.Close();

        docCalculo1.Open();
        docCalculo1.Save();
        docCalculo1.Close();

        docApresentacao1.Open();
        docApresentacao1.Save();
        docApresentacao1.Close();

    }

}
