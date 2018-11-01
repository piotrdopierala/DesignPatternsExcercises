package pl.dopierala.Behavioral.DP_State;

public class OrderStatePaid implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Contacting payment gateway to rollback money transfer.");
        return 10.0;
    }
}
