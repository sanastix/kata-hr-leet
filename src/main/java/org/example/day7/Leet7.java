package org.example.day7;

public class Leet7 {

    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int diff = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) buyPrice = prices[i];
            diff = Math.max(diff, prices[i] - buyPrice);
        }
        return diff;
    }

}
