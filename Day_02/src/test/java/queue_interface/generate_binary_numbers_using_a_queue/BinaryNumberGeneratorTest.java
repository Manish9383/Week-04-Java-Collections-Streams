package queue_interface.generate_binary_numbers_using_a_queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNumberGeneratorTest {

    private BinaryNumberGenerator generator;

    @BeforeEach
    void setUp() {
        generator = new BinaryNumberGenerator();
    }

    @Test
    void testGenerateBinaryNumbers() {
        System.out.println("Testing generateBinaryNumbers method...");

        int N = 5;
        List<String> expectedOutput = List.of("1", "10", "11", "100", "101");
        List<String> actualOutput = new ArrayList<>();

        generator.generateBinaryNumbersWithList(N, actualOutput);

        System.out.println("Expected Output: " + expectedOutput);
        System.out.println("Actual Output:   " + actualOutput);

        assertEquals(expectedOutput, actualOutput, "Binary numbers do not match expected sequence.");
    }
}
