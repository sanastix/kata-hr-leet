package org.example.day8;

public class Kata8 {

    public static String getMiddle(String word) {
        int n = word.length();
        return (n % 2 == 0) ? word.substring(n / 2 - 1, n / 2 + 1) : String.valueOf(word.charAt(n / 2));
    }

}
