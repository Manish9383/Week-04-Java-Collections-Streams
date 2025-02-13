package read_a_large_file_line_by_line;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/resources/sample_500mb.txt"; // Update path accordingly
        LargeFileReader.readAndFilterErrors(filePath);
    }

}
