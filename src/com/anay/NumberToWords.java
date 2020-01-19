package com.anay;

public class NumberToWords {
    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversedNum = reverse(num);
            int originalDigits = getDigitCount(num);
            int reversedDigits = getDigitCount(reversedNum);
            String strNum = "";
            if (num == 0){
                System.out.println("Zero");
            }
            while (reversedNum != 0) {
                int dig = reversedNum % 10;
                strNum = strNum + " ";
                switch (dig) {
                    case 0:
                        strNum = strNum + "Zero";
                        break;
                    case 1:
                        strNum = strNum + "One";
                        break;
                    case 2:
                        strNum = strNum + "Two";
                        break;
                    case 3:
                        strNum = strNum + "Three";
                        break;
                    case 4:
                        strNum = strNum + "Four";
                        break;
                    case 5:
                        strNum = strNum + "Five";
                        break;
                    case 6:
                        strNum = strNum + "Six";
                        break;
                    case 7:
                        strNum = strNum + "Seven";
                        break;
                    case 8:
                        strNum = strNum + "Eight";
                        break;
                    case 9:
                        strNum = strNum + "Nine";
                        break;
                    default:
                        strNum = strNum + "";
                        break;
                }
                reversedNum = reversedNum/10;
            }
            if (originalDigits != reversedDigits){
                int diff = originalDigits-reversedDigits;
                while(diff != 0){
                    strNum = strNum + " Zero";
                    diff = diff - 1;
                }
            }
            System.out.println(strNum);
        }
    }

    public static int getDigitCount(int num) {
        if (num < 0) {
            return -1;
        } else {
            int count = 0;
            if (num == 0){
                return 1;
            }
            while (num != 0) {
                count = count + 1;
                num = num / 10;
            }
            return count;
        }
    }

    public static int reverse(int num) {
        int originalNum = num;
        int newNum = 0;
        while (num != 0) {
            newNum = newNum * 10;
            newNum = newNum + num % 10;
            num = num / 10;
        }
        return newNum;
    }
}
