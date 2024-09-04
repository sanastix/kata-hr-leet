package org.example.week8.day40;

public class Leet40 {

    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // Shifting i right by one bit (i >> 1) is equivalent to dividing i by 2, which drops the least significant bit
            // If i is odd, i % 2 is 1; otherwise, it is 0
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }

}
