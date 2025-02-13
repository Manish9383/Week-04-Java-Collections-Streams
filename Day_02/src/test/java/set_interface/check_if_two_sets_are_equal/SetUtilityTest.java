package set_interface.check_if_two_sets_are_equal;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;

class SetUtilityTest {

    @Test
    void testSetsAreEqual() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        boolean result = SetUtility.areSetsEqual(set1, set2);

        System.out.println("Test 1 - Expected: true, Got: " + result);
        assertTrue(result);
    }

    @Test
    void testSetsAreNotEqual() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);

        boolean result = SetUtility.areSetsEqual(set1, set2);

        System.out.println("Test 2 - Expected: false, Got: " + result);
        assertFalse(result);
    }

    @Test
    void testEmptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        boolean result = SetUtility.areSetsEqual(set1, set2);

        System.out.println("Test 3 - Expected: true, Got: " + result);
        assertTrue(result);
    }

    @Test
    void testSetWithDifferentSizes() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);

        boolean result = SetUtility.areSetsEqual(set1, set2);

        System.out.println("Test 4 - Expected: false, Got: " + result);
        assertFalse(result);
    }

    @Test
    void testSetWithNull() {
        Set<Integer> set1 = null;
        Set<Integer> set2 = new HashSet<>();
        set2.add(1);

        boolean result = SetUtility.areSetsEqual(set1, set2);

        System.out.println("Test 5 - Expected: false, Got: " + result);
        assertFalse(result);
    }

}
