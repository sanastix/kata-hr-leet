package org.example.week8.day40;

public class Kata40 {

    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int years = 0;
        while (principal < desired) {
            double interestEarned = principal * interest;
            double afterTaxInterest = interestEarned * (1 - tax);
            principal += afterTaxInterest;
            years++;
        }
        return years;
    }

}
