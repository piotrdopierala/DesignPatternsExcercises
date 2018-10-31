package pl.dopierala.Behavioral.DP_State.myImplementation;

public class Main_DP_State {

    public static void main(String[] args) {
        Order o1 = new Order();

        o1.paymentSuccessful();
        o1.dispached();

        o1.cancel();
    }

}
