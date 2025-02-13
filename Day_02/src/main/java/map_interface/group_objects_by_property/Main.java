package map_interface.group_objects_by_property;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Department hr = new Department("HR");
        Department it = new Department("IT");

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", hr),
                new Employee("Bob", it),
                new Employee("Carol", hr)
        );

        Map<Department, List<Employee>> groupedByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Employees: [Alice (HR), Bob (IT), Carol (HR)]");
        groupedByDepartment.forEach((department, empList) -> {
            System.out.print(department + ": ");
            System.out.println(empList);
        });
    }
}