package pl.dopierala.Behavioral.DP_Observer;

public class QuantityObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        System.out.println("Quantity observer notified about quantity change.");
        System.out.println("actual quantity ="+order.getQuantity());
    }
}
