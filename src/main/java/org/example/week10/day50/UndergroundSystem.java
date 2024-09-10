package org.example.week10.day50;

import java.util.HashMap;
import java.util.Map;

public class UndergroundSystem {

    private Map<Integer, CheckInData> checkIns;
    private Map<String, RouteData> travelTimes;

    public UndergroundSystem() {
        checkIns = new HashMap<>();
        travelTimes = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckInData(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        // Get the check-in information for this customer
        CheckInData checkInData = checkIns.get(id);

        // Create the route key (startStation -> endStation)
        String routeKey = checkInData.stationName + "->" + stationName;

        // Calculate the time spent on this journey
        int travelTime = t - checkInData.time;

        // Update the travel time for this route
        RouteData routeData = travelTimes.getOrDefault(routeKey, new RouteData());
        routeData.totalTime += travelTime;
        routeData.tripCount += 1;

        // Put the updated route data back into the map
        travelTimes.put(routeKey, routeData);

        // Remove the check-in record as the customer has checked out
        checkIns.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        // Get the route data for the given station pair
        String routeKey = startStation + "->" + endStation;
        RouteData routeData = travelTimes.get(routeKey);

        // Calculate and return the average time
        return (double) routeData.totalTime / routeData.tripCount;
    }

}

// Class to store check-in information
class CheckInData {
    String stationName;
    int time;

    public CheckInData(String stationName, int time) {
        this.stationName = stationName;
        this.time = time;
    }
}

// Class to store travel time and trip count between station pairs
class RouteData {
    int totalTime;
    int tripCount;

    public RouteData() {
        this.totalTime = 0;
        this.tripCount = 0;
    }
}