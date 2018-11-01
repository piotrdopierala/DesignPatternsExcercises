package pl.dopierala.Behavioral.DP_State;

//context class in State DP (each state is separate class)
public class Order {

    private OrderState currentState;

    public Order() {
        this.currentState = new OrderStateNew();
    }

    //behaviour of cancel is heavily dependent on state of order
    public double cancel() {
        double cancelFee = currentState.handleCancellation();
        currentState = new OrderStateCancelled();

        return cancelFee;
    }

    public void paymentSuccesful() {
        currentState = new OrderStatePaid();
    }

    public void dispatched() {
        currentState = new OrderStateInTransit();
    }

    public void delivered() {
        currentState = new OrderStateDelivered();
    }

}
