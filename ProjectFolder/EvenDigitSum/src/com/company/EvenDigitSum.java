package com.company;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0) return -1;
        while (number != 0) {
            int digit = number % 10;
            if (number % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        } return sum;
    }
}
