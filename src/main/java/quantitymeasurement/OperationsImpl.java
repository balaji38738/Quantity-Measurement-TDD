package quantitymeasurement;

public class OperationsImpl implements Operations {
    public boolean compare(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if (quantity1.UNIT.quantityName != quantity2.UNIT.quantityName)
            throw new QuantityException(QuantityException.ExceptionType.UNLIKE_QUANTITIES,
                    "Invalid Comparison");
        return Double.compare(quantity1.getValue() * quantity1.UNIT.baseUnitConversion + quantity1.UNIT.additionConstant,
                quantity2.getValue() * quantity2.UNIT.baseUnitConversion + quantity2.UNIT.additionConstant) == 0;
    }

    @Override
    public Quantity add(Quantity quantity1, Quantity quantity2, Unit userUnit) throws QuantityException {
        if (!quantity1.UNIT.quantityName.equals(quantity2.UNIT.quantityName))
            throw new QuantityException(QuantityException.ExceptionType.UNLIKE_QUANTITIES,
                    "Unlike quantity addition");
        if(quantity1.UNIT.quantityName == QuantityName.TEMPERATURE)
            throw new QuantityException(QuantityException.ExceptionType.NON_ADDITIVE_QUANTITY,
                    "Temperature can't be added");
        double sum = quantity1.getValue() * quantity1.UNIT.baseUnitConversion +
                quantity2.getValue() * quantity2.UNIT.baseUnitConversion;
        return new Quantity(userUnit, sum / userUnit.baseUnitConversion);
    }
}
