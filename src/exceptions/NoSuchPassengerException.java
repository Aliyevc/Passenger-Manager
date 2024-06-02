package exceptions;

public class NoSuchPassengerException extends RuntimeException{
    public NoSuchPassengerException(String message) {
        super(message);
    }

    public NoSuchPassengerException(String message, Throwable cause) {
        super(message, cause);
    }
}
