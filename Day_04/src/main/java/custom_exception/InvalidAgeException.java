package custom_exception;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message){
        super(message);
        System.err.println(message);
    }
}
