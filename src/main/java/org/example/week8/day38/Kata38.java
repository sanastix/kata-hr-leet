package org.example.week8.day38;

public class Kata38 {

    static int stray(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result ^= number;
        }
        return result;
    }

}
