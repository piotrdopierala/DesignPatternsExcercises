package pl.dopierala.Behavioral.DP_Interpreter;

import java.util.*;

public class ExpressionBuilder {

    private Stack<PermissionExpression> permissions = new Stack<>();
    private Stack<String> operators = new Stack<>();


    public PermissionExpression build(Report rep) {
        parse(rep.getPermission().toLowerCase());
        buildExpressions();
        if(permissions.size()>1 || !operators.isEmpty()){
            System.out.println("ERROR!");
        }
        return permissions.pop();
    }

    /**
     * Populating stack elements from raw permission representation int form of a String.
     *
     * @param permission persmission String to interpret
     */
    private void parse(String permission) {
        StringTokenizer tokenizer = new StringTokenizer(permission);
        while (tokenizer.hasMoreTokens()) {
            String token;
            switch (token = tokenizer.nextToken()) {
                case "and":
                    operators.push("and");
                    break;
                case "or":
                    operators.push("or");
                    break;
                case "not":
                    operators.push("not");
                    break;
                default:
                    permissions.push(new Permission(token));
                    break;
            }
        }
    }


    private void buildExpressions() {
        while (!operators.isEmpty()) {
            String operator = operators.pop(); //get next operator
            PermissionExpression permExp1;
            PermissionExpression permExp2;
            PermissionExpression exp;
            switch (operator) {
                case "and":
                    permExp2=permissions.pop();
                    permExp1=permissions.pop();
                    exp = new AndExpression(permExp1,permExp2);
                    break;
                case "or":
                    permExp2=permissions.pop();
                    permExp1=permissions.pop();
                    exp = new OrExpression(permExp1,permExp2);
                    break;
                case "not":
                    permExp1=permissions.pop();
                    exp = new NotExpression(permExp1);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operator:"+operator);
            }
            permissions.push(exp);
        }
    }
}
