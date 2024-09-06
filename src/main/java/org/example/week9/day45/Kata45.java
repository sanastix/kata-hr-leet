package org.example.week9.day45;

public class Kata45 {

    public static int roundToNext5(int number) {
        return (number % 5 == 0) ? number : number + (5 - number % 5) % 5;
    }

}
