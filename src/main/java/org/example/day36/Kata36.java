package org.example.day36;

import java.util.Arrays;

public class Kata36 {

    public static int[] minMax(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        return new int[]{min, max};
    }

}
