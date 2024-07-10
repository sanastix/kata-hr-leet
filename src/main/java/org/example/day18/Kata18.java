package org.example.day18;

public class Kata18 {

    public int GetSum(int a, int b){
        if (a == b) return a;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int n = max - min + 1;
        return n * (min + max) / 2;
    }

}
