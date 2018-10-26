package pl.dopierala.Behavioral.DP_Memento;

public interface WorkflowCommand {
    public void execute();
    public void undo();
}
