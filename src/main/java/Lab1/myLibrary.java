package Lab1;

/* Comp3111LEx\Lab1\myLibrary.java
my Java library consists of 2 mathematical functions */

public class myLibrary {
    public static int Power(int base, int exponent) {
        if (exponent == 1)
            return base * exponent;
        else
            return base * Power(base, exponent - 1);
    }

    public static int Factorial(int n) {
        if (n == 1) return 1;
        else return n * Factorial(n - 1);
    }
}
