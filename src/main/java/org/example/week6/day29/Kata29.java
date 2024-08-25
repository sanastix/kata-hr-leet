package org.example.week6.day29;

import java.util.List;

public class Kata29 {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int result = 0;
        int length = binary.size();
        for (int i = 0; i < length; i++) {
            //Multiply each bit by 2 raised to the power of its position from the right
            result += (int) (binary.get(i) * Math.pow(2, length - 1 - i));
        }
        return result;
    }

}
