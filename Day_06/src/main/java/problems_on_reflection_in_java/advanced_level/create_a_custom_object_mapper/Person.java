package problems_on_reflection_in_java.advanced_level.create_a_custom_object_mapper;

public class Person {
    private String name;
    private int age;
    private String city;

    public Person() {} // Default constructor is required

    public void display() {
        System.out.println("Person: " + name + ", Age: " + age + ", City: " + city);
    }
}
