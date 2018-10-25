package pl.dopierala.Behavioral.DP_Mediator;

public class TextBox implements UIControl {
    private UIMediator mediator;
    private String value;
    private String name;

    public TextBox(String name, UIMediator mediator) {
        this.mediator = mediator;
        this.name=name;
        mediator.register(this);
    }

    @Override
    public void controlChanged(UIControl uiObject) {
        System.out.println(name+": notified that "+uiObject.getName()+" changed.");
        System.out.println(name+": New value is " + uiObject.getValue() + ".");
    }

    public void setValue(String value) {
        this.value = value;
        mediator.valueChanged(this);
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getName() {
        return name;
    }
}
