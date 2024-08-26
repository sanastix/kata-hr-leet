package org.example.day32;

public class Kata32 {

    public static String reverseWords(final String original){
        String[] words = original.split("(?<=\\s)|(?=\\s)");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty() && !word.trim().isEmpty()) {
                result.append(new StringBuilder(word).reverse());
            } else {
                result.append(word);
            }
        }
        return result.toString();
    }

}
