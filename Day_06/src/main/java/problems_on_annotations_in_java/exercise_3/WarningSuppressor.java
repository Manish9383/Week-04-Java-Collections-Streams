package problems_on_annotations_in_java.exercise_3;


import java.util.ArrayList;
import java.util.List;

public class WarningSuppressor {

    @SuppressWarnings("unchecked") // Suppresses unchecked warnings
    public void addElements() {
        List rawList = new ArrayList(); // No generics, causes an unchecked warning
        rawList.add("Hello");
        rawList.add(42); // Mixing types, normally a bad practice

        System.out.println("List contains: " + rawList);
    }
}
