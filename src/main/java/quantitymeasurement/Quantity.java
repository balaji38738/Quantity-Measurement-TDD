package quantitymeasurement;

public class Quantity {
    public final Unit UNIT;
    private final double VALUE;

    public Quantity(Unit UNIT, double VALUE) throws QuantityException {
        this.UNIT = UNIT;
        if (VALUE < 0.0 && !UNIT.quantityName.equals("temperature"))
            throw new QuantityException(QuantityException.ExceptionType.INVALID_VALUE,
                    "Value can't be negative");
        this.VALUE = VALUE;
    }

    public double getValue() {
        return VALUE;
    }

    public static Quantity getQuantity(String quantityName, double value) throws QuantityException {
        Quantity newQuantity;
        switch (quantityName) {
            case "length":
                newQuantity = new Quantity(Unit.INCH, value);
                break;
            case "volume":
                newQuantity = new Quantity(Unit.LITRE, value);
                break;
            case "mass":
                newQuantity = new Quantity(Unit.KG, value);
                break;
            default:
                newQuantity = null;
                break;
        }
        return newQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Math.abs(quantity.VALUE - VALUE) <= 0.02 && UNIT == quantity.UNIT;
    }

}
