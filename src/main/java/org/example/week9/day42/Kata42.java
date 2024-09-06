package org.example.week9.day42;

public class Kata42 {

    public static int nbDig(int n, int d) {
        int count = 0;
        String digit = Integer.toString(d);
        for (int i = 0; i <= n; i++) {
            int square = i * i;
            String squareStr = Integer.toString(square);
            for (char c : squareStr.toCharArray()) {
                if (Character.toString(c).equals(digit)) {
                    count++;
                }
            }
        }
        return count;
    }


}
