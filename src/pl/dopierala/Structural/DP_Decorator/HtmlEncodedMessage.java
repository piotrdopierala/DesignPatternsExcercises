public class HtmlEncodedMessage implements Message {
    private Message obj;

    public HtmlEncodedMessage(Message obj) {
        this.obj = obj;
    }

    @Override
    public String getContent(){
        return "<html>"+obj.getContent()+"</html>";
    }
}
