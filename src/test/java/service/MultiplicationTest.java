package service;

import model.Fraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MultiplicationTest {

    @Test
    void ShouldMultiply2Fractions() {
        Multiplication multiplication = new Multiplication();
        Fraction a = new Fraction(1,2);
        Fraction b = new Fraction(3,5);

        Fraction result = multiplication.multiplyFractions(a,b);

        assertEquals(result,new Fraction(3,10) );
    }

}
