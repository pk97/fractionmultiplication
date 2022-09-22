package utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    @Test
    void GCDShouldReturnGCDOfGivenPositiveIntegers() {
        int gcd = Utils.gcd(10, 15);

        assertEquals(5, gcd);
    }

    @Test
    void GCDShouldReturnGCDWhenANumberIs0() {
        int gcd = Utils.gcd(10, 0);

        assertEquals(10, gcd);
    }

    @Test
    void GCDShouldReturn0WhenBothAre0() {
        int gcd = Utils.gcd(0, 0);

        assertEquals(0, gcd);
    }
    @Test
    void GCDShouldReturnNumberWhenOneNumberis1() {
        int gcd = Utils.gcd(10, 1);

        assertEquals(1, gcd);
    }

    @Test
    void GCDShouldReturnNumberWhenOneNumberisNegative() {
        int gcd = Utils.gcd(10, -5);
        assertEquals(5, gcd);
    }

    @Test
    void GCDShouldReturnPositiveWhenOneNumberisNegative() {
        int gcd = Utils.gcd(-10, 5);

        assertEquals(5, gcd);
    }


    @Test
    void GCDShouldReturnPositiveWhenNumbersAreNegative() {
        int gcd = Utils.gcd(-24, -30);

        assertEquals(6, gcd);
    }
}