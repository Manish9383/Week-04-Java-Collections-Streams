package problems_on_reflection_in_java.basic_level.dynamically_create_objects;

public class Main {
    public static void main(String[] args) {
        // Create Student object dynamically using Reflection
        Student student = ObjectCreator.createStudentInstance("Emma", 22);

        if (student != null) {
            student.display();
        } else {
            System.out.println("Failed to create Student instance.");
        }
    }
}
