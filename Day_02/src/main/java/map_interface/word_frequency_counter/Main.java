package map_interface.word_frequency_counter;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String filePath = "sample.txt";

        WordFrequencyCounter counter = new WordFrequencyCounter();

        Map<String, Integer> wordFrequencies = counter.countWordFrequency(filePath);

        counter.displayWordFrequencies(wordFrequencies);
    }
}
