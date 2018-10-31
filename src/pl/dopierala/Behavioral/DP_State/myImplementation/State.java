package pl.dopierala.Behavioral.DP_State.myImplementation;

public enum State implements OrderState {
    NEW, PAID, IN_TRANSIT, DELIVERED;

    public void handleCancelation() {
        switch (this) {
            case NEW:
                System.out.println("canceling, was new no big deal.");
                break;
            case PAID:
                System.out.println("canceling, returning money.");
                break;
            case IN_TRANSIT:
                System.out.println("canceling, notified delivery company");
                break;
            case DELIVERED:
                System.out.println("calceling, sent out courier to pick up items.");
                break;
            default:
                throw new IllegalStateException();
        }
    }
    }
