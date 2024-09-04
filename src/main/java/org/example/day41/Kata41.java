package org.example.day41;

public class Kata41 {

    public static long breakChocolate(long n, long m) {
        if (n <= 0 || m <= 0) {
            return 0;
        }
        return n * m - 1;
    }

}
