package org.example.week6.day27;

public class Kata27 {

    public static boolean isTriangle(int a, int b, int c){
        return a > 0 && b > 0 && c > 0 &&
                (a + b > c) &&
                (a + c > b) &&
                (b + c > a);
    }

}
