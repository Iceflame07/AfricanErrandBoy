package walkingcompiler.exceptions;

public class BankAccountTypeNotFoundException extends RuntimeException {
    public BankAccountTypeNotFoundException(String message) {
        super(message);
    }
}
