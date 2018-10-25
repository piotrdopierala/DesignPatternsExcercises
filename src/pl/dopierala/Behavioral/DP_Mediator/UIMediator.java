package pl.dopierala.Behavioral.DP_Mediator;

import java.util.ArrayList;
import java.util.List;

public class UIMediator {

    private List<UIControl> controls = new ArrayList<>();

    public void register(UIControl control){
        if (!controls.contains(control)) {
            controls.add(control);
        }
    }

    //notifying mediator that object passed in parameters changed its value.
    public void valueChanged(UIControl control){

        controls.stream().filter(p->p!=control).forEach(p->p.controlChanged(control));

        /*
        for (int i = 0; i < controls.size(); i++) {
            if(controls.get(i)!=control){
                controls.get(i).controlChanged(control);
            }
        }
        */
    }

}
