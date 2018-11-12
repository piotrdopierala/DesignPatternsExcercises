package pl.dopierala.Behavioral.DP_Visitor;

public class Programmer extends AbstractEmployee {
    private String skill;

    public Programmer(String name, String skill) {
        super(name);
        this.skill=skill;
    }

    public String getSkill() {
        return skill;
    }
}
