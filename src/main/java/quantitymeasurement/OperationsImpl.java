package quantitymeasurement;

public class OperationsImpl implements Operations {
    @Override
    public double add(Quantity quantity1, Quantity quantity2) {
        return quantity1.VALUE * quantity1.UNIT.baseUnitConversion +
                quantity2.VALUE * quantity2.UNIT.baseUnitConversion;
    }
}
