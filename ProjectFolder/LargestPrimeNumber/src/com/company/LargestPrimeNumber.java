package com.company;

public class LargestPrimeNumber {

    public static int getLargestPrime(int number) {
        int largestPrime = 2;
        if (number < 2) {
            return -1;
        }
        for (int i = largestPrime; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                largestPrime = i;
                i--;
            }
        }
        return largestPrime;
    }
}
