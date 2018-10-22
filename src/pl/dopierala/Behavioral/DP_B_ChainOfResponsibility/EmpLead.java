import java.time.Duration;

public class EmpLead extends Employee {

    public EmpLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        if(application.getType()==LeaveApplication.LeaveType.SICK && application.getNoOfDays()<=2){
            application.approve(getApproverRole());
            return true;
        }
        return false;
    }
}
