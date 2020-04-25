package quantitymeasurement;

public class OperationsImpl implements Operations {
    public boolean compare(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if (quantity1.getUnit().quantityName != quantity2.getUnit().quantityName)
            throw new QuantityException(QuantityException.ExceptionType.UNLIKE_QUANTITIES,
                    "Invalid Comparison");
        return Double.compare(quantity1.getValue() * quantity1.getUnit().baseUnitConversion + quantity1.getUnit().additionConstant,
                quantity2.getValue() * quantity2.getUnit().baseUnitConversion + quantity2.getUnit().additionConstant) == 0;
    }

    @Override
    public Quantity add(Quantity quantity1, Quantity quantity2, Unit userUnit) throws QuantityException {
        if (!quantity1.getUnit().quantityName.equals(quantity2.getUnit().quantityName))
            throw new QuantityException(QuantityException.ExceptionType.UNLIKE_QUANTITIES,
                    "Unlike quantity addition");
        if (quantity1.getUnit().quantityName == QuantityName.TEMPERATURE)
            throw new QuantityException(QuantityException.ExceptionType.NON_ADDITIVE_QUANTITY,
                    "Temperature can't be added");
        if (userUnit.quantityName != quantity1.getUnit().quantityName)
            throw new QuantityException(QuantityException.ExceptionType.INVALID_QUANTITY_UNIT,
                    "Invalid unit for given quantity");
        double sum = quantity1.getValue() * quantity1.getUnit().baseUnitConversion +
                quantity2.getValue() * quantity2.getUnit().baseUnitConversion;
        return new Quantity(userUnit, sum / userUnit.baseUnitConversion);
    }
}
