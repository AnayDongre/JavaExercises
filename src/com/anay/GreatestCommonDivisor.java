package com.anay;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int a, int b) {
        if ((a < 10) || (b < 10)) {
            return -1;
        } else {
            int min = 1;
            if (a < b) {
                min = a;
            } else {
                min = b;
            }
            int i = 1;
            int GCD = 0;
            while (i <= min) {
                if ((a % i == 0) && (b % i == 0)) {
                    GCD = i;
                }
                i = i + 1;
            }
            return GCD;
        }
    }
}
