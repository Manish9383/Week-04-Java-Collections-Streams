package problems_on_annotations_in_java.exercise_1;


public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphism
        myDog.makeSound(); // Calls the overridden method in Dog
    }
}
