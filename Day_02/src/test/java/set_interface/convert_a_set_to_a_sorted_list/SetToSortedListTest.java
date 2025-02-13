package set_interface.convert_a_set_to_a_sorted_list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

class SetToSortedListTest {

    @Test
    void testConvertToSortedList() {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        SetToSortedList converter = new SetToSortedList();
        List<Integer> sortedList = converter.convertToSortedList(set);

        System.out.println("Test 1 - Expected: [1, 3, 5, 9], Got: " + sortedList);
        assertEquals(Arrays.asList(1, 3, 5, 9), sortedList);
    }

    @Test
    void testConvertToSortedListWithDuplicates() {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 5, 3, 9, 1, 1));

        SetToSortedList converter = new SetToSortedList();
        List<Integer> sortedList = converter.convertToSortedList(set);

        System.out.println("Test 2 - Expected: [1, 3, 5, 9], Got: " + sortedList);
        assertEquals(Arrays.asList(1, 3, 5, 9), sortedList);  // Set automatically removes duplicates
    }

    @Test
    void testConvertToSortedListWithSingleElement() {
        Set<Integer> set = new HashSet<>(Arrays.asList(10));

        SetToSortedList converter = new SetToSortedList();
        List<Integer> sortedList = converter.convertToSortedList(set);

        System.out.println("Test 3 - Expected: [10], Got: " + sortedList);
        assertEquals(Arrays.asList(10), sortedList);
    }

    @Test
    void testConvertToSortedListWithEmptySet() {
        Set<Integer> set = new HashSet<>();

        SetToSortedList converter = new SetToSortedList();
        List<Integer> sortedList = converter.convertToSortedList(set);

        System.out.println("Test 4 - Expected: [], Got: " + sortedList);
        assertEquals(Arrays.asList(), sortedList);
    }

    @Test
    void testConvertToSortedListWithNegativeNumbers() {
        Set<Integer> set = new HashSet<>(Arrays.asList(-5, -3, -9, -1));

        SetToSortedList converter = new SetToSortedList();
        List<Integer> sortedList = converter.convertToSortedList(set);

        System.out.println("Test 5 - Expected: [-9, -5, -3, -1], Got: " + sortedList);
        assertEquals(Arrays.asList(-9, -5, -3, -1), sortedList);
    }
}
