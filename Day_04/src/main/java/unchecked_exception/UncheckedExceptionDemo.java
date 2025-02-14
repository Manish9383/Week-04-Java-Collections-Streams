package unchecked_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptionDemo {
    public static void generateException(){
        int numerator,denominator;
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter numerator :");
            numerator= sc.nextInt();
            System.out.println("Enter denominator :");
            denominator=sc.nextInt();

            try{
                int result=numerator/denominator;
                System.out.println("Result :"+result);
            }catch (ArithmeticException e){
                System.err.println("Please give a valid denominator other than 0!!!"+e.getMessage());
            }

        } catch (InputMismatchException e) {
            System.err.println("Please enter a valid Integer!!!"+e.getMessage());
        }
    }
}
