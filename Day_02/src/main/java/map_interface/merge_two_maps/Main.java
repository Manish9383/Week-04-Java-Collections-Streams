package map_interface.merge_two_maps;

import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create two maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Merge the maps
        Map<String, Integer> mergedMap = MapMerger.mergeMaps(map1, map2);

        // Print the merged map
        System.out.println("Map 1: {"+map1+"}");
        System.out.println("Map 2: {"+map2+"}");
        System.out.println("Merged Map: " + mergedMap); // Output: Merged Map: {A=1, B=5, C=4}
    }
}