package ClassAdapter;

import java.util.stream.IntStream;

public class MainCardDesigner {
    public static void main(String[] args) {

        //Using class Two-way adapter
        BusinessCardDesigner bcDesigner = new BusinessCardDesigner();
        EmployeeClassAdapter empAdapter = new EmployeeClassAdapter();

        populateEmployeeData(empAdapter);

        String card = bcDesigner.designCard(empAdapter);
        System.out.println(card);

        System.out.println("****************************");
        //Using Object Adapter
        Employee emp = new Employee();
        populateEmployeeData(emp);
        EmployeeObjectAdapter empObjAdapter = new EmployeeObjectAdapter(emp);
        card = bcDesigner.designCard(empObjAdapter);
        System.out.println(card);
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Piotr Dopierala");
        employee.setJobTitle("Senior JAVA Developer");
        employee.setOfficeLocation("Allegro main headquarters");
    }
}
