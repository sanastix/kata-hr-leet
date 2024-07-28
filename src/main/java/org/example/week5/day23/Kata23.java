package org.example.week5.day23;

public class Kata23 {

    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }

}
