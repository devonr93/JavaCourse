package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if(value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

//        int switchValue = 3;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case5:
//            System.out.println("Was a 3, or a 4, or a 5");
//            break;
//
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }
        char charValue = 'D';

        switch (charValue) {
            case 'A':
                System.out.println("A was found!");
                break;
            case 'B':
                System.out.println("B was found!");
                break;
            case 'C':case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;

            default:
                System.out.println("did not contain: A-E");
                break;
        }
        String month = "january";
        switch(month.toLowerCase()) {
            case "may":
                System.out.println("May");
                break;
            case "june":
                System.out.println("Jun");
                break;
            case "july":
                System.out.println("Jul");
                break;
            default:
                System.out.println("Not Sure");
        }
    }
}
