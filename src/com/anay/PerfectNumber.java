package com.anay;

public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        if (num < 1) {
            return false;
        } else {
            int i = 1;
            int sum = 0;
            while (i < num) {
                if (num % i == 0) {
                    sum = sum + i;
                }
                i = i + 1;
            }
            if (sum == num) {
                return true;
            } else {
                return false;
            }
        }
    }
}
