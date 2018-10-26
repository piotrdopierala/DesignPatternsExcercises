package pl.dopierala.Behavioral.DP_Memento;

public class DesignerMemento {
    private String state;

    public DesignerMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
