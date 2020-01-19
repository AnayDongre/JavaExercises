package com.anay;

public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10) || (b < 10) || (a > 99) || (b > 99)) {
            return false;
        } else {
            int n1d1 = a / 10;
            int n1d2 = a % 10;
            int n2d1 = b / 10;
            int n2d2 = b % 10;
            if ((n1d1 == n2d1) || (n1d1 == n2d2) || (n1d2 == n2d1) || (n1d2 == n2d2)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
