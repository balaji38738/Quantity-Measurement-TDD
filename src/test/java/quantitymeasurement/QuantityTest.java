package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given1NullObject_shouldReturnNotEqual() {
        Feet feet = new Feet(0.0);
        Assert.assertNotEquals(feet, null);
    }

    @Test
    public void givenSameReference_shouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Assert.assertEquals(feet1, feet1);
    }

    @Test
    public void givenStringAndFeet_shouldReturnNotEqual() {
        Feet feet = new Feet(0.0);
        Assert.assertNotEquals(feet, "message");
    }

}
