package com.company;

public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (bigCount == 0 && smallCount >= goal) {
            return true;
        }
        else if (bigCount == 0 && smallCount < goal) {
            return false;
        }
        int checkG = ((goal / 5) <= (bigCount)) ? (goal -(5*(int)(goal / 5))) : (goal - (5 * bigCount));
        return checkG <= smallCount;
    }
}
