package ClassAdapter;

public class EmployeeObjectAdapter implements Customer{
    private Employee empAdaptee;

    public EmployeeObjectAdapter(Employee empAdaptee) {
        this.empAdaptee = empAdaptee;
    }

    @Override
    public String getName() {
        return empAdaptee.getFullName();
    }

    @Override
    public String getDesignation() {
        return empAdaptee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return empAdaptee.getOfficeLocation();
    }
}
