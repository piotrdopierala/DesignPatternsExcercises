package pl.dopierala.Behavioral.DP_Memento;

import java.util.Arrays;
import java.util.LinkedList;

//Object of witch state we will save in memento.
public class Workflow{
    private LinkedList<String> steps;
    private String name;

    public Workflow(String name) {
        this.name = name;
        this.steps = new LinkedList<>();
    }

    public Workflow(String name,String... steps) {
        this.name = name;
        this.steps = new LinkedList<>();
        if(steps!=null && steps.length>0) {
            //this.steps.addAll(Arrays.asList(steps));
            Arrays.stream(steps).forEach(p -> this.steps.add(p));
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Workflow [name=");
        builder.append(name).append("]\nBEGIN-> ");
        for (String s : steps){
            builder.append(s).append(" -> ");
        }
        return builder.toString();
    }


    public void addStep(String step) {
        steps.addLast(step);
    }

    public void removeStep(String step) {
        steps.remove(step);
    }

    public String[] getSteps() {
        return steps.toArray(new String[0]);
    }

    public String getName() {
        return name;
    }
}
