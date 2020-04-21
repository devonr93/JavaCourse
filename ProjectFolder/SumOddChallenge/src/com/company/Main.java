package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isOdd(11));
        System.out.println(sumOdd(1, 100));
    }

    public static boolean isOdd(int number) {
        return (number > 0 && number % 2 != 0);
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start < 1) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
