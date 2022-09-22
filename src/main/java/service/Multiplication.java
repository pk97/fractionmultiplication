package service;

import model.Fraction;
import utility.Utils;

public class Multiplication {

    public Fraction multiplyFractions(Fraction a, Fraction b) {
        Fraction product = new Fraction(a.getNumerator() * b.getNumerator(),
                b.getDenominator() * a.getDenominator());

        return  reduced(product);
    }

    private Fraction reduced(Fraction x) {
        int gcd = Utils.gcd(x.getNumerator(), x.getDenominator());

        return  new Fraction(x.getNumerator() / gcd, x.getDenominator() / gcd);
    }
}
