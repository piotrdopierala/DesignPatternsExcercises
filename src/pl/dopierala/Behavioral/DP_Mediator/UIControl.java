package pl.dopierala.Behavioral.DP_Mediator;

public interface UIControl {
    public void controlChanged(UIControl uiObject);
    public String getValue();
    public String getName();
}
