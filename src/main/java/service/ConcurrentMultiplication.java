package service;

import model.Fraction;

public class ConcurrentMultiplication implements Runnable {
    private Fraction a;
    private Fraction b;
    private Fraction product;

    public ConcurrentMultiplication(Fraction a, Fraction b) {
    this.a = a;
    this.b = b;
    }

    @Override
    public void run() {
        Multiplication multiplication = new Multiplication();
        product = multiplication.multiplyFractions(a, b);
    }

    public Fraction getProduct() {
        return product;
    }

}
