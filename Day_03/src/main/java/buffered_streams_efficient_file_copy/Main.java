package buffered_streams_efficient_file_copy;

public class Main {
    public static void main(String[] args) {
       String sourceFile="src/main/resources/sample_100mb.txt";
       String destFileForFileStream="src/main/resources/demo_problem_02.txt";
       String destFileForBufferedStream="src/main/resources/demo_problem_02b.txt";

       FileCopyUsingFileStream.fileMaker(sourceFile,destFileForFileStream);
       FileCopyUsingBufferedStreams.fileMaker(sourceFile,destFileForBufferedStream);
    }
}
