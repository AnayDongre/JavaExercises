package com.anay;

public class LargestPrime {
    public static int getLargestPrime(int num){
        int LP = 2;
        int i = 2;
        while(i <= num){
            if(num%i == 0){
                if(isPrime(i)){
                    LP = i;
                }
            }
            i = i + 1;
        }
        return LP;
    }

    public static boolean isPrime(int num){
        if (num < 2){
            return false;
        }else if(num == 2){
            return true;
        }
        else {
            int i = 2;
            while(i < num){
                if(num%i == 0){
                    return false;
                }
                i = i+1;
            }
            return true;
        }
    }
}


