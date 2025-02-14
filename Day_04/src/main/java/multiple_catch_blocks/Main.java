package multiple_catch_blocks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int [] arr= {18,19,20,70,90,40};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index to retrieve : ");
        int index=sc.nextInt();
         MultipleCatchDemo.generateException(arr,index);
    }
}
