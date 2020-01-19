package com.anay;

public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c) {
        return (isTeen(a) || isTeen(b) || isTeen(c));
    }

    public static boolean isTeen(int a) {
        boolean aa = (a >= 13 && a <= 19);
        return aa;
    }
}
