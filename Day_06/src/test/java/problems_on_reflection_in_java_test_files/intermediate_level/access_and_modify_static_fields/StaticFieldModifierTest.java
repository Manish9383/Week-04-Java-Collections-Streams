package problems_on_reflection_in_java_test_files.intermediate_level.access_and_modify_static_fields;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_reflection_in_java.intermediate_level.access_and_modify_static_fields.Configuration;
import problems_on_reflection_in_java.intermediate_level.access_and_modify_static_fields.StaticFieldModifier;

class StaticFieldModifierTest {

    @Test
    void testModifyApiKey() {
        StaticFieldModifier.modifyApiKey("TEST_KEY");
        assertEquals("TEST_KEY", Configuration.getApiKey());
    }
}
