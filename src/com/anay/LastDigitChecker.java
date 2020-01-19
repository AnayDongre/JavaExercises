package com.anay;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) {
            int aa = a % 10;
            int bb = b % 10;
            int cc = c % 10;
            if ((aa == bb) || (aa == cc) || (bb == cc)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isValid(int num) {
        if (num >= 10 && num <= 1000) {
            return true;
        } else {
            return false;
        }
    }
}
