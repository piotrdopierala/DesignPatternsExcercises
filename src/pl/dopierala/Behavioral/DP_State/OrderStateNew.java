package pl.dopierala.Behavioral.DP_State;

public class OrderStateNew implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("It's a new Order. No processing done. Just cancelling.");
        return 0.0; //not charging customer, it was new order.
    }
}
