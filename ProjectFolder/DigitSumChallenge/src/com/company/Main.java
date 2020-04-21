package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in the number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in the number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in the number 10 is " + sumDigits(10));
        System.out.println("The sum of the digits in the number 32123 is " + sumDigits(32123));


    }

    private static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }

        int sum = 0;

//        355 / 10 = 35 -> 35 * 10 = 350 -> 355 - 350 = 5
//        125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while(number > 0) {
//            extract least significant digit
            int digit = number % 10;
            sum += digit;
//            drop least significant digit
            number /= 10;
        }

        return sum;
    }
}
