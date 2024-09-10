package org.example.week10.day50;

public class Kata50 {

    public static String reverseLetter(final String str) {
        StringBuilder filtered = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                filtered.append(c);
            }
        }
        return filtered.reverse().toString();
    }

}
