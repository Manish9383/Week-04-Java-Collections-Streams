package problems_on_reflection_in_java.basic_level.access_private_field;


public class Main {
    public static void main(String[] args) {
        Person person = new Person(25);

        System.out.println("Before modification:");
        person.displayAge();

        // Modify private field using Reflection
        PrivateFieldAccessor.modifyAge(person, 30);

        System.out.println("After modification:");
        person.displayAge();

        // Retrieve modified private field value
        int updatedAge = PrivateFieldAccessor.getAge(person);
        System.out.println("Retrieved Age using Reflection: " + updatedAge);
    }
}
