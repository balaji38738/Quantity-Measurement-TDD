package quantitymeasurement;

public enum Unit {

    /*Base unit inch for length */
    FEET(12.0, 0.0, "length"),
    INCH(1.0, 0.0, "length"),
    YARD(36.0, 0.0, "length"),
    CM(0.4, 0.0, "length"),

    /*Base unit litre for volume */
    LITRE(1.0, 0.0, "volume"),
    GALLON(3.78, 0.0, "volume"),
    ML(0.001, 0.0, "volume"),

    /* Base unit kg for mass */
    GRAM(0.001, 0.0, "mass"),
    KG(1.0, 0.0, "mass"),
    TONNE(1000.0, 0.0, "mass"),

    /*Base unit fahrenheit for temperature*/
    FAHRENHEIT(1.0, 0.0,  "temperature"),
    CELSIUS(1.8, 32.0, "temperature");

    double baseUnitConversion;  // Multiplication factor
    String quantityName;
    double additionConstant;   //constant to add for conversion

    Unit(double baseUnitConversion, double additionConstant, String quantityName) {
        this.baseUnitConversion = baseUnitConversion;
        this.quantityName = quantityName;
        this.additionConstant = additionConstant;
    }

    public static boolean compare(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if (!quantity1.UNIT.quantityName.equals(quantity2.UNIT.quantityName))
            throw new QuantityException(QuantityException.ExceptionType.UNLIKE_QUANTITIES,
                    "Invalid Comparison");
        return Double.compare(quantity1.getValue() * quantity1.UNIT.baseUnitConversion + quantity1.UNIT.additionConstant,
                quantity2.getValue() * quantity2.UNIT.baseUnitConversion + quantity2.UNIT.additionConstant) == 0;
    }

}
