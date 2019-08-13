package CreationalPatterns.PrototypePattern;

public class Employee implements Prototype {
    private int id;
    private String name;
    private String designation;


    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;

    }

    public void showDetails() {
        System.out.println(this.toString());
    }

    public Prototype getClone() {
        return new Employee(id, name, designation);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
