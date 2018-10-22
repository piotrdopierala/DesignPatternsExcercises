package pl.dopierala.Behavioral.DP_Interpreter;

import java.util.Queue;

//terminal expression
public class Permission implements PermissionExpression {

    private String permission;

    public Permission(String permission) {
        this.permission = permission.toLowerCase();
    }


    @Override
    public boolean interpret(User usr) {
        return usr.getPermissions().contains(permission);
    }

    @Override
    public String toString() {
        return permission;
    }
}
