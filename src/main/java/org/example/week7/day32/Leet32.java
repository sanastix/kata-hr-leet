package org.example.week7.day32;

import java.util.Arrays;

public class Leet32 {

    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int cost = prices[0] + prices[1];
        return (money >= cost) ? (money - cost) : money;
    }

}
