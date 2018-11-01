package pl.dopierala.Behavioral.DP_State;

public class Main_DP_State {
    public static void main(String[] args) {
        Order order = new Order();

        order.paymentSuccesful();
        order.dispatched();

        order.cancel();

    }
}
