package filter_streams_convert_uppercase_to_lowercase;

public class Main {
    public static void main(String[] args) {
        String sourceFile = "src/main/resources/sample_2mb.txt";
        String destinationFile = "src/main/resources/convertcase_problem_06.txt";

        UppercaseToLowercaseConverter.convertFile(sourceFile, destinationFile);
    }
}
