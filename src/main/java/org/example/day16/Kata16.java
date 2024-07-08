package org.example.day16;

public class Kata16 {

    public static String order(String words) {
        if (words == null || words.isEmpty()) return "";
        String[] arr = words.split(" ");
        String[] result = new String[arr.length];
        int index = 0;
        for (String word : arr) {
            for (int j = word.length() - 1; j >= 0; j--) {
                if (Character.isDigit(word.charAt(j))){
                    index = Character.getNumericValue(word.charAt(j));
                }
            }
            result[index - 1] = word;
        }
        return String.join(" ", result);
    }

}
