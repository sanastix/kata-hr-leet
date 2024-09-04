package org.example.week8.day37;

public class Kata37 {

    public static int dontGiveMeFive(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (!String.valueOf(i).contains("5")) {
                count++;
            }
        }
        return count;
    }

}
