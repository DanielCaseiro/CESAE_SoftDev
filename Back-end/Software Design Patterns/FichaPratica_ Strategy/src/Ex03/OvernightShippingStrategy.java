package Ex03;

public class OvernightShippingStrategy implements ShippingStrategy{

    @Override
    public double calculateShippingCost(double peso) {
        return peso*15.0;
    }

}
