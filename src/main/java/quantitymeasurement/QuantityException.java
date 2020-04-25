package quantitymeasurement;

public class QuantityException  extends Exception {
    public enum ExceptionType {UNLIKE_QUANTITIES, INVALID_VALUE, NON_ADDITIVE_QUANTITY,
        INVALID_QUANTITY_UNIT
    }

    ExceptionType type;

    public QuantityException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
