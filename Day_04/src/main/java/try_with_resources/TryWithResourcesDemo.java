package try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void generateException(String filePath){
        try(BufferedReader bf=new BufferedReader(new FileReader(filePath))){
            String line=bf.readLine();
            System.out.println("File read successfully here is the first line : "+line);
        } catch (IOException e){
            System.err.println("Error reading file!");
        }
    }
}
