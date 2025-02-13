package queue_interface.generate_binary_numbers_using_a_queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryNumberGenerator {

    public void generateBinaryNumbers(int N) {
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        System.out.println("First " + N + " binary numbers:");

        for (int i = 0; i < N; i++) {
            String currentBinary = queue.remove();

            System.out.println(currentBinary);

            queue.add(currentBinary + "0");
            queue.add(currentBinary + "1");
        }
    }

    public void generateBinaryNumbersWithList(int N, List<String> outputList) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < N; i++) {
            String currentBinary = queue.remove();
            outputList.add(currentBinary);

            queue.add(currentBinary + "0");
            queue.add(currentBinary + "1");
        }
    }
}
