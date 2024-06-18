package org.example.day2;

public class Kata2 {

    public static int getCount(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (char v : vowels) {
                if (c == v) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

}
