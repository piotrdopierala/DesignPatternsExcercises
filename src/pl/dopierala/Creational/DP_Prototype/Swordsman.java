package pl.dopierala.Creational.DP_Prototype;

public class Swordsman extends GameUnit {

    private String state = "idle";

    public void attack() {
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return "Swordsman " + state + " @ " + getPosition();
    }

    //reset object to default value
    @Override
    protected void reset() {
        state = "idle";

    }
}
