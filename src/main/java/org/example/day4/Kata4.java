package org.example.day4;

public class Kata4 {

    public int squareDigits(int n) {
        String str = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        int digit, square;
        for (char c : str.toCharArray()) {
            digit = Character.getNumericValue(c);
            square = digit * digit;
            sb.append(square);
        }
        return Integer.parseInt(sb.toString());
    }

}
