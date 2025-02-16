package problems_on_annotations_in_java_test_files.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_custom_caching_system_with_cacheresult;
import org.junit.jupiter.api.Test;
import problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_custom_caching_system_with_cacheresult.ExpensiveComputationImpl;

import static org.junit.jupiter.api.Assertions.*;

public class ExpensiveComputationTest {
    @Test
    public void testCaching() {
        ExpensiveComputationImpl computation = new ExpensiveComputationImpl();

        int result1 = computation.compute(4);
        int result2 = computation.compute(4);

        assertEquals(result1, result2, "Cache should return the same result for the same input");
    }
}
