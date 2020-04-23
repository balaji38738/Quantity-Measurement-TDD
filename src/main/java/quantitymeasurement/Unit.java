package quantitymeasurement;

public enum Unit {

    /*Base unit inch for length */
    FEET(12.0, "length"), INCH(1.0, "length"),
    YARD(36.0, "length"), CM(0.4, "length"),

    /*Base unit litre for volume */
    LITRE(1.0, "volume"), GALLON(3.78, "volume"),
    ML(0.001, "volume"),

    /* Base unit kg for mass */
    GRAM(0.001, "mass"), KG(1.0, "mass"),
    TONNE(1000.0, "mass"),

    /*Base unit fahrenheit for temperature*/
    FAHRENHEIT(1.0, "temperature"),
    CELSIUS(2.12,"temperature");

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
        return Double.compare(quantity1.getValue() * quantity1.UNIT.baseUnitConversion,
                quantity2.getValue() * quantity2.UNIT.baseUnitConversion) == 0;
    }

}
