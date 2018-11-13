package pl.dopierala.Behavioral.DP_Visitor;

public class Main_DP_Visitor {
    public static void main(String[] args) {
        Employee emps = buildOrganistation();
        Visitor visitor = new PrintVisitor();
        visitOrgStructure(emps,visitor);
    }

    private static Employee buildOrganistation(){
        Programmer p1 = new Programmer("Piotrek","Java");
        Programmer p2 = new Programmer("Michal","Gosu");

        Programmer p3 = new Programmer("Dorian","JavaScript");
        Programmer p4 = new Programmer("Adam","Ladder");

        ProjectLead pl1 = new ProjectLead("Anna",p1,p2);
        ProjectLead pl2 = new ProjectLead("Joey",p3,p4);

        Manager m1 = new Manager("Blazej",pl1);
        Manager m2 = new Manager("Marcin",pl2);

        VicePresident vp = new VicePresident("Bill",pl1,pl2);

        return vp;
    }

    private static void visitOrgStructure(Employee emp, Visitor visitor){
        emp.accept(visitor);
        emp.getDirectReports().forEach(e->visitOrgStructure(e,visitor));
    }
}
