package org.example.week5.day22;

public class Kata22 {

    public static String printerError(String s) {
        int errors = 0;
        String length = "/" + s.length();
        for (char c : s.toCharArray()) {
            if (c < 'a' || c > 'm') {
                errors++;
            }
        }
        return errors + length;
    }

}
