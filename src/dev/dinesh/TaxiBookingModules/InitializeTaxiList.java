package dev.dinesh.TaxiBookingModules;

import dev.dinesh.Taxi;

import java.util.TreeMap;

public class InitializeTaxiList {

    public void initializeTaxiList(int noOfTaxi, TreeMap<Integer, Taxi> taxiLists) {

        for (int i = 1; i <= noOfTaxi; i++) {
            taxiLists.put(i, new Taxi(i));
        }

    }
}
