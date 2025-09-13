package Ex02;

public class PaymentProcessor {
    private DiscountStrategy tipoDesconto;

    public PaymentProcessor(DiscountStrategy tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    public void setTipoDesconto(DiscountStrategy tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    // metodo calculateTotal
    public double calcularTotal(double valor) {
        return this.tipoDesconto.calcularTotal(valor);
    }

}
