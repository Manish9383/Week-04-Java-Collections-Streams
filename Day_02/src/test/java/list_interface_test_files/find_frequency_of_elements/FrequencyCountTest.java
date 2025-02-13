package list_interface_test_files.find_frequency_of_elements;


import list_interface.find_frequency_of_elements.FrequencyCount;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class FrequencyCountTest {

    @Test
    void testFrequencyWithMultipleOccurrences() {
        FrequencyCount counter = new FrequencyCount();
        List<String> inputList = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> result = counter.findFrequency(inputList);

        System.out.println("Test 1 - Expected: {apple=2, banana=1, orange=1}, Got: " + result);
        assertEquals(2, result.get("apple"));
        assertEquals(1, result.get("banana"));
        assertEquals(1, result.get("orange"));
    }

    @Test
    void testFrequencyWithSingleElement() {
        FrequencyCount counter = new FrequencyCount();
        List<String> inputList = Arrays.asList("mango");

        Map<String, Integer> result = counter.findFrequency(inputList);

        System.out.println("Test 2 - Expected: {mango=1}, Got: " + result);
        assertEquals(1, result.get("mango"));
    }

    @Test
    void testFrequencyWithDuplicates() {
        FrequencyCount counter = new FrequencyCount();
        List<String> inputList = Arrays.asList("grape", "grape", "grape");

        Map<String, Integer> result = counter.findFrequency(inputList);

        System.out.println("Test 3 - Expected: {grape=3}, Got: " + result);
        assertEquals(3, result.get("grape"));
    }

    @Test
    void testFrequencyWithEmptyList() {
        FrequencyCount counter = new FrequencyCount();
        List<String> inputList = Arrays.asList();

        Map<String, Integer> result = counter.findFrequency(inputList);

        System.out.println("Test 4 - Expected: {}, Got: " + result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testFrequencyWithMixedCase() {
        FrequencyCount counter = new FrequencyCount();
        List<String> inputList = Arrays.asList("Apple", "apple", "APPLE");

        Map<String, Integer> result = counter.findFrequency(inputList);

        System.out.println("Test 5 - Expected: {Apple=1, apple=1, APPLE=1}, Got: " + result);
        assertEquals(1, result.get("Apple"));
        assertEquals(1, result.get("apple"));
        assertEquals(1, result.get("APPLE"));
    }
}
