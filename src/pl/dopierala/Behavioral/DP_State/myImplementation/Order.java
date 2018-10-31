package pl.dopierala.Behavioral.DP_State.myImplementation;

public class Order {

    private State state;


    public Order() {
        this.state = State.NEW;
    }

    public void cancel(){
        state.handleCancelation();
    }

    public void paymentSuccessful(){
        //transit state to Paid
        this.state=State.PAID;
    }

    public void dispached(){
        //transit state do InTransit
        this.state=State.IN_TRANSIT;
    }

    public void delivered(){
        //transit state to delivered
        this.state=State.DELIVERED;
    }

}
