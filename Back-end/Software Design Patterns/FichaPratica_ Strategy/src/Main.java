import Ex02.FlatDiscountStrategy;
import Ex02.NoDiscountStrategy;
import Ex02.PaymentProcessor;
import Ex02.PercentageDiscountStrategy;
import Ex03.ExpressShippingStrategy;
import Ex03.OvernightShippingStrategy;
import Ex03.ShippingCalculator;
import Ex03.StandardShippingStrategy;
import Ex04.BlackAndWhiteFilterStrategy;
import Ex04.ImageProcessor;
import Ex04.SepiaFilterStrategy;
import Ex04.VintageFilterStrategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void imprimirFile (String caminhoFile) throws FileNotFoundException {

        // FichaPratica07 Ex01

        // Scanner para ler ficheiro
        File myFile = new File(caminhoFile);
        Scanner sc = new Scanner(myFile);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }



    }

    public static void main(String[] args) throws FileNotFoundException {

        // Ex02
//        PaymentProcessor paymentProcessor = new PaymentProcessor(new NoDiscountStrategy());
//        double total = paymentProcessor.calcularTotal(100.0);
//        System.out.println("Total sem desconto: " + total);
//        paymentProcessor = new PaymentProcessor(new FlatDiscountStrategy(10.0));
//        total = paymentProcessor.calcularTotal(100.0);
//        System.out.println("Total com desconto fixo: " + total);
//
//        paymentProcessor = new PaymentProcessor(new PercentageDiscountStrategy(20));
//        total = paymentProcessor.calcularTotal(100.0);
//        System.out.println("Total com desconto percentual: " + total);


        // Ex03
//        ShippingCalculator calculator = new ShippingCalculator(new StandardShippingStrategy());
//        double cost = calculator.calculateShippingCost(10.0);
//        System.out.println("Custo de portes padrão: €" + cost);
//
//        calculator = new ShippingCalculator(new ExpressShippingStrategy());
//        cost = calculator.calculateShippingCost(10.0);
//        System.out.println("Custo de portes expresso: €" + cost);
//
//        calculator = new ShippingCalculator(new OvernightShippingStrategy());
//        cost = calculator.calculateShippingCost(10.0);
//        System.out.println("Custo de portes noturno: €" + cost);


        // Ex04

//        ImageProcessor processor = new ImageProcessor(new BlackAndWhiteFilterStrategy());
//        processor.applyFilter("imagem1.jpg");
//        processor = new ImageProcessor(new SepiaFilterStrategy());
//        processor.applyFilter("imagem2.jpg");
//        processor = new ImageProcessor(new VintageFilterStrategy());
//        processor.applyFilter("imagem3.jpg");


//        imprimirFile("src/Ex04/imagemTeste.txt");

    }

}
