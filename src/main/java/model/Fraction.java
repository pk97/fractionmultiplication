package model;

import java.util.Objects;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0)
            throw new IllegalArgumentException("denominator can not be zero");

        this.numerator = numerator;
        this.denominator = denominator;

        transformFraction();
    }

    /** transformFraction will simplify negative fractions.
     * Fraction will be positive if both numerator and denominator are negative.
     * Negative sign will move in numerator if numerator is positive and denominator negative.
     */
    private  void transformFraction() {
        if (this.numerator < 0 && this.denominator < 0)
        {
            this.numerator = Math.abs(this.numerator);
            this.denominator = Math.abs(this.denominator);
        }
        if (this.denominator < 0 && this.numerator > 0) {
            this.numerator = this.numerator*-1;
            this.denominator = Math.abs(this.denominator);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }


    @Override
    public String toString() {
        return "Fraction{" +
                numerator +
                "/" + denominator +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

}
