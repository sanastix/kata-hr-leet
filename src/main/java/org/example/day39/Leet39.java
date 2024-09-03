package org.example.day39;

public class Leet39 {

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            // n & 1: This operation checks if the least significant bit of n is 1. If it is, count is incremented
            count += n & 1;
            // This operation shifts n one bit to the right
            n >>>= 1;
        }
        return count;
    }

}
