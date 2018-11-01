package pl.dopierala.Behavioral.DP_Mediator;

import javafx.beans.InvalidationListener;

public class TextBox implements UIControl {
    private UIMediator mediator;
    private String value;
    private String name;
    private boolean mediatedUpdate; //changing value because of mediator notify, don't notify other object its a LOOP! Break the loop.

    public TextBox(String name, UIMediator mediator) {
        this.mediator = mediator;
        this.name=name;
        mediator.register(this);
    }

    private InvalidationListener changed() {
        return null;
    }



    @Override
    public void controlChanged(UIControl uiObject) {
        System.out.println(name+": notified that "+uiObject.getName()+" changed.");
        System.out.println(name+": OrderStateNew value is " + uiObject.getValue() + ".");
        mediatedUpdate=true;
        this.setValue(uiObject.getValue());
        mediatedUpdate=false;
    }

    public void setValue(String value) {
        this.value = value;
        if(!mediatedUpdate)
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
