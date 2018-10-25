package pl.dopierala.Behavioral.DP_Mediator;

public class Main_DP_Mediator {
    public static void main(String[] args) {
        UIMediator mediator = new UIMediator();

        Label lbl = new Label("Label1",mediator);
        TextBox txtb = new TextBox("TextBox1",mediator);
        Slider sldr = new Slider("Slider1",mediator);

        System.out.println("change in slider");
        sldr.setValue("new value");
    }
}
