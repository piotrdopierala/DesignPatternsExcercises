package pl.dopierala.Behavioral.DP_Memento;

//Object of witch state we will save in memento.
public class WorkflowDesigner {
    private String workflow = "";

    public DesignerMemento createMemento() {
        return new DesignerMemento(workflow);
    }

    public void setMemento(DesignerMemento memento) {
        this.workflow = memento.getState();
        System.out.println("Memento restored");
        System.out.println("current workflow is:" + workflow);
    }

    public void execute(String command) {
        if (workflow.isEmpty()) {
            workflow += command;
        } else {
            workflow += "," + command;
        }
        System.out.println("Cmd executed.");
        System.out.println("current workflow is:" + workflow);
    }
}
