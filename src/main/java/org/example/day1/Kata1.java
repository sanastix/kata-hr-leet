package org.example.day1;

public class Kata1 {

    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        int catYearsPerHumanYear = 4;
        int dogYearsPerHumanYear = 5;
        int catYearsResult = getHumanAge(catYears, catYearsPerHumanYear);
        int dogYearsResult = getHumanAge(dogYears, dogYearsPerHumanYear);
        return new int[]{catYearsResult, dogYearsResult};
    }

    private static int getHumanAge(int petYears, int yearsPerHuman) {
        int humanAge;
        if (petYears < 15) {
            humanAge = 0;
        } else if (petYears < 24) {
            humanAge = 1;
        } else {
            humanAge = 2 + (petYears - 24) / yearsPerHuman;
        }
        return humanAge;
    }

}
