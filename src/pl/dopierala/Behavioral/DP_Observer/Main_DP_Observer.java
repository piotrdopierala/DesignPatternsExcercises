package pl.dopierala.Behavioral.DP_Observer;

public class Main_DP_Observer {
    public static void main(String[] args) {
        Order o1 = new Order();
        PriceObserver priceObs = new PriceObserver();
        QuantityObserver quantObs = new QuantityObserver();

        o1.attach(priceObs);
        o1.attach(quantObs);

        o1.setQuantity(10);
    }
}
