package pl.dopierala.Behavioral.DP_Visitor;

import java.util.Collection;

public interface Employee {
    int getPerformanceRating();
    void setPerformacneRating(int rating);
    Collection<Employee> getDirectReports();
    int getEmployeeId();

}
