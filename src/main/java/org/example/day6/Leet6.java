package org.example.day6;

public class Leet6 {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return makeRepresentation(word1).equals(makeRepresentation(word2));
    }

    private String makeRepresentation(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }
        return sb.toString();
    }

}
