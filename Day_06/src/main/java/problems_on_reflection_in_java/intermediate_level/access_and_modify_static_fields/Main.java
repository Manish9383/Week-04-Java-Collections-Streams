package problems_on_reflection_in_java.intermediate_level.access_and_modify_static_fields;


public class Main {
    public static void main(String[] args) {
        // Print original API_KEY
        System.out.println("Before modification: " + Configuration.getApiKey());

        // Modify API_KEY using Reflection
        StaticFieldModifier.modifyApiKey("NEW_SECRET_KEY");

        // Print modified API_KEY
        System.out.println("After modification: " + Configuration.getApiKey());
    }
}
