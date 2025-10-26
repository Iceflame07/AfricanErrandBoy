package walkingcompiler.exceptions;

public class BankAccountNumberNotFoundException extends RuntimeException {
    public BankAccountNumberNotFoundException(String message) {
        super(message);
    }
}
