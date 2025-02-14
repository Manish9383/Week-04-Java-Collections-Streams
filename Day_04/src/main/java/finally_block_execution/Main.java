package finally_block_execution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numerator :");
        int numerator= sc.nextInt();
        System.out.println("Enter denominator :");
        int denominator=sc.nextInt();
        FinallyBlockDemo.generateException(numerator,denominator);
    }
}
