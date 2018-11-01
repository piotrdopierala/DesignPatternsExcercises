package pl.dopierala.Behavioral.DP_Mediator;

public class Label implements UIControl {
    private UIMediator mediator;
    private String value;
    private String name;
    private boolean mediatedUpdate; //changing value because of mediator notify, don't notify other object its a LOOP! Break the loop.


    public Label(String name, UIMediator mediator) {
        this.mediator = mediator;
        this.name = name;
        mediator.register(this);
    }

    @Override
    public void controlChanged(UIControl uiObject) {
        System.out.println(name + ": notified that " + uiObject.getName() + " changed.");
        System.out.println(name + ": OrderStateNew value is " + uiObject.getValue() + ".");
        mediatedUpdate = false;
    }

    public void setValue(String value) {
        this.value = value;
        if (!mediatedUpdate)
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
