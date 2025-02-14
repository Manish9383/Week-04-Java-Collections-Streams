package exception_propagation_in_methods;

public class Main {

    public static void method1(){
        int result = 10/0;
    }

    public static void method2(){
        method1();
    }

    public static void main(String[] args) {
        try{
            method2();
        }catch (ArithmeticException e){
            System.err.println("Handled Exception in Main !!");
        }
    }
}
