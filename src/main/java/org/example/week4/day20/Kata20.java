package org.example.week4.day20;

import java.util.*;

public class Kata20 {

    public static String longest (String s1, String s2) {
        String str = s1 + s2;
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        List<Character> list = new ArrayList<>(set);
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }
        return sb.toString();
    }

}
