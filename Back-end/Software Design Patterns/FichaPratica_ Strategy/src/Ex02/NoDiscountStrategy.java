package Ex02;

public class NoDiscountStrategy implements DiscountStrategy {

    @Override
    public double calcularTotal( double valor) {
        return valor;
    }
}
