package dev.dinesh.TaxiBookingModules;

import dev.dinesh.Taxi;
import dev.dinesh.TripDetails;

import java.util.TreeMap;

public class BookTaxi {
    public void bookTaxi(TreeMap<Integer, Taxi> taxiLists, BookingDetails bookingDetails) {

        CalculationFunctions calculationFunctions = new CalculationFunctions();
        CheckAvailability checkAvailability = new CheckAvailability();

        int taxiID;
        int customerID = 0;
        int freeTime;

        int pickupIndex = PointIndex.pointIndex(bookingDetails.getPickupPoint());
        int dropIndex = PointIndex.pointIndex(bookingDetails.getDropPoint());

        taxiID = checkAvailability.checkAvailability(PointIndex.pointIndex(bookingDetails.getPickupPoint()), PointIndex.pointIndex(bookingDetails.getDropPoint()), bookingDetails.getPickupTime(), taxiLists);

        if (taxiID == 0) {
            System.out.println("Currently no Taxi is available!");
        } else if (taxiID == -1){
            System.out.println("Invalid Pickup / Drop Point!");
        } else {
            Taxi taxi = taxiLists.get(taxiID);
            int totalKilometers = calculationFunctions.calculateKilometers(pickupIndex, dropIndex);

            ++customerID;
            int costOfTrip = calculationFunctions.calculatePrice(totalKilometers);
            freeTime = bookingDetails.getPickupTime() + Math.abs(pickupIndex - dropIndex);

            if (freeTime > 24) {
                freeTime -= 24;
            }

            TripDetails tripDetails = new TripDetails(customerID, bookingDetails.getPickupPoint(), bookingDetails.getDropPoint(), bookingDetails.getPickupTime(), costOfTrip);

            taxi.allocateTaxi(bookingDetails.getDropPoint(), freeTime, costOfTrip, tripDetails);

            System.out.println("TaxiID: " + taxiID + " is allotted");
        }
    }
}
