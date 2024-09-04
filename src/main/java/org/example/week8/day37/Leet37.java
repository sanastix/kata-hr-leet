package org.example.week8.day37;

public class Leet37 {

    public int countOdds(int low, int high) {
        if (low % 2 == 0) {
            low++;
        }
        if (high % 2 == 0) {
            high--;
        }
        if (low > high) {
            return 0;
        }
        return (high - low) / 2 + 1;
    }

}
