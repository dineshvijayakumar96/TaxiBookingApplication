package dev.dinesh.TaxiBookingModules;

public class CalculationFunctions {

    public int calculatePrice(int totalKilometers) {
        int pricePerPointInitial = 100;
        int pricePerPointAddition = 10;
        return pricePerPointInitial + ((totalKilometers - 5) * pricePerPointAddition);
    }

    public int calculateKilometers(int pickupIndex, int dropIndex) {
        return DistanceMatrix.getDistance(pickupIndex, dropIndex);
    }
}
