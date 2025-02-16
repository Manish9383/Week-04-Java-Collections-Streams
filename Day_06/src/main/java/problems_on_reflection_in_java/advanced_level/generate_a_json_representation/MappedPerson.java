package problems_on_reflection_in_java.advanced_level.generate_a_json_representation;


public class MappedPerson {
    private String name;
    private int age;
    private String city;

    public MappedPerson() {} // Default constructor required

    public void display() {
        System.out.println("MappedPerson: " + name + ", Age: " + age + ", City: " + city);
    }
}
