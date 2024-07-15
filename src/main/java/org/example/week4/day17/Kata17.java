package org.example.week4.day17;

public class Kata17 {

    public static String maskify(String str) {
        if (str == null || str.length() < 5) return str;
        return "#".repeat(str.length() - 4) + str.substring(str.length() - 4);
    }

}
