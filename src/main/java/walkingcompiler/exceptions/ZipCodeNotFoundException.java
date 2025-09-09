package walkingcompiler.exceptions;

public class ZipCodeNotFoundException extends RuntimeException {
  public ZipCodeNotFoundException(String message) {
    super(message);
  }
}
