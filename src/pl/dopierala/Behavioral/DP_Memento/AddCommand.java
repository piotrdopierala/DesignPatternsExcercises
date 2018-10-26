package pl.dopierala.Behavioral.DP_Memento;

public class AddCommand extends AbstractWorkflowCommand {

    private String step;

    public AddCommand(WorkflowDesigner designer,String step){
        super(designer);
        this.step=step;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();
        receiver.addStep(step);
    }
}
