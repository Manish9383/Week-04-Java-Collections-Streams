package set_interface.symmetric_difference;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

class SetOperationsTestt {

    @Test
    void testSymmetricDifference() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        SetOperations operations = new SetOperations();
        Set<Integer> result = operations.symmetricDifference(set1, set2);

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 4, 5));
        System.out.println("Test 1 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }

    @Test
    void testSymmetricDifferenceWithEmptySet() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>();

        SetOperations operations = new SetOperations();
        Set<Integer> result = operations.symmetricDifference(set1, set2);

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3));
        System.out.println("Test 2 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }

    @Test
    void testSymmetricDifferenceWithNoCommonElements() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6));

        SetOperations operations = new SetOperations();
        Set<Integer> result = operations.symmetricDifference(set1, set2);

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("Test 3 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }

    @Test
    void testSymmetricDifferenceWithIdenticalSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));

        SetOperations operations = new SetOperations();
        Set<Integer> result = operations.symmetricDifference(set1, set2);

        Set<Integer> expected = new HashSet<>();
        System.out.println("Test 4 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);  // Identical sets should return an empty set
    }

    @Test
    void testSymmetricDifferenceWithOneElement() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2));

        SetOperations operations = new SetOperations();
        Set<Integer> result = operations.symmetricDifference(set1, set2);

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2));
        System.out.println("Test 5 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }
}

