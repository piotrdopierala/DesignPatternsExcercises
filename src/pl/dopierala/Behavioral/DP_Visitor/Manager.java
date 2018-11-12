package pl.dopierala.Behavioral.DP_Visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Manager extends AbstractEmployee {
    private List<Employee> directReports = new ArrayList<>();

    public Manager(String name, Employee... employees) {
        super(name);
        Arrays.stream(employees).forEach(e->directReports.add(e));
    }

    @Override
    public Collection<Employee> getDirectReports() {
        return directReports;
    }
}
