package org.example.week5.day21;

public class Kata21 {

    public static long findNextSquare(long sq) {
        long sqrt = (long) Math.sqrt(sq);
        if (sqrt * sqrt == sq) {
            long nextSqrt = sqrt + 1;
            return nextSqrt * nextSqrt;
        } else {
            return -1;
        }
    }

}
