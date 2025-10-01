package walkingcompiler.exceptions;

public class CreditCardNotFound extends RuntimeException {
    public CreditCardNotFound(String message) {
        super(message);
    }
}
