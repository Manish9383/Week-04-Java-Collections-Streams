package problems_on_annotations_in_java.exercise_2;

public class LegacyAPI {

    @Deprecated(since = "1.8", forRemoval = true) // Marks the method as outdated
    public void oldFeature() {
        System.out.println("Warning: This feature is deprecated and will be removed in future versions.");
    }

    public void newFeature() {
        System.out.println("This is the new and improved feature!");
    }
}
