package map_interface.merge_two_maps;

import java.util.HashMap;
import java.util.Map;

public class MapMerger {

    // Method to merge two maps
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        // Create a new map and add all entries from the first map
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        // Merge entries from the second map
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return mergedMap;
    }
}