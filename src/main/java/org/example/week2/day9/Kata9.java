package org.example.week2.day9;

public class Kata9 {

    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            sb.append(Character.toUpperCase(c));
            for (int j = 0; j < i; j++) {
                sb.append(Character.toLowerCase(c));
            }
            if (i < s.length() - 1) {
                sb.append('-');
            }
        }
        return sb.toString();
    }

}
