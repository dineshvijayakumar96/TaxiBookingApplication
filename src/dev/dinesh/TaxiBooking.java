package dev.dinesh;

import dev.dinesh.TaxiBookingModules.BookTaxi;
import dev.dinesh.TaxiBookingModules.BookingDetails;

import java.util.TreeMap;

public class TaxiBooking {

    // Conditions:
    // Time taken to travel from each Point = 1hr.
    // Each Point cover distance of 15KMs.
    // Each Taxi charges Rs.100 for first 5KMs and Rs.10 for the subsequent KMs.
    // If no taxi is available from the pickup Point, Taxi from the nearest Point should be allocated.
    // If two taxi are available from the same Point. Priority goes to lower earning Taxi.
    // Taxi only charges the customer from pickup Point to drop Point.
    // If no taxi is available at that time of booking, Reject the booking request.

    public TaxiBooking(TreeMap<Integer, Taxi> taxiLists) {

        BookingDetails bookingDetails = new BookingDetails();
        bookingDetails.bookingDetails();

        BookTaxi bookTaxi = new BookTaxi();

        bookTaxi.bookTaxi(taxiLists, bookingDetails);
    }
}
