package pl.dopierala.Behavioral.DP_Visitor;

import java.util.Collection;
import java.util.Collections;

public abstract class AbstractEmployee implements Employee{

    private int performanceRaiting;
    private String name;
    private static int employeeIdCounter=101;
    private int employeeId;

    public AbstractEmployee(String name) {
        this.name = name;
        employeeId=employeeIdCounter++;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getPerformanceRating() {
        return performanceRaiting;
    }

    @Override
    public void setPerformacneRating(int rating) {
        this.performanceRaiting=rating;
    }

    @Override
    public Collection<Employee> getDirectReports() {
        return Collections.emptyList();
    }

    @Override
    public int getEmployeeId() {
        return employeeId;
    }
}
