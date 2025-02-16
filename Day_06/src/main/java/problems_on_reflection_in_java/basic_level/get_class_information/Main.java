package problems_on_reflection_in_java.basic_level.get_class_information;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fully qualified class name: ");
        String className = scanner.nextLine();
        ClassInspector.inspectClass(className);
        scanner.close();
    }
}
