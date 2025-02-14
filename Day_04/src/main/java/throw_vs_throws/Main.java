package throw_vs_throws;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount :");
        double amount= sc.nextDouble();
        System.out.println("Enter the rate :");
        double rate= sc.nextDouble();
        System.out.println("Enter years :");
        int years= sc.nextInt();
        try{
           ExceptionPropagation.calculateInterest(amount,rate,years);
       }catch (IllegalArgumentException e){
            System.err.println("Invalid input: Amount and rate must be positive!");
        }
    }
}
