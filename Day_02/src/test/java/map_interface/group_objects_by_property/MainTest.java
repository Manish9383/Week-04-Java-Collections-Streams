package map_interface.group_objects_by_property;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private List<Employee> employees;
    private Department hr;
    private Department it;

    @BeforeEach
    void setUp() {
        hr = new Department("HR");
        it = new Department("IT");

        employees = Arrays.asList(
                new Employee("Alice", hr),
                new Employee("Bob", it),
                new Employee("Carol", hr)
        );
    }

    @Test
    void testGroupByDepartment() {
        System.out.println("Testing grouping employees by department...");

        Map<Department, List<Employee>> groupedByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));


        List<Employee> hrEmployees = Arrays.asList(new Employee("Alice", hr), new Employee("Carol", hr));
        List<Employee> itEmployees = Arrays.asList(new Employee("Bob", it));

        assertIterableEquals(hrEmployees, groupedByDepartment.get(hr), "HR department employees are not grouped correctly.");
        assertIterableEquals(itEmployees, groupedByDepartment.get(it), "IT department employees are not grouped correctly.");

        System.out.println("Grouped by department: " + groupedByDepartment);
    }

    @Test
    void testEmptyEmployeeList() {
        System.out.println("Testing empty employee list...");

        List<Employee> emptyList = new ArrayList<>();
        Map<Department, List<Employee>> groupedByDepartment = emptyList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        assertTrue(groupedByDepartment.isEmpty(), "The grouped map should be empty when the employee list is empty.");

        System.out.println("Grouped by department: " + groupedByDepartment);
    }

    @Test
    void testSingleDepartment() {
        System.out.println("Testing single department with multiple employees...");

        List<Employee> singleDeptEmployees = Arrays.asList(new Employee("Alice", hr), new Employee("Bob", hr));

        Map<Department, List<Employee>> groupedByDepartment = singleDeptEmployees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        assertEquals(2, groupedByDepartment.get(hr).size(), "There should be two employees in the HR department.");
        System.out.println("Grouped by department: " + groupedByDepartment);
    }
}
