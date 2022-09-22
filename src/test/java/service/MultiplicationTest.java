package service;

import model.Fraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

    @Test
    void ShouldMultiply2PositiveFractions() {
        Multiplication multiplication = new Multiplication();
        Fraction a = new Fraction(1,2);
        Fraction b = new Fraction(3,5);

        Fraction result = multiplication.multiplyFractions(a,b);

        assertEquals(result,new Fraction(3,10) );
    }

    @Test
    void ShouldMultiply2FractionsToProduceReducedForm() {
        Multiplication multiplication = new Multiplication();
        Fraction a = new Fraction(5,10);
        Fraction b = new Fraction(3,5);

        Fraction result = multiplication.multiplyFractions(a,b);

        assertEquals(result,new Fraction(3,10) );
    }

    @Test
    void ShouldMultiply2FractionsWhenFirstFractionIsNegative() {
        Multiplication multiplication = new Multiplication();
        Fraction a = new Fraction(-5,10);
        Fraction b = new Fraction(3,5);

        Fraction result = multiplication.multiplyFractions(a,b);

        assertEquals(result,new Fraction(-3,10) );
    }

    @Test
    void ShouldMultiply2FractionsWhenSecondFractionIsNegative() {
        Multiplication multiplication = new Multiplication();
        Fraction a = new Fraction(5,10);
        Fraction b = new Fraction(3,-5);

        Fraction result = multiplication.multiplyFractions(a,b);

        assertEquals(result,new Fraction(-3,10) );
    }

    @Test
    void ShouldMultiply2FractionsWhenBothFractionIsNegative() {
        Multiplication multiplication = new Multiplication();
        Fraction a = new Fraction(-5,10);
        Fraction b = new Fraction(3,-5);

        Fraction result = multiplication.multiplyFractions(a,b);

        assertEquals(result,new Fraction(3,10) );
    }

    @Test
    void ShouldMultiply2FractionsWhenOneIsZero() {
        Multiplication multiplication = new Multiplication();
        Fraction a = new Fraction(-5,10);
        Fraction b = new Fraction(0,-5);

        Fraction result = multiplication.multiplyFractions(a,b);

        assertEquals(result,new Fraction(0,1) );
    }

}
