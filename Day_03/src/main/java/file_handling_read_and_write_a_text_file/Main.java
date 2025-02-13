package file_handling_read_and_write_a_text_file;

public class Main {
    public static void main(String[] args) {
        String sourceFilePath = "src/main/resources/sample_2mb.txt";
        String destinationFilePath = "src/main/resources/demo_problem_01.txt";

        FileHandling.fileMaker(sourceFilePath, destinationFilePath);    }
}
