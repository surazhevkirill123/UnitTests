package by.bsu.triangle.validator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleValidatorTest {
    @Test
    public void isSidePositive() {
        TriangleValidator validator = new TriangleValidator();
        Assert.assertTrue(validator.isSide(123));
    }
    @Test
    public void isSideNegative() {
        TriangleValidator validator = new TriangleValidator();
        Assert.assertFalse(validator.isSide(-123));
    }
    @Test
    public void isSideZero() {
        TriangleValidator validator = new TriangleValidator();
        Assert.assertFalse(validator.isSide(0));
    }

    @Test
    public void isTriangleTriangle() {
        TriangleValidator validator = new TriangleValidator();
        Assert.assertTrue(validator.isTriangle(5, 3, 4));
    }
    @Test
    public void isTriangleNotTriangleA() {
        TriangleValidator validator = new TriangleValidator();
        Assert.assertFalse(validator.isTriangle(14, 3, 5));
    }
    @Test
    public void isTriangleNotTriangleB() {
        TriangleValidator validator = new TriangleValidator();
        Assert.assertFalse(validator.isTriangle(4, 13, 5));
    }
    @Test
    public void isTriangleNotTriangleC() {
        TriangleValidator validator = new TriangleValidator();
        Assert.assertFalse(validator.isTriangle(4, 3, 15));
    }
    @Test
    public void isTriangleNegativeA() {
        TriangleValidator validator = new TriangleValidator();
        Assert.assertFalse(validator.isTriangle(-4, 3, 5));
    }
    @Test
    public void isTriangleNegativeB() {
        TriangleValidator validator = new TriangleValidator();
        Assert.assertFalse(validator.isTriangle(4, -3, 5));
    }
    @Test
    public void isTriangleNegativeC() {
        TriangleValidator validator = new TriangleValidator();
        Assert.assertFalse(validator.isTriangle(4, 3, -5));
    }
    @Test
    public void isTriangleZeroA() {
        TriangleValidator validator = new TriangleValidator();
        Assert.assertFalse(validator.isTriangle(0, 3, 5));
    }
    @Test
    public void isTriangleZeroB() {
        TriangleValidator validator = new TriangleValidator();
        Assert.assertFalse(validator.isTriangle(4, 0, 5));
    }
    @Test
    public void isTriangleZeroC() {
        TriangleValidator validator = new TriangleValidator();
        Assert.assertFalse(validator.isTriangle(0, 3, 0));
    }
}
