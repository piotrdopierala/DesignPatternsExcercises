package pl.dopierala.Behavioral.DP_Interpreter;

public class OrExpression implements PermissionExpression {

    private PermissionExpression exp1;
    private PermissionExpression exp2;

    public OrExpression(PermissionExpression exp1, PermissionExpression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(User usr) {
        return exp1.interpret(usr) || exp2.interpret(usr);
    }

    @Override
    public String toString() {
        return exp1+" OR "+ exp2;
    }
}
