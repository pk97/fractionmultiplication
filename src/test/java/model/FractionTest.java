package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {
    @Test
    void shouldThrowErrorIfDenominatorIsZero() {
        assertThrows(IllegalArgumentException.class, () -> new Fraction(2,0));
    }
}