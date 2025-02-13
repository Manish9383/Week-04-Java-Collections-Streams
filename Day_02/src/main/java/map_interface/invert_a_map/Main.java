package map_interface.invert_a_map;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        Map<Integer, List<String>> invertedMap = MapInverter.invertMap(map);

        System.out.println("Inverted Map: " + invertedMap);
    }
}