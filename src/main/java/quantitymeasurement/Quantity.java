package quantitymeasurement;

public class Quantity {
    public final Unit UNIT;
    public final double VALUE;

    public Quantity(Unit UNIT, double VALUE) {
        this.UNIT = UNIT;
        this.VALUE = VALUE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.VALUE, VALUE) == 0 && UNIT == quantity.UNIT;
    }

}
