package com.company;

public class NumberToWords {

    public static void numberToWords(int number) {
        int i = 0;
        int reverseNum = reverse(number);
        int digitCount = getDigitCount(number);
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            while (i != digitCount) {
                int lastDigit = reverseNum % 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reverseNum = reverseNum / 10;
                i++;
            }
        }
    }

    public static int reverse(int number) {
        int reverseNum = 0, remainder;

        while (number != 0) {
            remainder = number % 10;
            reverseNum = reverseNum * 10 + remainder;
            number = number / 10;
        }
        return reverseNum;
    }

    public static int getDigitCount(int number) {
        int digitCount = 0;
        if (number < 0) {
            return -1;
        } else {
            do {
                digitCount++;
                number = number / 10;
            } while (number != 0);
        }
        return digitCount;
    }
}
