package checked_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {
    public static void generateException(String filePath) {
        try(BufferedReader bf=new BufferedReader(new FileReader(filePath))){
            String line=bf.readLine();
            System.out.println("File read successfully, here is the first line :"+line);
        }catch (IOException e){
            System.err.println("File not found! "+e.getMessage());
        }
    }
}
