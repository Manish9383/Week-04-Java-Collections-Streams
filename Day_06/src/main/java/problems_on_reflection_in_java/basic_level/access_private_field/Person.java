package problems_on_reflection_in_java.basic_level.access_private_field;


public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void displayAge() {
        System.out.println("Age: " + age);
    }
}
