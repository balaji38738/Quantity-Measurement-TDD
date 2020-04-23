package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    Operations operations = new OperationsImpl();

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Quantity feet2 = new Quantity(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given1NullObject_shouldReturnNotEqual() {
        Quantity feet = new Quantity(Unit.FEET, 0.0);
        Assert.assertNotEquals(feet, null);
    }

    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet1);
    }

    @Test
    public void givenStringAndFeet_shouldReturnNotEqual() {
        Quantity feet = new Quantity(Unit.FEET, 0.0);
        Assert.assertNotEquals(feet, "message");
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity inch2 = new Quantity(Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given1NullValueObject_shouldReturnNotEqual() {
        Quantity inch = new Quantity(Unit.INCH, 0.0);
        Assert.assertNotEquals(inch, null);
    }

    @Test
    public void givenSameReferenceOfInch_shouldReturnEqual() {
        Quantity inch = new Quantity(Unit.INCH, 0.0);
        Assert.assertEquals(inch, inch);
    }

    @Test
    public void givenStringAndInch_shouldReturnNotEqual() {
        Quantity inch = new Quantity(Unit.INCH, 0.0);
        Assert.assertNotEquals(inch, "message");
    }

    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity inch2 = new Quantity(Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd0Feet_shouldReturnEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH, 0.0);
        Quantity feet = new Quantity(Unit.FEET, 0.0);
        boolean compareCheck = Unit.compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = Unit.compare(feet, inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = Unit.compare(inch, feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_shouldReturnEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH, 12.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = Unit.compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_shouldReturnEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH, 12.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = Unit.compare(inch, feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual() throws QuantityException {
        Quantity feet = new Quantity(Unit.FEET, 3.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = Unit.compare(feet, yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqual() throws QuantityException {
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = Unit.compare(feet, yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = Unit.compare(inch, yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_shouldReturnEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH, 36.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = Unit.compare(yard, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_shouldReturnEqual() throws QuantityException {
        Quantity inch = new Quantity(Unit.INCH, 36.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = Unit.compare(inch, yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_shouldReturnEqual() throws QuantityException {
        Quantity feet = new Quantity(Unit.FEET, 3.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = Unit.compare(yard, feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5CM_shouldReturnEqual() throws QuantityException {
        Quantity cm = new Quantity(Unit.CM, 5.0);
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        boolean compareCheck = Unit.compare(inch, cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_shouldReturn4Inch() {
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        double lengthSum = operations.add(inch, inch);
        Assert.assertEquals(4.0, lengthSum, 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_shouldReturn14Inch() {
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        double lengthSum = operations.add(feet, inch);
        Assert.assertEquals(14.0, lengthSum, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_shouldReturn24Inch() {
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        double lengthSum = operations.add(feet, feet);
        Assert.assertEquals(24.0, lengthSum, 0.0);
    }

    @Test
    public void given2InchAnd2AndHalfCm_shouldReturn3Inch() {
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        Quantity cm = new Quantity(Unit.CM, 2.5);
        double lengthSum = operations.add(inch, cm);
        Assert.assertEquals(3.0, lengthSum, 0.0);
    }

    @Test
    public void given1GallonAnd3Point68Litres_shouldReturnEqual() throws QuantityException {
        Quantity gallon = new Quantity(Unit.GALLON, 1.0);
        Quantity litre = new Quantity(Unit.LITRE, 3.78);
        boolean compareCheck = Unit.compare(gallon, litre);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1LitreAnd1000Ml_shouldReturnEqual() throws QuantityException {
        Quantity ml = new Quantity(Unit.ML, 1000.0);
        Quantity litre = new Quantity(Unit.LITRE, 1.0);
        boolean compareCheck = Unit.compare(litre, ml);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1LitreAnd1Feet_shouldThrowException() {
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity litre = new Quantity(Unit.LITRE, 1.0);
        try {
            boolean compareCheck = Unit.compare(litre, feet);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.UNLIKE_QUANTITIES, e.type);
        }
    }

    @Test
    public void givenLitreAndGallon_shouldReturnAdditionInLitre() {
        Quantity gallon = new Quantity(Unit.GALLON, 1.0);
        Quantity litre = new Quantity(Unit.LITRE, 3.78);
        double volumeAddition = operations.add(gallon, litre);
        Assert.assertEquals(7.57, volumeAddition, 0.1);
    }
}