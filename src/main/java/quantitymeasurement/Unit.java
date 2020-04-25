package quantitymeasurement;

public enum Unit {

    /*Base unit inch for length */
    FEET(12.0, 0.0, QuantityName.LENGTH),
    INCH(1.0, 0.0, QuantityName.LENGTH),
    YARD(36.0, 0.0, QuantityName.LENGTH),
    CM(0.4, 0.0, QuantityName.LENGTH),

    /*Base unit litre for volume */
    LITRE(1.0, 0.0, QuantityName.VOLUME),
    GALLON(3.78, 0.0, QuantityName.VOLUME),
    ML(0.001, 0.0, QuantityName.VOLUME),

    /* Base unit kg for mass */
    GRAM(0.001, 0.0, QuantityName.MASS),
    KG(1.0, 0.0, QuantityName.MASS),
    TONNE(1000.0, 0.0, QuantityName.MASS),

    /*Base unit fahrenheit for temperature*/
    FAHRENHEIT(1.0, 0.0, QuantityName.TEMPERATURE),
    CELSIUS(1.8, 32.0, QuantityName.TEMPERATURE);

    double baseUnitConversion;  // Multiplication factor
    QuantityName quantityName;
    double additionConstant;   //constant to add for conversion

    Unit(double baseUnitConversion, double additionConstant, QuantityName quantityName) {
        this.baseUnitConversion = baseUnitConversion;
        this.quantityName = quantityName;
        this.additionConstant = additionConstant;
    }

    public static boolean compare(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if (quantity1.UNIT.quantityName != quantity2.UNIT.quantityName)
            throw new QuantityException(QuantityException.ExceptionType.UNLIKE_QUANTITIES,
                    "Invalid Comparison");
        return Double.compare(quantity1.getValue() * quantity1.UNIT.baseUnitConversion + quantity1.UNIT.additionConstant,
                quantity2.getValue() * quantity2.UNIT.baseUnitConversion + quantity2.UNIT.additionConstant) == 0;
    }

}
