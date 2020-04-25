package quantitymeasurement;

public interface Operations {
    boolean compare(Quantity quantity1, Quantity quantity2) throws QuantityException;
    Quantity add(Quantity quantity1, Quantity quantity2, Unit userUnit) throws QuantityException;
}
