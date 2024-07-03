package org.example.day13;

public class Kata13 {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase == "") return null;
        String[] strArr = phrase.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].substring(0,1).toUpperCase() + strArr[i].substring(1).toLowerCase();
        }
        return String.join(" ", strArr);
    }

}
