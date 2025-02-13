package map_interface.invert_a_map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MapInverterTest {

    private Map<String, Integer> map;

    @BeforeEach
    void setUp() {
        map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);
    }

    @Test
    void testInvertMap() {
        System.out.println("Testing invertMap method...");

        Map<Integer, List<String>> expectedInvertedMap = new HashMap<>();
        expectedInvertedMap.put(1, Arrays.asList("A", "C"));
        expectedInvertedMap.put(2, Arrays.asList("B"));

        Map<Integer, List<String>> invertedMap = MapInverter.invertMap(map);

        System.out.println("Expected Inverted Map: " + expectedInvertedMap);
        System.out.println("Actual Inverted Map: " + invertedMap);

        assertEquals(expectedInvertedMap, invertedMap, "The inverted map is not correct.");
    }

    @Test
    void testEmptyMap() {
        System.out.println("Testing empty map...");

        Map<String, Integer> emptyMap = new HashMap<>();
        Map<Integer, List<String>> invertedMap = MapInverter.invertMap(emptyMap);

        assertTrue(invertedMap.isEmpty(), "The inverted map should be empty when the input map is empty.");

        System.out.println("Inverted Map for empty map: " + invertedMap);
    }

    @Test
    void testSingleValueMap() {
        System.out.println("Testing single value map...");

        Map<String, Integer> singleValueMap = new HashMap<>();
        singleValueMap.put("A", 1);

        Map<Integer, List<String>> invertedMap = MapInverter.invertMap(singleValueMap);

        assertEquals(1, invertedMap.size(), "The inverted map should contain one entry.");
        assertTrue(invertedMap.containsKey(1), "The inverted map should contain the key 1.");
        assertEquals(Collections.singletonList("A"), invertedMap.get(1), "The value for key 1 should be [A].");

        System.out.println("Inverted Map for single value map: " + invertedMap);
    }
}
