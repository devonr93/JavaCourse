package com.company;

public class Main {

    public static void main(String[] args) {
	byte myByteValue = 50;
	short myShortValue = 5462;
	int myIntValue = 84655;
	long myLongTotal = 50000L + 10L * (myByteValue + myShortValue + myIntValue);
		System.out.println("The total is: " + myLongTotal);
    }
}
