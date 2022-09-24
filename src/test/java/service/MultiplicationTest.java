package service;

import model.Fraction;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

    @Test
    void ShouldMultiply2PositiveFractions() {
        Multiplication multiplication = new Multiplication();
        Fraction a = new Fraction(1,2);
        Fraction b = new Fraction(3,5);

        Fraction result = multiplication.multiplyFractions(a,b);

        assertEquals(new Fraction(3,10), result);
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
    void ShouldMultiply2FractionsWhenBothFractionsAreNegative() {
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

    @Test
    void shouldMultiplyFractionsInParallel() {
        List<Fraction> list1 =  Arrays.asList(
                new Fraction(1,1),
                new Fraction(4,6),
                new Fraction(2,7)
        );


        List<Fraction> list2 =  Arrays.asList(
                new Fraction(1,1),
                new Fraction(4,6),
                new Fraction(2,5)
                );

        Multiplication multiplication = new Multiplication();

        List<Fraction> collect = IntStream.range(0, list1.size()).parallel()
                .mapToObj(i -> multiplication.multiplyFractions(list1.get(i), list2.get(i)))
                .collect(Collectors.toList());

        assertEquals( new Fraction(1,1), collect.get(0));
        assertEquals( new Fraction(4,9), collect.get(1));
        assertEquals( new Fraction(4,35), collect.get(2));
    }
}
