package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given1NullObject_shouldReturnNotEqual() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Assert.assertNotEquals(feet, null);
    }

    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet1);
    }

    @Test
    public void givenStringAndFeet_shouldReturnNotEqual() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Assert.assertNotEquals(feet, "message");
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Length inch1  = new Length(Length.Unit.INCH, 0.0);
        Length inch2  = new Length(Length.Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given1NullValueObject_shouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Assert.assertNotEquals(inch, null);
    }

    @Test
    public void givenSameReferenceOfInch_shouldReturnEqual() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Assert.assertEquals(inch, inch);
    }

    @Test
    public void givenStringAndInch_shouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Assert.assertNotEquals(inch, "message");
    }

    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd0Feet_shouldReturnEqual() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Length feet = new Length(Length.Unit.FEET, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Length feet = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }
}
