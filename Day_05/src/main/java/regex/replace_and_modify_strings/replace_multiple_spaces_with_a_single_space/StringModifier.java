package regex.replace_and_modify_strings.replace_multiple_spaces_with_a_single_space;


public class StringModifier {
    public static String replaceMultipleSpaces(String text) {
        return text.replaceAll("\\s+", " ").trim();
    }
}
