package list_interface.find_frequency_of_elements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCount{

    public Map<String, Integer> findFrequency(List<String> inputList) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String element : inputList) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        return frequencyMap;
    }
}
