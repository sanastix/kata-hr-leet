package org.example.week1.day5;

public class Kata5 {

    public static String highAndLow(String numbers) {
        String[] arr = numbers.split(" ");
        if (arr.length == 1) return arr[0] + " " + arr[0];
        int max = Integer.parseInt(arr[0]);
        int min = max;
        int curr;
        for (int i = 1; i < arr.length; i++) {
            curr = Integer.parseInt(arr[i]);
            if (curr > max) {
                max = curr;
            }
            if (curr < min) {
                min = curr;
            }
        }
        return max + " " + min;
    }

}
