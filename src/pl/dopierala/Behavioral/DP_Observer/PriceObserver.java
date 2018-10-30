package pl.dopierala.Behavioral.DP_Observer;

public class PriceObserver implements OrderObserver {
    @Override
    public void updated(Order order) {

        System.out.println("Price observer notified about price change.");
        System.out.println("actual price ="+order.getTotalPrice());
    }
}
