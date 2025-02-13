package map_interface.invert_a_map;

import java.util.*;

public class MapInverter {

    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return invertedMap;
    }
}