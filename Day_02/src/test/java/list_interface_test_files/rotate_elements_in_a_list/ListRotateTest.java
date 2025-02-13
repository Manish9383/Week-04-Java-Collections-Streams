package list_interface_test_files.rotate_elements_in_a_list;

import list_interface.rotate_elements_in_a_list.ListRotate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

class ListRotateTest {

    @Test
    void testRotateListWithValidPositions() {
        ListRotate rotator = new ListRotate();
        List<Integer> inputList = Arrays.asList(10, 20, 30, 40, 50);
        int positions = 2;

        List<Integer> expected = Arrays.asList(30, 40, 50, 10, 20);
        List<Integer> result = rotator.rotateList(inputList, positions);

        System.out.println("Test 1 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }

    @Test
    void testRotateListWithZeroPositions() {
        ListRotate rotator = new ListRotate();
        List<Integer> inputList = Arrays.asList(10, 20, 30, 40, 50);
        int positions = 0;

        List<Integer> expected = Arrays.asList(10, 20, 30, 40, 50); // No change
        List<Integer> result = rotator.rotateList(inputList, positions);

        System.out.println("Test 2 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }

    @Test
    void testRotateListWithNegativePositions() {
        ListRotate rotator = new ListRotate();
        List<Integer> inputList = Arrays.asList(10, 20, 30, 40, 50);
        int positions = -2;

        List<Integer> expected = Arrays.asList(40, 50, 10, 20, 30);
        List<Integer> result = rotator.rotateList(inputList, positions);

        System.out.println("Test 3 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }

    @Test
    void testRotateListWithSingleElement() {
        ListRotate rotator = new ListRotate();
        List<Integer> inputList = Arrays.asList(10);
        int positions = 2;

        List<Integer> expected = Arrays.asList(10);
        List<Integer> result = rotator.rotateList(inputList, positions);

        System.out.println("Test 4 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }

    @Test
    void testRotateListWithMorePositionsThanSize() {
        ListRotate rotator = new ListRotate();
        List<Integer> inputList = Arrays.asList(10, 20, 30, 40, 50);
        int positions = 7;

        List<Integer> expected = Arrays.asList(30, 40, 50, 10, 20);
        List<Integer> result = rotator.rotateList(inputList, positions);

        System.out.println("Test 5 - Expected: " + expected + ", Got: " + result);
        assertEquals(expected, result);
    }

}
