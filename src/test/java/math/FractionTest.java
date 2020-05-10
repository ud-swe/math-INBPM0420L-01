package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FractionTest {

    private void assertFraction(int expectedNumerator, int expectedDenominator, Fraction actual) {
        assertAll("fraction",
                () -> assertEquals(expectedNumerator, actual.getNumerator(), "Invalid numerator"),
                () -> assertEquals(expectedDenominator, actual.getDenominator(), "Invalid denominator")
        );
    }

    @Test
    public void testFractionIntInt() {
        assertFraction(1, 4, new Fraction(1, 4));
        assertFraction(-13, 27, new Fraction(13, -27));
        assertFraction(5, 7, new Fraction(-5, -7));
        assertFraction(4, 2, new Fraction(4, 2));
        ArithmeticException e = assertThrows(ArithmeticException.class, () -> new Fraction(11, 0));
        assertEquals("Division by zero", e.getMessage());
    }

    @Test
    public void testFractionInt() {
        assertFraction(0, 1, new Fraction(0));
        assertFraction(3, 1, new Fraction(3));
        assertFraction(-13, 1, new Fraction(-13));
    }

    @Test
    public void testAddInt() {
        fail();
    }

    @Test
    public void testSubtractInt() {
        // TODO (C2Y4JW)
        fail();
    }

    @Test
    public void testMultiplyInt() {
        assertFraction(12, 8, new Fraction(6, 8).multiply(2));
        assertFraction(12, 2, new Fraction(4, 2).multiply(3));
        assertFraction(12, 7, new Fraction(3, 7).multiply(4));
        assertFraction(45, 13, new Fraction(9, 13).multiply(5));
        assertFraction(24, 5, new Fraction(4, 5).multiply(6));
    }

    @Test
    public void testDivideInt() {
        // TODO (YL8NNI)
        fail();
    }

    @Test
    public void testPow() {
        // TODO (X6RVMQ)
        fail();
    }

    @Test
    public void testAddFraction() {
        // TODO (XU4JAD)
        fail();
    }

    @Test
    public void testSubtractFraction() {
        // TODO (W9R2J9)
        assertFraction(5,28,new Fraction(3,7).subtract(new Fraction(1,4)));
        assertFraction(7,24,new Fraction(5,8).subtract(new Fraction(1,3)));
        assertFraction(-1,45,new Fraction(7,9).subtract(new Fraction(4,5)));
        assertFraction(10,21,new Fraction(8,7).subtract(new Fraction(2,3)));
        assertFraction(67,115,new Fraction(18,23).subtract(new Fraction(1,5)));
    }

    @Test
    public void testDivideFraction() {
        // TODO (W718KE)
        fail();
    }

    @Test
    public void testMultiplyFraction() {
        // TODO (QZQVTB)
        fail();
    }

    @Test
    public void testReciprocal() {
        // TODO (N1SBRH)
        fail();
    }

    @Test
    public void testAbs() {
        // TODO (J3KVK1)
        fail();
    }

    @Test
    public void testIsZero() {
        // TODO (I462V2)
        fail();
    }

    @Test
    public void testReduce() {
        assertFraction(2,3,new Fraction(4,6).reduce());
        assertFraction(6,7,new Fraction(30,35).reduce());
        assertFraction(1,2,new Fraction(1,2).reduce());
        assertFraction(3,7,new Fraction(12,28).reduce());
        assertFraction(1,5,new Fraction(2,10).reduce());
    }

    @Test
    public void testToString() {
        assertEquals("0",new Fraction(0,2).toString());
        assertEquals("0",new Fraction(0,13).toString());
        assertEquals("12",new Fraction(12,1).toString());
        assertEquals("42",new Fraction(42,1).toString());
        assertEquals("42/12",new Fraction(42,12).toString());
        assertEquals("11/23",new Fraction(11,23).toString());
    }

    @Test
    public void testByteValue() {
        fail();
    }

    @Test
    public void testDoubleValue() {
        // TODO (GJ2DDJ)
        fail();
    }

    @Test
    public void testFloatValue() {
        // TODO (GJ2DDJ)
        fail();
    }

    @Test
    public void testIntValue() {
        // TODO (I462V2)
        fail();
    }

    @Test
    public void testLongValue() {
        // TODO (I462V2)
        fail();
    }

    @Test
    public void testShortValue() {
        fail();
    }

    @Test
    public void testClone() {
        // TODO (E6D5JN)
        fail();
    }

    @Test
    public void testHashCode() {
        // TODO (CQI3O7)
        fail();
    }

    @Test
    public void testEquals() {
        // TODO (D06M5U)
        fail();
    }

}
