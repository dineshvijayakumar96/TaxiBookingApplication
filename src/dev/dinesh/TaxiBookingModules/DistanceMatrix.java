package dev.dinesh.TaxiBookingModules;

public class DistanceMatrix {
    private static final int[][] distanceMatrix = new int[6][6];

    static {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                distanceMatrix[i][j] = Math.abs(i - j) * 15; // Each point is 15KM apart
            }
        }
    }

    public static int getDistance(int from, int to) {
        return distanceMatrix[from][to];
    }
}
