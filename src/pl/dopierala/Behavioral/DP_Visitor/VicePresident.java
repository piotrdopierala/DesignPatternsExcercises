package pl.dopierala.Behavioral.DP_Visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class VicePresident extends AbstractEmployee {
    List<Employee> directReports = new ArrayList<>();

    public VicePresident(String name, Employee... employees) {
        super(name);
        Arrays.stream(employees).forEach(e->directReports.add(e));
    }

    @Override
    public Collection<Employee> getDirectReports() {
        return directReports;
    }
}
