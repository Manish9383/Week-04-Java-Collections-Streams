package serialization_save_and_retrieve_an_object;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagerTest {
    private static final String TEST_FILE = "test_employees.ser";
    private List<Employee> testEmployees;

    @BeforeEach
    void setUp() {
        testEmployees = new ArrayList<>();
        testEmployees.add(new Employee(201, "Raj", "Marketing", 72000));
        testEmployees.add(new Employee(202, "Kamlesh", "Sales", 69000));
    }

    @AfterEach
    void tearDown() {
        new File(TEST_FILE).delete();
    }

    @Test
    void testSaveAndLoadEmployees() {
        EmployeeManager.saveEmployees(testEmployees, TEST_FILE);

        List<Employee> loadedEmployees = EmployeeManager.loadEmployees(TEST_FILE);

        assertNotNull(loadedEmployees, "Loaded employee list should not be null");
        assertEquals(testEmployees.size(), loadedEmployees.size(), "Employee count should match");
        assertEquals(testEmployees.get(0).toString(), loadedEmployees.get(0).toString(), "First employee should match");
        assertEquals(testEmployees.get(1).toString(), loadedEmployees.get(1).toString(), "Second employee should match");
    }

}
