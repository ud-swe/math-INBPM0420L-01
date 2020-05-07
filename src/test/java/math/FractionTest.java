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
        // TODO (Z79CCJ)
        fail();
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
        fail();
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
        // TODO (E8X6WL)
        fail();
    }

    @Test
    public void testToString() {
        // TODO (AW4Q0K)
        fail();
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
