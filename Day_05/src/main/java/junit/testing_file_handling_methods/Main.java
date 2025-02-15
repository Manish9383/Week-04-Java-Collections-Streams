package junit.testing_file_handling_methods;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "src/main/resources/testfile.txt";

        try {
            System.out.print("Enter content to write to file: ");
            String content = scanner.nextLine();

            FileProcessor.writeToFile(filename, content);
            System.out.println("File written successfully.");

            String fileContent = FileProcessor.readFromFile(filename);
            System.out.println("File Content:\n" + fileContent);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
