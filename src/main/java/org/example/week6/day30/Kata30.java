package org.example.week6.day30;

import java.util.ArrayList;

public class Kata30 {

    public static int countPassengers(ArrayList<int[]> stops) {
        int passengersOnBus = 0;
        for (int[] stop : stops) {
            passengersOnBus += stop[0];
            passengersOnBus -= stop[1];
        }
        return passengersOnBus;
    }

}
