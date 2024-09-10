package org.example.week10.day48;

public class Kata48 {

    public static boolean smallEnough(int[] a, int limit) {
        for (int num : a) {
            if (num > limit) {
                return false;
            }
        }
        return true;
    }

}
