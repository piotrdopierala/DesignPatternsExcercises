package pl.dopierala.Behavioral.DP_State;

public interface OrderState {
    //return cancellation fee, customer will be charged if canceling
    double handleCancellation();
}
