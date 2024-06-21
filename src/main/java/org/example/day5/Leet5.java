package org.example.day5;

public class Leet5 {

    public boolean backspaceCompare(String s, String t) {
        int i = getIndex(s, s.length() - 1);
        int j = getIndex(t, t.length() - 1);
        while (i >= 0 && j >= 0) {
            if (s.charAt(i) != t.charAt(j)) return false;
            i = getIndex(s, i - 1);
            j = getIndex(t, j - 1);
        }
        if (i == -1 && j == -1) return true;
        return false;
    }

    private int getIndex(String str, int ind) {
        while (ind >= 0 && str.charAt(ind) == '#') {
            int count = 1;
            ind--;
            while (ind >= 0 && count > 0) {
                count += str.charAt(ind) == '#' ? 1 : -1;
                ind--;
            }
        }
        return ind;
    }

}
