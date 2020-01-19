package com.anay;

public class NumberPalindrome {
    public static boolean isPalindrome(int num) {
        if (num < 0) {
            num = Math.abs(num);
        }
        int originalNum = num;
        int newNum = 0;
        while (num != 0) {
            newNum = newNum * 10;
            newNum = newNum + num % 10;
            num = num / 10;
        }
//        System.out.println(originalNum + "  " + newNum);
        if (originalNum == newNum) {
            return true;
        } else {
            return false;
        }
    }
}
