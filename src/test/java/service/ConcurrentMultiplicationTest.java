package service;

import model.Fraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcurrentMultiplicationTest {

    @Test
    void shouldMultiplyFractionsInParallel() {
        Fraction a = new Fraction(1,2);
        Fraction b = new Fraction(3,2);

        ConcurrentMultiplication concurrentMultiplication = new ConcurrentMultiplication(a, b);

        Thread t = new Thread(concurrentMultiplication);

        t.start();

        assertEquals(concurrentMultiplication.getProduct(), new Fraction(3, 4));
    }
}