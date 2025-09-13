package Ex02;

public class FlatDiscountStrategy implements DiscountStrategy {
    double flatDiscont;

    public FlatDiscountStrategy(double flatDiscont) {
        this.flatDiscont = flatDiscont;
    }

    @Override
    public double calcularTotal( double valorOriginal) {
        return valorOriginal - flatDiscont;
    }
}
