import java.util.List;

public class Employee {

    String name;
    double salary;
    List<String> project;


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", project=" + project +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getProject() {
        return project;
    }

    public void setProject(List<String> project) {
        this.project = project;
    }

    public Employee(String name, double salary, List<String> project) {
        this.name = name;
        this.salary = salary;
        this.project = project;
    }

    public Employee() {
    }
}
