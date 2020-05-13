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
        assertFraction(9, 4, new Fraction(3, 2).pow(2));
        assertFraction(1, 1, new Fraction(3, 2).pow(0));
        assertFraction(2, 3, new Fraction(3, 2).pow(-1));
        assertFraction(-2, 3, new Fraction(-3, 2).pow(-1));
    }

    @Test
    public void testAddFraction() {
        // TODO (XU4JAD)
        Fraction a = new Fraction(1,3);
        Fraction b = new Fraction(3,7);
        assertFraction(16,21,a.add(b));

        a = new Fraction(0,6);
        b = new Fraction(2,13);
        assertFraction(2,13, a.add(b));

        a = new Fraction(10,20);
        b = new Fraction(11,20);
        assertFraction(21,20, a.add(b));

        a = new Fraction(1,2);
        //b = a.clone();  :(
        b = new Fraction(1,2);
        assertFraction(2,2,a.add(b));

        a = new Fraction(2,-5);
        b = new Fraction(6,3);
        assertFraction(24,15,a.add(b));


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
        assertFraction(8,35, new Fraction(2,5).multiply(new Fraction(4, 7)));
        assertFraction(21,8, new Fraction(3,2).multiply(new Fraction(7,4)));
        assertFraction(8,21, new Fraction(2,3).multiply(new Fraction(4,7)));
        assertFraction(24,100, new Fraction(4,10).multiply(new Fraction(6,10)));
        assertFraction(9,64, new Fraction(3,8).multiply(new Fraction(3,8)));
    }

    @Test
    public void testReciprocal() {
        // TODO (N1SBRH)
        fail();
    }

    @Test
    public void testAbs() {
        assertFraction(14, 2, new Fraction(-14, 2).abs());
        assertFraction(14, 2, new Fraction(14, -2).abs());
        assertFraction(14, 2, new Fraction(-14,-2).abs());
        assertFraction(14, 2, new Fraction(14, 2).abs());
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
        Fraction fraction = new Fraction(1,3);
        Fraction clone = (Fraction) fraction.clone();
        assertEquals(3, clone.getDenominator());
        assertEquals(1, clone.getNumerator());
    }

    @Test
    public void testHashCode() {
        // TODO (CQI3O7)
        fail();
    }

    @Test
    public void testEquals() {
        // TODO (D06M5U)
        Fraction f = new Fraction(3,4);
        assertTrue(f.equals(f));
        assertTrue(f.equals(new Fraction(3,4)));
        assertFalse(f.equals(null));
        assertFalse(f.equals(new Fraction(6,8)));
        assertFalse(f.equals(new Fraction(3,5)));
        assertFalse(f.equals(new Fraction(5,4)));
    }

}
