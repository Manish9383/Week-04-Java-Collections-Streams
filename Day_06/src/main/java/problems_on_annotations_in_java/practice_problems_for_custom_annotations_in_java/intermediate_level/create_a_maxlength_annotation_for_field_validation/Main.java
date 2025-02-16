package problems_on_annotations_in_java.practice_problems_for_custom_annotations_in_java.intermediate_level.create_a_maxlength_annotation_for_field_validation;


public class Main {
    public static void main(String[] args) {
        try {
            User validUser = new User("Manu123");
            System.out.println("Valid User Created: " + validUser.getUsername());

            // This should throw an exception
            User invalidUser = new User("Manishpatel");
        } catch (IllegalArgumentException e) {
            System.err.println("Validation Error: " + e.getMessage());
        }
    }
}
