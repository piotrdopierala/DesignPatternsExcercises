package pl.dopierala.Behavioral.DP_Memento;

import java.util.LinkedList;
import java.util.List;

public class AddCommand implements Command {

    private String state;
    private List<DesignerMemento> mementos = new LinkedList();

    @Override
    public void execute(WorkflowDesigner wd, String command) {
        mementos.add(wd.createMemento()); //save current state before applying command. Add it as list.
        wd.execute(command);
    }

    @Override
    public void undo(WorkflowDesigner wd) {
        wd.setMemento(mementos.remove(mementos.size()-1)); //get last memento and send it to object to set as its state (restore)
    }
}
