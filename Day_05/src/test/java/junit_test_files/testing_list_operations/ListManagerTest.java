package junit_test_files.testing_list_operations;


import static org.junit.jupiter.api.Assertions.*;

import junit.testing_list_operations.ListManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ListManagerTest {

    private List<Integer> testList;

    @BeforeEach
    void setUp() {
        testList = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        ListManager.addElement(testList, 10);
        assertEquals(1, testList.size());
        assertTrue(testList.contains(10));
    }

    @Test
    void testRemoveElement() {
        ListManager.addElement(testList, 20);
        ListManager.addElement(testList, 30);
        assertTrue(ListManager.removeElement(testList, 20));
        assertFalse(testList.contains(20));
    }

    @Test
    void testRemoveNonExistentElement() {
        ListManager.addElement(testList, 40);
        assertFalse(ListManager.removeElement(testList, 50)); // Element 50 is not in the list
    }

    @Test
    void testGetSize() {
        ListManager.addElement(testList, 5);
        ListManager.addElement(testList, 15);
        assertEquals(2, ListManager.getSize(testList));
    }

    @Test
    void testGetSizeAfterRemoval() {
        ListManager.addElement(testList, 100);
        ListManager.removeElement(testList, 100);
        assertEquals(0, ListManager.getSize(testList));
    }
}
