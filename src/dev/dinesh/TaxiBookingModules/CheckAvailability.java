package dev.dinesh.TaxiBookingModules;

import dev.dinesh.Taxi;

import java.util.Map;
import java.util.TreeMap;

public class CheckAvailability {

    public int checkAvailability(int pickupPointIndex, int dropPointIndex, int pickupTime, TreeMap<Integer, Taxi> taxiLists) {

        if (pickupPointIndex == -1 || dropPointIndex == -1) {
            return -1;
        }

        int availableTaxi = 0;
        int minDistance = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Taxi> entry : taxiLists.entrySet()) {
            Taxi taxi = entry.getValue();

            if (taxi.getFreeTime() <= pickupTime) {
                int distance = Math.abs(PointIndex.pointIndex(taxi.getCurrentSpot()) - pickupPointIndex);

                if (distance < minDistance) {
                    minDistance = distance;
                    availableTaxi = entry.getKey();
                }
            }
        }

        return availableTaxi;
    }
}
