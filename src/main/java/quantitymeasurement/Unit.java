package quantitymeasurement;

public enum Unit {
    FEET(12.0, "length"), INCH(1.0, "length"),
    YARD(36.0, "length"), CM(0.4, "length"),

    LITRE(1.0, "volume"), GALLON(3.78, "volume"),
    ML(0.001, "volume"),

    GRAM(0.001, "mass"), KG(1.0, "mass"),
    TONNE(1000.0, "mass");

    String quantityName;
    double baseUnitConversion;

    Unit(double baseUnitConversion, String quantityName) {
        this.baseUnitConversion = baseUnitConversion;
        this.quantityName = quantityName;
    }

    public static boolean compare(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if (!quantity1.UNIT.quantityName.equals(quantity2.UNIT.quantityName))
            throw new QuantityException(QuantityException.ExceptionType.UNLIKE_QUANTITIES,
                    "Invalid Comparison");
        return Double.compare(quantity1.VALUE * quantity1.UNIT.baseUnitConversion,
                quantity2.VALUE * quantity2.UNIT.baseUnitConversion) == 0;
    }

}
