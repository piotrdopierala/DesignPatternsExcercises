package pl.dopierala.Behavioral.DP_Memento;

public abstract class AbstractWorkflowCommand implements WorkflowCommand {

    protected WorkflowDesigner.Memento memento;
    protected WorkflowDesigner receiver;

    public AbstractWorkflowCommand(WorkflowDesigner designer){
        this.receiver=designer;
    }

    @Override
    public void undo() {
        receiver.setMemento(memento);
    }
}
