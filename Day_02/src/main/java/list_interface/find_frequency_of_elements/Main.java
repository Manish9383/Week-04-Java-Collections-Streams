package list_interface.find_frequency_of_elements;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("apple", "banana", "apple", "orange");

        FrequencyCount counter = new FrequencyCount();

        Map<String, Integer> result = counter.findFrequency(inputList);

        System.out.println("Original list was :"+inputList);
        System.out.println("Frequency of the words are :"+result);
    }
}
