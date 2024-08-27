package org.example.day33;

public class Leet33 {

    public String maximumOddBinaryNumber(String s) {
        int countOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                countOnes++;
            }
        }
        int countZeros = s.length() - countOnes;
        return "1".repeat(countOnes - 1) +
                "0".repeat(countZeros) +
                "1";
    }

}
