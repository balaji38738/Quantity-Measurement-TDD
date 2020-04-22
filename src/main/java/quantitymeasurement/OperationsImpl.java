package quantitymeasurement;

public class OperationsImpl implements Operations {
    @Override
    public double add(Length length1, Length length2) {
        return length1.value * length1.unit.baseUnitConversion +
                length2.value * length2.unit.baseUnitConversion;
    }
}
