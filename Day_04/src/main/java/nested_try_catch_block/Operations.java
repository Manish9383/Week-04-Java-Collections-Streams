package nested_try_catch_block;

public class Operations {
    public static void generateException(int [] arr,int divisor,int index){
       try {
           try {
               System.out.println("Element at given index "+index+" is: " + arr[index]);
           } catch (ArrayIndexOutOfBoundsException e) {
               System.err.println("Invalid array index!");
           }
           int temp = arr[index] / divisor;
       } catch (ArithmeticException e){
           System.err.println("Cannot divide by zero!");
       }

    }
}
