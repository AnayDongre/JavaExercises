package com.anay;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int num) {
        if (num < 0) {
            return -1;
        } else {
            int originalNum = num;
            int newNum = 0;
            while (num != 0) {
                newNum = newNum * 10;
                newNum = newNum + num % 10;
                num = num / 10;
            }
            return (originalNum % 10 + newNum % 10);
        }

    }
}
