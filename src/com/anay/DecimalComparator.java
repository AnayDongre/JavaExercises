package com.anay;

import java.math.BigDecimal;
//import java.math.RoundingMode;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        BigDecimal aa = new BigDecimal(num1);
        BigDecimal bb = new BigDecimal(num2);
        aa.setScale(4);
        return aa.equals(bb);
    }
}

