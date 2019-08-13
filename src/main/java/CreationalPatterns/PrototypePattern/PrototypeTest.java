package CreationalPatterns.PrototypePattern;

//Prototype creates objects by cloning an existing object.

public class PrototypeTest {
    public static void main(String args[]) {
        Employee employee = new Employee(1,"Rabbir", "Software Eng");
        employee.showDetails();
    }
}
