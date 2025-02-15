package junit.testing_list_operations;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Get List Size");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    int addElement = scanner.nextInt();
                    ListManager.addElement(myList, addElement);
                    System.out.println("Added: " + addElement);
                    break;

                case 2:
                    System.out.print("Enter element to remove: ");
                    int removeElement = scanner.nextInt();
                    boolean removed = ListManager.removeElement(myList, removeElement);
                    System.out.println(removed ? "Removed: " + removeElement : "Element not found.");
                    break;

                case 3:
                    System.out.println("List Size: " + ListManager.getSize(myList));
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
