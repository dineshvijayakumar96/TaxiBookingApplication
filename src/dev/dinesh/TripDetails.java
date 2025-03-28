package dev.dinesh;

public class TripDetails {

    private static int bookingCount = 0;
    private final int bookingID;
    private final int customerID;
    private final char pickupPoint;
    private final char dropPoint;
    private final int pickupTime;
    private final int costOfTrip;

    public TripDetails(int customerID, char pickupPoint, char dropPoint, int pickupTime, int costOfTrip) {
        ++bookingCount;
        this.bookingID = bookingCount;
        this.customerID = customerID;
        this.pickupPoint = pickupPoint;
        this.dropPoint = dropPoint;
        this.pickupTime = pickupTime;
        this.costOfTrip = costOfTrip;
    }

    public int getBookingID() {
        return bookingID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public char getPickupPoint() {
        return pickupPoint;
    }

    public char getDropPoint() {
        return dropPoint;
    }

    public int getPickupTime() {
        return pickupTime;
    }

    public int getCostOfTrip() {
        return costOfTrip;
    }
}
