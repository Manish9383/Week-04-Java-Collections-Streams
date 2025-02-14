package custom_exception;

public class CustomExceptionDemo {
    public static void validateAge(int age){
        if(age<18){
            throw new InvalidAgeException("Age must be 18 0r above!");
        }
        System.out.println("Access granted!");
    }
}
