package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {
    @Test
    void shouldThrowErrorIfDenominatorIsZero() {
        assertThrows(IllegalArgumentException.class, () -> new Fraction(2,0));
    }

    @Test
    void shouldCreateFractionWhenBothNumbersArePositive() {
        Fraction fraction = new Fraction(1, 4);

        assertEquals(fraction.getNumerator(), 1);
        assertEquals(fraction.getDenominator(), 4);
    }


    @Test
    void shouldCreatePositiveFractionWhenBothNumbersAreNegative() {
        Fraction fraction = new Fraction(-1, -4);

        assertEquals(fraction.getNumerator(), 1);
        assertEquals(fraction.getDenominator(), 4);
    }

    @Test
    void shouldCreateFractionWithNegativeNumeratorWhenOnlyGivenNumeratorIsNegative() {
        Fraction fraction = new Fraction(-1, 4);

        assertEquals(fraction.getNumerator(), -1);
        assertEquals(fraction.getDenominator(), 4);
    }

    @Test
    void shouldCreateFractionWithNegativeNumeratorWhenOnlyGivenDenominatorIsNegative() {
        Fraction fraction = new Fraction(1, -4);

        assertEquals(fraction.getNumerator(), -1);
        assertEquals(fraction.getDenominator(), 4);
    }
}