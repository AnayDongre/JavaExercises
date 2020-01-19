package com.anay;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if ((5 * bigCount + smallCount >= goal) && (bigCount >= 0) && (smallCount >= 0) && (goal >= 0)) {
            int i = 0;
            while (i <= bigCount) {
                if ((goal - (i * 5) <= smallCount) && (smallCount >= goal%5)) {
                    return true;
                }
                i = i+1;
            }
        }
        return false;
    }
}
