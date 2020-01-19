package com.anay;

public class FactorPrinter {
    public static void printFactors(int num) {
        if (num < 1) {
            System.out.println("Invalid Value");
        } else {
            int i = 1;
            while (i <= num) {
                if (num % i == 0) {
                    System.out.println(i);
                }
                i = i + 1;
            }
        }
    }
}
