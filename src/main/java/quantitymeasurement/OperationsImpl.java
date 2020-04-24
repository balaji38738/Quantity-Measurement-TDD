package quantitymeasurement;

public class OperationsImpl implements Operations {
    @Override
    public Quantity add(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if (!quantity1.UNIT.quantityName.equals(quantity2.UNIT.quantityName))
            throw new QuantityException(QuantityException.ExceptionType.UNLIKE_QUANTITIES,
                    "Unlike quantity addition");
        if(quantity1.UNIT.quantityName.equals("temperature"))
            throw new QuantityException(QuantityException.ExceptionType.NON_ADDITIVE_QUANTITY,
                    "Temperature can't be added");
        double sum = quantity1.getValue() * quantity1.UNIT.baseUnitConversion +
                quantity2.getValue() * quantity2.UNIT.baseUnitConversion;
        return Quantity.getQuantityObject(quantity1.UNIT.quantityName, sum);
    }
}
