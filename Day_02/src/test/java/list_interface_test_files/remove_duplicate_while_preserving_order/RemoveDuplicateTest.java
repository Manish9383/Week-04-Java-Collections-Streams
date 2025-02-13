package list_interface_test_files.remove_duplicate_while_preserving_order;

import list_interface.remove_duplicate_while_preserving_order.RemoveDuplicate;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateTest {

    @Test
    void testWithDuplicates() {
        RemoveDuplicate remover = new RemoveDuplicate();
        List<Integer> inputList = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> expected = Arrays.asList(3, 1, 2, 4);

        List<Integer> result = remover.removeDupli(inputList);

        System.out.println("Test 1 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }

    @Test
    void testWithoutDuplicates() {
        RemoveDuplicate remover = new RemoveDuplicate();
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = remover.removeDupli(inputList);

        System.out.println("Test 2 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }

    @Test
    void testAllDuplicates() {
        RemoveDuplicate remover = new RemoveDuplicate();
        List<Integer> inputList = Arrays.asList(5, 5, 5, 5, 5);
        List<Integer> expected = Arrays.asList(5);

        List<Integer> result = remover.removeDupli(inputList);

        System.out.println("Test 3 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }

    @Test
    void testEmptyList() {
        RemoveDuplicate remover = new RemoveDuplicate();
        List<Integer> inputList = Arrays.asList();
        List<Integer> expected = Arrays.asList();

        List<Integer> result = remover.removeDupli(inputList);

        System.out.println("Test 4 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }

    @Test
    void testWithNegativeNumbers() {
        RemoveDuplicate remover = new RemoveDuplicate();
        List<Integer> inputList = Arrays.asList(-1, -2, -1, -3, -2, -4);
        List<Integer> expected = Arrays.asList(-1, -2, -3, -4);

        List<Integer> result = remover.removeDupli(inputList);

        System.out.println("Test 5 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }
}
