package org.example.day14;

public class Kata14 {

    public static int findShort(String s) {
        int result = s.length();
        String[] words = s.split(" ");
        for (String word : words) {
            if (word.length() < result) result = word.length();
        }
        return result;
    }

}
