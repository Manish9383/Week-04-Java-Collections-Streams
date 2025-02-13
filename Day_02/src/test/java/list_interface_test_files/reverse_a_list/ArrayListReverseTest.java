package list_interface_test_files.reverse_a_list;

import list_interface.reverse_a_list.ArrayListReverse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class ArrayListReverseTest {

    private ArrayListReverse arrayListReverser;

    @BeforeEach
    void setUp() {
        arrayListReverser = new ArrayListReverse();
    }

    @Test
    void testReverseArrayList() {
        ArrayList<Integer> original = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));

        ArrayList<Integer> result = arrayListReverser.reverseArrayList(original);

        assertEquals(expected, result, "The ArrayList was not reversed correctly.");
    }

    @Test
    void testReverseEmptyArrayList() {
        ArrayList<Integer> original = new ArrayList<>();
        ArrayList<Integer> result = arrayListReverser.reverseArrayList(original);

        assertTrue(result.isEmpty(), "Reversing an empty ArrayList should result in an empty list.");
    }
}
