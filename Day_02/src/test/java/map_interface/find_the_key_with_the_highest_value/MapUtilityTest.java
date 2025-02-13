package map_interface.find_the_key_with_the_highest_value;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

class MapUtilityTest {

    private Map<String, Integer> map;

    @BeforeEach
    void setUp() {
        map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);
    }

    @Test
    void testFindKeyWithMaxValue() {
        System.out.println("Testing findKeyWithMaxValue method...");

        String expectedKey = "B";  // Expected key with the highest value (20)
        String actualKey = MapUtility.findKeyWithMaxValue(map);

        System.out.println("Map elements are: " + map);
        System.out.println("Key with the maximum value: " + actualKey);

        assertEquals(expectedKey, actualKey, "The key with the highest value is not correct.");
    }

    @Test
    void testEmptyMap() {
        System.out.println("Testing empty map...");

        map.clear();

        String result = MapUtility.findKeyWithMaxValue(map);
        System.out.println("Result for empty map: " + result);

        assertNull(result, "The result should be null for an empty map.");
    }

    @Test
    void testSingleElementMap() {
        System.out.println("Testing map with a single element...");

        map.clear();
        map.put("X", 50);

        String expectedKey = "X";
        String actualKey = MapUtility.findKeyWithMaxValue(map);
        System.out.println("Result for single element map: " + actualKey);

        assertEquals(expectedKey, actualKey, "The key with the highest value is not correct.");
    }
}
