package pl.dopierala.Behavioral.DP_Memento;

public class Main_DP_Memento {
    public static void main(String[] args) {
        WorkflowDesigner wd1 = new WorkflowDesigner();
        AddCommand cmdAdd = new AddCommand();

        cmdAdd.execute(wd1,"cmd1");
        cmdAdd.execute(wd1,"cmd2");
        cmdAdd.execute(wd1,"cmd3");
        cmdAdd.execute(wd1,"cmd4");

        cmdAdd.undo(wd1);
        cmdAdd.undo(wd1);

        cmdAdd.execute(wd1,"cmd5");


    }
}
