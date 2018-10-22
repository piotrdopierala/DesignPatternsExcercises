package pl.dopierala.Behavioral.DP_Interpreter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class User {
    private List<String> permissions;
    private String userName;

    public User(String userName, String...  permissions) {
        this.userName = userName;
        this.permissions = new ArrayList();
        Stream.of(permissions).forEach(p->this.permissions.add(p.toLowerCase()));
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public String getUserName() {
        return userName;
    }
}
