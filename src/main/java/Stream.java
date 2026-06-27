import java.util.ArrayList;
import java.util.List;



public class Stream  {

    static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("Karan", 200000, List.of("Project 1", "Project 2")));
        employees.add(new Employee("Kanishk", 300000, List.of("Project 4", "Project 5")));
        employees.add(new Employee("Rohan", 400000, List.of("Project 9", "Project 6")));
    }


}
