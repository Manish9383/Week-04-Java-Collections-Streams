package set_interface.union_and_intersection_of_two_sets;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

class SetOperationsTest {

    @Test
    void testUnion() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        SetOperations operations = new SetOperations();
        Set<Integer> result = operations.union(set1, set2);

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Test 1 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }

    @Test
    void testIntersection() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        SetOperations operations = new SetOperations();
        Set<Integer> result = operations.intersection(set1, set2);

        Set<Integer> expected = new HashSet<>(Arrays.asList(3));
        System.out.println("Test 2 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }

    @Test
    void testUnionWithEmptySet() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>();

        SetOperations operations = new SetOperations();
        Set<Integer> result = operations.union(set1, set2);

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3));
        System.out.println("Test 3 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }

    @Test
    void testIntersectionWithEmptySet() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>();

        SetOperations operations = new SetOperations();
        Set<Integer> result = operations.intersection(set1, set2);

        Set<Integer> expected = new HashSet<>();
        System.out.println("Test 4 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }

    @Test
    void testUnionWithIdenticalSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));

        SetOperations operations = new SetOperations();
        Set<Integer> result = operations.union(set1, set2);

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3));
        System.out.println("Test 5 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);  // Union of identical sets should return the same set
    }

    @Test
    void testIntersectionWithIdenticalSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));

        SetOperations operations = new SetOperations();
        Set<Integer> result = operations.intersection(set1, set2);

        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3));
        System.out.println("Test 6 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);  // Intersection of identical sets should return the same set
    }
}
