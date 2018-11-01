package pl.dopierala.Behavioral.DP_State;

public class OrderStateDelivered implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier service for item pickup.");
        System.out.println("Payment rollback will be initiated upon receiving returned item.");
        return 30.0;
    }
}
