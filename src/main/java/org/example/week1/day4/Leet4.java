package org.example.week1.day4;

import java.util.Arrays;

public class Leet4 {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ch = 0, co = 0;
        while (ch < g.length && co < s.length) {
            if (s[co] >= g[ch]) {
                ch++;
            }
            co++;
        }
        return ch;
    }

}
