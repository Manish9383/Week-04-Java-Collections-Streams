package list_interface_test_files.find_the_nth_element_from_the_end;

import list_interface.find_the_nth_element_from_the_end.LinkedListt;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

public class SetHelperTest {

    @Test
    public void testFindNthFromEnd_ValidN() {
        LinkedListt helper = new LinkedListt();

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        assertEquals("D", helper.findNthFromEnd(list, 2), "The 2nd element from the end should be 'D'");
        assertEquals("B", helper.findNthFromEnd(list, 4), "The 4th element from the end should be 'B'");
        assertEquals("E", helper.findNthFromEnd(list, 1), "The last element should be 'E'");
    }

    @Test
    public void testFindNthFromEnd_NGreaterThanSize() {
        LinkedListt helper = new LinkedListt();

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");

        assertEquals("N is greater than the size of the list", helper.findNthFromEnd(list, 3), "Should return an error message");
    }

    @Test
    public void testFindNthFromEnd_EmptyList() {
        LinkedListt helper = new LinkedListt();

        LinkedList<String> list = new LinkedList<>();

        assertEquals("N is greater than the size of the list", helper.findNthFromEnd(list, 1), "Should return an error message for empty list");
    }
}
