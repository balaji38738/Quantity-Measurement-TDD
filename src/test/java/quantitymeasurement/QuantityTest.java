package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = new Length(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given1NullObject_shouldReturnNotEqual() {
        Length feet = new Length(Unit.FEET, 0.0);
        Assert.assertNotEquals(feet, null);
    }

    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet1);
    }

    @Test
    public void givenStringAndFeet_shouldReturnNotEqual() {
        Length feet = new Length(Unit.FEET, 0.0);
        Assert.assertNotEquals(feet, "message");
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = new Length(Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH, 0.0);
        Length inch2 = new Length(Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given1NullValueObject_shouldReturnNotEqual() {
        Length inch = new Length(Unit.INCH, 0.0);
        Assert.assertNotEquals(inch, null);
    }

    @Test
    public void givenSameReferenceOfInch_shouldReturnEqual() {
        Length inch = new Length(Unit.INCH, 0.0);
        Assert.assertEquals(inch, inch);
    }

    @Test
    public void givenStringAndInch_shouldReturnNotEqual() {
        Length inch = new Length(Unit.INCH, 0.0);
        Assert.assertNotEquals(inch, "message");
    }

    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH, 0.0);
        Length inch2 = new Length(Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd0Feet_shouldReturnEqual() {
        Length inch = new Length(Unit.INCH, 0.0);
        Length feet = new Length(Unit.FEET, 0.0);
        boolean compareCheck = Unit.compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqual() {
        Length inch = new Length(Unit.INCH, 1.0);
        Length feet = new Length(Unit.FEET, 1.0);
        boolean compareCheck = Unit.compare(feet, inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqual() {
        Length inch = new Length(Unit.INCH, 1.0);
        Length feet = new Length(Unit.FEET, 1.0);
        boolean compareCheck = Unit.compare(inch, feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_shouldReturnEqual() {
        Length inch = new Length(Unit.INCH, 12.0);
        Length feet = new Length(Unit.FEET, 1.0);
        boolean compareCheck = Unit.compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_shouldReturnEqual() {
        Length inch = new Length(Unit.INCH, 12.0);
        Length feet = new Length(Unit.FEET, 1.0);
        boolean compareCheck = Unit.compare(inch, feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual() {
        Length feet = new Length(Unit.FEET, 3.0);
        Length yard = new Length(Unit.YARD, 1.0);
        boolean compareCheck = Unit.compare(feet, yard);
        Assert.assertTrue(compareCheck);
    }
}