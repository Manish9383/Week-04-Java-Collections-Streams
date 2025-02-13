package set_interface.find_subsets;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class SetOperationsTest {

    @Test
    void testSet1IsSubsetOfSet2() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        SetOperations operations = new SetOperations();
        boolean result = operations.isSubset(set1, set2);

        System.out.println("Test 1 - Expected: true, Got: " + result);
        assertTrue(result);
    }

    @Test
    void testSet1IsNotSubsetOfSet2() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        SetOperations operations = new SetOperations();
        boolean result = operations.isSubset(set1, set2);

        System.out.println("Test 2 - Expected: false, Got: " + result);
        assertFalse(result);
    }

    @Test
    void testSet1IsEqualToSet2() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        SetOperations operations = new SetOperations();
        boolean result = operations.isSubset(set1, set2);

        System.out.println("Test 3 - Expected: true, Got: " + result);
        assertTrue(result);
    }

    @Test
    void testSet1IsEmpty() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        SetOperations operations = new SetOperations();
        boolean result = operations.isSubset(set1, set2);

        System.out.println("Test 4 - Expected: true, Got: " + result);
        assertTrue(result);  // An empty set is always a subset
    }

    @Test
    void testSet2IsEmpty() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1));
        Set<Integer> set2 = new HashSet<>();

        SetOperations operations = new SetOperations();
        boolean result = operations.isSubset(set1, set2);

        System.out.println("Test 5 - Expected: false, Got: " + result);
        assertFalse(result);  // A non-empty set cannot be a subset of an empty set
    }
}
