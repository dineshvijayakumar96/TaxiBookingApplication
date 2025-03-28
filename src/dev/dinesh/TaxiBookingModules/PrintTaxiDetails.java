package dev.dinesh.TaxiBookingModules;

import dev.dinesh.Taxi;
import dev.dinesh.TripDetails;

import java.util.TreeMap;

public class PrintTaxiDetails {

    public void printTaxiDetails(int noOfTaxi, TreeMap<Integer, Taxi> taxiLists) {
        for (int i = 1; i <= noOfTaxi; i++) {
            Taxi taxi = taxiLists.get(i);

            System.out.printf("\n%S %d %3S %d\n", "Taxi ID: ", taxi.getTaxiID(), "Total Earnings: ", taxi.getTotalEarnings());
            System.out.printf("%S %2S %2S %2S %2S %2S\n", "BookingID", "CustomerID", "From", "To", "Time", "Amount");
            for (int j = 0; j < taxi.getTrips().size(); j++) {
                TripDetails tripDetailsPrint = taxiLists.get(i).getTrips().get(j);
                System.out.printf("%d %9d %10S %4S %2d %6d\n", tripDetailsPrint.getBookingID(), tripDetailsPrint.getCustomerID(), tripDetailsPrint.getPickupPoint(), tripDetailsPrint.getDropPoint(), tripDetailsPrint.getPickupTime(), tripDetailsPrint.getCostOfTrip());
            }
        }
    }
}
