import java.time.LocalDate;

public class Main_DP_CoR {
    public static void main(String[] args) {
        LeaveApplication application = LeaveApplication.getBuilder()
                .withType(LeaveApplication.LeaveType.PTO)
                .starts(LocalDate.now())
                .ends(LocalDate.now().plusDays(10))
                .build();

        System.out.println(application);
        System.out.println("**********************");
        LeaveApprover approver = createChain();
        approver.processLeaveApplication(application);

        System.out.println(application);
    }

    private static LeaveApprover createChain() {
        EmpDirector director = new EmpDirector(null);
        EmpManager manager = new EmpManager(director);
        EmpLead lead = new EmpLead(manager);
        return lead;
    }
}
