package pl.dopierala.Behavioral.DP_State;

public class OrderStateCancelled implements OrderState {

    @Override
    public double handleCancellation() {
        throw new IllegalStateException("Cancel called on already canceled object.");
    }



}
