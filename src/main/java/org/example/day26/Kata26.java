package org.example.day26;

public class Kata26 {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        double currPopulation = p0;
        double growthRate = percent / 100.0;
        while (currPopulation < p) {
            currPopulation += (int) (currPopulation * growthRate) + aug;
            years++;
        }
        return years;
    }

}
