package ClassAdapter;

public class BusinessCardDesigner {
    public String designCard(Customer c){
        return "Wizytowka: "+ c.getDesignation()+" "+c.getName()+" "+c.getAddress();
    }
}
