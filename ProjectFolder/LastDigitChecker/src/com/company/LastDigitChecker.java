package com.company;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) {
            int aLD = a % 10;
            int bLD = b % 10;
            int cLD = c % 10;

            return aLD == bLD || aLD == cLD || bLD == cLD;
        }

        return false;
    }

    public static boolean isValid (int n) {
        return n >= 10 && n <= 1000;
    }

}
