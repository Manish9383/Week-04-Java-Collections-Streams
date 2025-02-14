package nested_try_catch_block;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size= sc.nextInt();

        int [] arr=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter array element: ");
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the index to access: ");
        int index=sc.nextInt();

        System.out.println("Enter the divisor: ");
        int divisor= sc.nextInt();

        Operations.generateException(arr,divisor,index) ;
    }
}
