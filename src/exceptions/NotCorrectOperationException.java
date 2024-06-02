package exceptions;

public class NotCorrectOperationException extends RuntimeException{
    public NotCorrectOperationException(String message) {
        super(message);
    }

    public NotCorrectOperationException(String message, Throwable cause) {
        super(message, cause);
    }

}
