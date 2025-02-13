package serialization_save_and_retrieve_an_object;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/resources/employees.ser";

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Rajeev", "HR", 100000));
        employees.add(new Employee(102, "Manish", "IT", 85000));
        employees.add(new Employee(103, "kamlesh", "Finance", 90000));

        EmployeeManager.saveEmployees(employees, filePath);

        List<Employee> loadedEmployees = EmployeeManager.loadEmployees(filePath);

        System.out.println("\nRetrieved Employees:");
        if (loadedEmployees != null) {
            loadedEmployees.forEach(System.out::println);
        }
    }
}
