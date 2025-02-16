package problems_on_reflection_in_java_test_files.basic_level.dynamically_create_objects;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_reflection_in_java.basic_level.dynamically_create_objects.ObjectCreator;
import problems_on_reflection_in_java.basic_level.dynamically_create_objects.Student;

class ObjectCreatorTest {

    @Test
    void testCreateStudentInstance() {
        Student student = ObjectCreator.createStudentInstance("John", 20);

        assertNotNull(student);
    }
}
