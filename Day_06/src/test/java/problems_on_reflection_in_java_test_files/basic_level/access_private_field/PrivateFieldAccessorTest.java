package problems_on_reflection_in_java_test_files.basic_level.access_private_field;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_reflection_in_java.basic_level.access_private_field.Person;
import problems_on_reflection_in_java.basic_level.access_private_field.PrivateFieldAccessor;

class PrivateFieldAccessorTest {

    @Test
    void testModifyAge() {
        Person person = new Person(25);

        // Modify age using Reflection
        PrivateFieldAccessor.modifyAge(person, 40);

        // Verify updated age
        assertEquals(40, PrivateFieldAccessor.getAge(person));
    }

    @Test
    void testGetAge() {
        Person person = new Person(18);

        // Verify retrieved age
        assertEquals(18, PrivateFieldAccessor.getAge(person));
    }
}
