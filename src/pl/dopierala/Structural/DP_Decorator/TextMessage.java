package pl.dopierala.Structural.DP_Decorator;
public class TextMessage implements Message {

    private String msg;

    public TextMessage(String msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return msg;
    }

    public void sayHello(){
        System.out.println("HELLO");
    }
}
