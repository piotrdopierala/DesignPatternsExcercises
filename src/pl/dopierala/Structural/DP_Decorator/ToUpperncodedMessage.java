public class ToUpperncodedMessage implements Message {
    private Message obj;

    public ToUpperncodedMessage(Message obj) {
        this.obj = obj;
    }

    @Override
    public String getContent(){
        return obj.getContent().toUpperCase();
    }
}
