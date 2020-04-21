package com.company;

public class FirstAndLastDigit {

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) return -1;
        int firstDigit = 0;
        int secondDigit = 0;
        while(!(number == 0)) {
            firstDigit = number % 10;
            while (number != 0) {
                secondDigit = number % 10;
                number /= 10;
            }
            firstDigit = firstDigit + secondDigit;
        }
        return firstDigit;
    }
}
