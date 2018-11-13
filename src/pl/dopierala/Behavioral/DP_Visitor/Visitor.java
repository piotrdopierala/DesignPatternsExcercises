package pl.dopierala.Behavioral.DP_Visitor;

public interface Visitor {
    void visit(Programmer programmer);
    void visit(ProjectLead lead);
    void visit(Manager manager);
    void visit(VicePresident vp);
}
