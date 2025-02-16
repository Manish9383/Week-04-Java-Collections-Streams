package problems_on_annotations_in_java_test_files.exercise_1;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import problems_on_annotations_in_java.exercise_1.Animal;
import problems_on_annotations_in_java.exercise_1.Dog;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AnimalTest {

    @Test
    void testDogMakeSound() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Animal myDog = new Dog();
        myDog.makeSound();

        System.setOut(originalOut);
        String output = outputStream.toString().trim();

        assertEquals("Dog barks: Woof! Woof!", output);
    }
}
