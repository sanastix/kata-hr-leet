package org.example.day6;

import java.util.Arrays;

public class Kata6 {

    public static int sortDesc(final int num) {
        char[] arr = Integer.toString(num).toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        return Integer.parseInt(sb.toString());
    }

}
