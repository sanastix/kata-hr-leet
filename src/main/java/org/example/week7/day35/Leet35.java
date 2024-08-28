package org.example.week7.day35;

public class Leet35 {

    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust for zero-based index
            int remainder = columnNumber % 26;
            char currentChar = (char) (remainder + 'A');
            result.insert(0, currentChar);
            columnNumber /= 26;
        }

        return result.toString();
    }

}
