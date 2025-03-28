package dev.dinesh.TaxiBookingModules;

import static dev.dinesh.MainBookingApplication.scanner;

public class BookingDetails {

    private char pickupPoint;
    private char dropPoint;
    private int pickupTime;

    public void bookingDetails() {

        boolean isPickupPointValid = false;
        boolean isDropPointValid = false;
        boolean isPickupTimeValid = false;
        char pickupPoint = ' ';
        char dropPoint;
        int pickupTime = 0;

        while (!isPickupPointValid) {
            System.out.println("Enter the pickup Point(A, B, C, D, E, F)");
            System.out.print("-> ");
            String input = scanner.nextLine().toUpperCase().trim();
            pickupPoint = input.charAt(0);

            if (PointIndex.pointIndex(pickupPoint) != -1) {
                this.pickupPoint = pickupPoint;
                isPickupPointValid = true;
            } else {
                System.out.println("Invalid pickup Point! Please try again.");
            }
        }

        while (!isDropPointValid) {
            System.out.println("Enter the drop Point(A, B, C, D, E, F)");
            System.out.print("-> ");
            String input = scanner.nextLine().toUpperCase().trim();
            dropPoint = input.charAt(0);

            if (PointIndex.pointIndex(pickupPoint) != -1) {
                if (pickupPoint != dropPoint) {
                    this.dropPoint = dropPoint;
                    isDropPointValid = true;
                } else {
                    System.out.println("Pickup Point and Drop Point cannot be the same!");
                    System.out.println("Please try again.");
                }
            }
        }

        while (!isPickupTimeValid) {
            System.out.println("Enter the pickup Time");
            System.out.print("-> ");
            if (scanner.hasNextInt()) {
                pickupTime = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid input! Please enter a valid time.");
                scanner.nextLine();
            }

            if (pickupTime >= 6) {
                this.pickupTime = pickupTime;
                isPickupTimeValid = true;
            } else {
                System.out.println("Invalid pickup Time! Taxi service starts at 6");
                System.out.println("Please try again.");
            }
        }
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
}
