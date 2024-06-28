package org.example.week2.day10;

public class Kata10 {

    public static boolean isSquare(int n) {
        if (n < 0) return false;
        int square = (int) Math.sqrt(n);
        return square * square == n;
    }

}
