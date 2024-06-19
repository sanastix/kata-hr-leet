package org.example.day3;

public class Kata3 {

    public static String disemvowel(String str) {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (vowels.indexOf(c) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }

}
