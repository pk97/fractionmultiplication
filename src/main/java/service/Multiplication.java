package service;

import model.Fraction;

public class Multiplication {

    public Fraction multiplyFractions(Fraction a, Fraction b) {
        return  new Fraction(a.getNumerator() * b.getNumerator(),
                b.getDenominator() * a.getDenominator());
    }
}
