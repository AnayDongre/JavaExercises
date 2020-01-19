package com.anay;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mbs = kiloBytes / 1024;
            int kbs = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mbs + " MB and " + kbs + " KB");
        }
    }
}
