package data_streams_store_and_retrieve_primitive_data;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class StudentDataHandlerTest {
    private static final String TEST_FILE = "src/main/resources/test_student_data.bin";
    private Student testStudent;

    @BeforeEach
    void setUp() {
        testStudent = new Student(101, "Alice Johnson", 8.5);
        StudentDataHandler.storeStudentData(TEST_FILE, testStudent);
    }

    @AfterEach
    void tearDown() {
        new File(TEST_FILE).delete();
    }

    @Test
    void testStoreAndRetrieveStudentData() {
        Student retrievedStudent = StudentDataHandler.retrieveStudentData(TEST_FILE);

        assertNotNull(retrievedStudent, "Retrieved student should not be null.");
        assertEquals(testStudent.getRollNumber(), retrievedStudent.getRollNumber(), "Roll number should match.");
        assertEquals(testStudent.getName(), retrievedStudent.getName(), "Name should match.");
        assertEquals(testStudent.getGpa(), retrievedStudent.getGpa(), "GPA should match.");
    }
}
