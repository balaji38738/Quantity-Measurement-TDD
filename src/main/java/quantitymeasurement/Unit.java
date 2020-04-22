package quantitymeasurement;

public enum Unit {
    FEET(12.0), INCH(1.0), YARD(36.0);

    double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public static boolean compare(Length length1, Length length2) {
        return Double.compare(length1.value * length1.unit.baseUnitConversion,
                length2.value * length2.unit.baseUnitConversion) == 0;
    }
}
