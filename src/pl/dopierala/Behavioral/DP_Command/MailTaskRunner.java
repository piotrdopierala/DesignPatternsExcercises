import java.util.LinkedList;
import java.util.List;

public class MailTaskRunner implements Runnable {

    private Thread runner;
    private final List<Command> pendingCommands;
    private volatile boolean stop;
    private static final MailTaskRunner RUNNER = new MailTaskRunner();

    public static MailTaskRunner getInstance(){
        return RUNNER;
    }

    private MailTaskRunner() {
        pendingCommands = new LinkedList<Command>();
        runner = new Thread(this);
        runner.start();
    }

    public void submit(Command cmd){

    }

    @Override
    public void run() {
        while(true){
            Command cmd = null;
            synchronized (pendingCommands){
                if(pendingCommands.isEmpty()){
                    try{
                        pendingCommands.wait();
                    }catch (InterruptedException e){
                        System.out.println("Runner interrupted");
                        if(stop){
                            System.out.println("Runner stopping");
                        }
                    }
                }else{
                    cmd=pendingCommands.remove(0);
                }
            }
            if(cmd==null)
                return;
            cmd.execute();
        }
    }

    public void addCommand(Command cmd){
        synchronized (pendingCommands){
            pendingCommands.add(cmd);
            pendingCommands.notifyAll();
        }
    }

    public void shutdown(){
        stop=true;
        this.runner.interrupt();
    }


}
