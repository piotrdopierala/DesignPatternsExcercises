package pl.dopierala.Behavioral.DP_Memento;

import java.util.LinkedList;

public class Main_DP_Memento {
    public static void main(String[] args) {

        WorkflowDesigner designer = new WorkflowDesigner();
        designer.createWorkflow("Test");

        LinkedList<WorkflowCommand> commands = runCommands(designer);

        designer.print();

        undoLastCommand(commands);
        designer.print();

        undoLastCommand(commands);
        designer.print();

    }

    private static void undoLastCommand(LinkedList<WorkflowCommand> commands){
        if(!commands.isEmpty())
            commands.removeLast().undo();
    }


    private static LinkedList<WorkflowCommand> runCommands(WorkflowDesigner designer) {
        LinkedList<WorkflowCommand> commands = new LinkedList<>();
        WorkflowCommand cmd = new AddCommand(designer,"Create application");
        commands.addLast(cmd);
        cmd.execute();

        cmd=new AddCommand(designer,"Submit application");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddCommand(designer,"Application approved");
        commands.addLast(cmd);
        cmd.execute();

        return commands;
    }
}
