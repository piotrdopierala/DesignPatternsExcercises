package pl.dopierala.Behavioral.DP_State;

public class OrderStateInTransit implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier service for cancelations.");
        System.out.println("Contacting payment gateway to rollback money transfer.");
        return 20.0;
    }
}
