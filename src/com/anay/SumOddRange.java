package com.anay;

public class SumOddRange {
    public static boolean isOdd(int num) {
        if (num < 0) {
            return false;
        } else {
            if (num % 2 != 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int sumOdd(int a, int b) {
        if ((a <= 0) || (b <= 0)) {
            return -1;
        } else {
            if (b < a) {
                return -1;
            }
            int sum = 0;
            for (int i = a; i <= b; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
            return sum;
        }
    }
}
