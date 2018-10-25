package pl.dopierala.Behavioral.DP_Mediator;

import java.util.ArrayList;
import java.util.List;

public class UIMediator {

    private List<UIControl> controls = new ArrayList<>();

    public void register(UIControl control){
        controls.add(control);
    }

    public void valueChanged(UIControl control){
        for (int i = 0; i < controls.size(); i++) {
            if(controls.get(i)!=control){
                controls.get(i).controlChanged(control);
            }
        }
    }

}
