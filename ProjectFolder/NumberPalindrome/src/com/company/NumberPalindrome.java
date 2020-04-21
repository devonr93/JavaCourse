package com.company;

public class NumberPalindrome {

        public static boolean isPalindrome (int number) {

            int reverse = 0;
            int originalNumber = number;
            int lastDigit;

            while (number != 0) {
                lastDigit = number % 10;
                reverse = reverse * 10;
                reverse += lastDigit;
                number /= 10;
            }
            return originalNumber == reverse;
        }
    }
