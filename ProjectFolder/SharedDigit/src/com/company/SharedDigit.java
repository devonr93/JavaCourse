package com.company;

public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {
        if((num1 >= 10) && (num2 >= 10) && (num1 <= 99) && (num2 <= 99))
        while(num1 > 0) {
            int p = num1 % 10;
            if(num2 > 0) {
                int zz=num2;
                while(zz > 0) {
                    int z = zz % 10;
                    if(z == p) {
                        return true;
                    }
                    zz = zz / 10;
                }
                num1 = num1 / 10;
            }
        }
        return false;
    }
}
