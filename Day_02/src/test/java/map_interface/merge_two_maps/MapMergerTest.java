package map_interface.merge_two_maps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MapMergerTest {

    private Map<String, Integer> map1;
    private Map<String, Integer> map2;

    @BeforeEach
    void setUp() {
        map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);
    }

    @Test
    void testMergeMaps() {
        System.out.println("Testing mergeMaps method...");

        Map<String, Integer> expectedMergedMap = new HashMap<>();
        expectedMergedMap.put("A", 1);
        expectedMergedMap.put("B", 5);  // B = 2 + 3
        expectedMergedMap.put("C", 4);

        Map<String, Integer> mergedMap = MapMerger.mergeMaps(map1, map2);

        System.out.println("Expected Merged Map: " + expectedMergedMap);
        System.out.println("Actual Merged Map: " + mergedMap);

        assertEquals(expectedMergedMap, mergedMap, "The merged map is not correct.");
    }

    @Test
    void testMergeMapsWithEmptyMap() {
        System.out.println("Testing mergeMaps with one empty map...");

        Map<String, Integer> emptyMap = new HashMap<>();
        Map<String, Integer> mergedMap = MapMerger.mergeMaps(map1, emptyMap);

        assertEquals(map1, mergedMap, "Merging with an empty map should return the original map.");
        System.out.println("Merged Map with empty map: " + mergedMap);
    }

    @Test
    void testMergeMapsWithNoCommonKeys() {
        System.out.println("Testing mergeMaps with no common keys...");

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("D", 5);
        map3.put("E", 6);

        Map<String, Integer> expectedMergedMap = new HashMap<>();
        expectedMergedMap.put("A", 1);
        expectedMergedMap.put("B", 2);
        expectedMergedMap.put("D", 5);
        expectedMergedMap.put("E", 6);

        Map<String, Integer> mergedMap = MapMerger.mergeMaps(map1, map3);

        System.out.println("Expected Merged Map (no common keys): " + expectedMergedMap);
        System.out.println("Actual Merged Map: " + mergedMap);

        assertEquals(expectedMergedMap, mergedMap, "The merged map is not correct when there are no common keys.");
    }
}
