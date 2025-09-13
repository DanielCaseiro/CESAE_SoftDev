package Ex03;

public class ExpressShippingStrategy implements ShippingStrategy{

    @Override
    public double calculateShippingCost(double peso) {
        return peso*10.0;
    }

}
