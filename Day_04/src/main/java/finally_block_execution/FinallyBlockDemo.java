package finally_block_execution;


public class FinallyBlockDemo {
    public static void generateException(int numerator,int denominator){
            try{
                int result=numerator/denominator;
                System.out.println("Result :"+result);
            }catch (ArithmeticException e){
                System.err.println("Please give a valid denominator other than 0!!!");
            }finally {
                System.out.println("Operation Completed!");
            }
    }
}
