package pl.dopierala.Behavioral.DP_Interpreter;
public class Report {
    private String name;
    private String permission;

    public Report(String name, String permission) {
        this.name = name;

        // "NOT ADMIN", "FINANCE_USER AND ADMIN" - takie wartosci moze przyjmowac
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public String getPermission() {
        return permission;
    }
}
