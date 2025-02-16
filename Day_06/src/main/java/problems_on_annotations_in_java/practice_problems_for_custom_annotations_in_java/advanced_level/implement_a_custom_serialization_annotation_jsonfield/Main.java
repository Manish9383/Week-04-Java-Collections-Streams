package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.advanced_level.implement_a_custom_serialization_annotation_jsonfield;


public class Main {
    public static void main(String[] args) {
        User user = new User("Manu123", 25, "secretPassword");

        String json = JsonSerializer.toJson(user);
        System.out.println("Serialized JSON: " + json);
    }
}
