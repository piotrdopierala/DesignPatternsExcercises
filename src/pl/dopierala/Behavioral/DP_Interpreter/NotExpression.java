package pl.dopierala.Behavioral.DP_Interpreter;

public class NotExpression implements PermissionExpression {

    private PermissionExpression exp1;

    public NotExpression(PermissionExpression exp1) {
        this.exp1 = exp1;
    }

    @Override
    public boolean interpret(User usr) {
        return !exp1.interpret(usr);
    }

    @Override
    public String toString() {
        return "NOT " + exp1;
    }
}
