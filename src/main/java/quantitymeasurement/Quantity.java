package quantitymeasurement;

public class Quantity {
    private final Unit UNIT;
    private final double VALUE;

    public Quantity(Unit UNIT, double VALUE) throws QuantityException {
        this.UNIT = UNIT;
        if (VALUE < 0.0 && UNIT.quantityName != QuantityName.TEMPERATURE)
            throw new QuantityException(QuantityException.ExceptionType.INVALID_VALUE,
                    "Value can't be negative");
        this.VALUE = VALUE;
    }

    public Unit getUnit() { return UNIT; }

    public double getValue() {
        return VALUE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Math.abs(quantity.VALUE - VALUE) <= 0.02 && UNIT == quantity.UNIT;
    }

}
