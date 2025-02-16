package problems_on_annotations_in_java.exercise_2;


public class Main {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        // Calling both methods
        api.oldFeature(); // Should display a deprecation warning
        api.newFeature();
    }
}
