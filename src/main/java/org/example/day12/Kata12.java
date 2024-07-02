package org.example.day12;

public class Kata12 {

    public int squareDigits(int n) {
        StringBuilder result = new StringBuilder();
        String str = Integer.toString(n);
        for (char c : str.toCharArray()) {
            int digit = Character.getNumericValue(c);
            result.append(digit * digit);
        }
        return Integer.parseInt(result.toString());
    }

}
