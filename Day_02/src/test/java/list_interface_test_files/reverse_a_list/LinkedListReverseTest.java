package list_interface_test_files.reverse_a_list;

import list_interface.reverse_a_list.LinkedListReverse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class LinkedListReverseTest {

    private LinkedListReverse linkedListReverser;

    @BeforeEach
    void setUp() {
        linkedListReverser = new LinkedListReverse();
    }

    @Test
    void testReverseLinkedList() {
        LinkedList<Integer> original = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(5, 4, 3, 2, 1));

        LinkedList<Integer> result = linkedListReverser.reverseLinkedList(original);

        assertEquals(expected, result, "The LinkedList was not reversed correctly.");
    }

    @Test
    void testReverseEmptyLinkedList() {
        LinkedList<Integer> original = new LinkedList<>();
        LinkedList<Integer> result = linkedListReverser.reverseLinkedList(original);

        assertTrue(result.isEmpty(), "Reversing an empty LinkedList should result in an empty list.");
    }
}
