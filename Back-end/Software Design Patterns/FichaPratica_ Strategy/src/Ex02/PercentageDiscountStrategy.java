package Ex02;

public class PercentageDiscountStrategy implements DiscountStrategy {
    double percentageDiscont;

    public PercentageDiscountStrategy(double percentageDiscont) {

        if(percentageDiscont < 0 || percentageDiscont > 100){
            throw new IllegalArgumentException(" Desconto invalido");
        }

        if(percentageDiscont > 1){
            percentageDiscont /= 100;
        }

        this.percentageDiscont = percentageDiscont;
    }

    @Override
    public double calcularTotal(double valorOriginal) {
        return valorOriginal * (1 - percentageDiscont);
    }
}
