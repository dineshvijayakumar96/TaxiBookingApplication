package dev.dinesh;

import java.util.ArrayList;
import java.util.List;

public class Taxi implements Comparable<Taxi> {

    private final int taxiID;
    private char currentSpot;
    private int freeTime;
    private int totalEarnings;
    private final List<TripDetails> trips;

    public Taxi(int taxiID) {

        this.taxiID = taxiID;
        currentSpot = 'A';
        freeTime = 6;
        totalEarnings = 0;
        trips = new ArrayList<>();
    }

    public void allocateTaxi(char currentSpot, int freeTime, int costOfTrip, TripDetails tripDetails) {

        this.currentSpot = currentSpot;
        this.freeTime = freeTime;
        this.totalEarnings += costOfTrip;
        this.trips.add(tripDetails);
    }

    public int getTaxiID() {
        return taxiID;
    }

    public char getCurrentSpot() {
        return currentSpot;
    }

    public int getFreeTime() {
        return freeTime;
    }

    public int getTotalEarnings() {
        return totalEarnings;
    }

    public List<TripDetails> getTrips() {
        return trips;
    }

    @Override
    public int compareTo(Taxi other) {
        return Integer.compare(this.totalEarnings, other.totalEarnings);
    }
}
