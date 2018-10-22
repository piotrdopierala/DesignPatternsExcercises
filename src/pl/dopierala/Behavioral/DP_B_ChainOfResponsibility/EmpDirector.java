public class EmpDirector extends Employee {

    public EmpDirector(LeaveApprover successor) {
        super("Director", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        if (application.getType() == LeaveApplication.LeaveType.PTO) {
            application.approve(getApproverRole());
            return true;
        }

        return false;
    }
}

