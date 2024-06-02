package exceptions;

public class NullListException extends RuntimeException{
    public NullListException(String message) {
        super(message);
    }

    public NullListException(String message, Throwable cause) {
        super(message, cause);
    }
}
