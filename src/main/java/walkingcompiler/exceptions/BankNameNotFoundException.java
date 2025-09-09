package walkingcompiler.exceptions;

public class BankNameNotFoundException extends RuntimeException {
    public BankNameNotFoundException(String message) {
        super(message);
    }
}
