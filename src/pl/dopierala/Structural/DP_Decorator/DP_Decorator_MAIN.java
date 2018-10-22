import java.io.*;

public class DP_Decorator_MAIN {
    public static void main(String[] args) throws IOException {
        Message msg = new TextMessage("Hello decorator");

        Message msgHtml = new HtmlEncodedMessage(msg);
        Message msgUpper = new ToUpperncodedMessage(msgHtml);

        System.out.println(msg.getContent());
        System.out.println(msgHtml.getContent());
        System.out.println(msgUpper.getContent());

        System.out.println("-----------------------");

    }
}
