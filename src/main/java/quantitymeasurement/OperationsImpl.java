package quantitymeasurement;

public class OperationsImpl implements Operations {
    @Override
    public double add(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if (!quantity1.UNIT.quantityName.equals(quantity2.UNIT.quantityName))
            throw new QuantityException(QuantityException.ExceptionType.UNLIKE_QUANTITIES, "Unlike quantity addition");
        return quantity1.VALUE * quantity1.UNIT.baseUnitConversion +
                quantity2.VALUE * quantity2.UNIT.baseUnitConversion;
    }
}
