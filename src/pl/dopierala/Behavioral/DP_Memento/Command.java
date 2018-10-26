package pl.dopierala.Behavioral.DP_Memento;

public interface Command {
    public void execute(WorkflowDesigner wd,String command);
    public void undo(WorkflowDesigner wd);
}
