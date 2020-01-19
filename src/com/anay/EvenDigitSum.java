package com.anay;

public class EvenDigitSum {
    public static int getEvenDigitSum(int num) {
        if (num < 0) {
            return -1;
        } else {
            int sum = 0;
            int dig = 0;
            while (num != 0) {
                dig = num % 10;
                if (dig % 2 == 0) {
                    sum += dig;
                }
                num = num / 10;
            }
            return sum;
        }
    }
}
