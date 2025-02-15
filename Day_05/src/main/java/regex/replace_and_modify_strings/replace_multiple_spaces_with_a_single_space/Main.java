package regex.replace_and_modify_strings.replace_multiple_spaces_with_a_single_space;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with multiple spaces: ");
        String text = scanner.nextLine();

        String modifiedText = StringModifier.replaceMultipleSpaces(text);

        System.out.println(" Modified String:");
        System.out.println(modifiedText);

        scanner.close();
    }
}
