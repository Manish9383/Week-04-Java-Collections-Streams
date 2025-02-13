package map_interface.find_the_key_with_the_highest_value;

import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String keyWithMaxValue = MapUtility.findKeyWithMaxValue(map);

        System.out.println("Map elements are :{"+map);
        System.out.println("Key with the maximum value: " + keyWithMaxValue);
    }
}