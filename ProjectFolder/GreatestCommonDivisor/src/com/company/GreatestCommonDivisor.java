package com.company;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        if ((first < 10) || (second < 10)) {
            return -1;
        }

        int divisor = 0;

        for(int a = 1; a <= first/2; a++) {

            if((first % a == 0) && (second % a == 0)) {
                divisor = a;
            }

        }

        return divisor;

    }
}
