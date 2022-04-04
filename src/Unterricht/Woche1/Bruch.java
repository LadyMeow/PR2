package Unterricht.Woche1;

public class Bruch {
    private int numerator;
    private int denominator;
    private static int bruchZaehler = 0;

    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        bruchZaehler++;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {
        return ((double)numerator / denominator);
    }

    public void print() {
        System.out.println(numerator + " / " + denominator);
    }

    public Bruch multiplicate(Bruch b2) {
        Bruch neuerBruch = new Bruch(numerator, denominator);
        neuerBruch.numerator *= b2.numerator;
        neuerBruch.denominator *= b2.denominator;

        return neuerBruch;
    }

    public Bruch multiplicate(Bruch b2, Bruch b3) { // method overloading
        Bruch neuerBruch = new Bruch(numerator, denominator);
        neuerBruch.numerator *= b2.numerator * b3.numerator;
        neuerBruch.denominator *= b2.denominator * b3.denominator;

        return neuerBruch;
    }

    public Bruch add(Bruch b2) {
        Bruch neuerBruch = new Bruch(numerator, denominator);
        if (neuerBruch.denominator != b2.denominator) {
            neuerBruch.denominator *= b2.denominator;
            neuerBruch.numerator *= b2.numerator;
            b2.denominator *= neuerBruch.denominator;
            b2.numerator *= neuerBruch.numerator;
        }
        neuerBruch.numerator += b2.numerator;

        return neuerBruch;
    }

    public static int getNrFractions() {
        return bruchZaehler;
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }

}
