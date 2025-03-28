package dev.dinesh;

import dev.dinesh.TaxiBookingModules.InitializeTaxiList;
import dev.dinesh.TaxiBookingModules.PrintTaxiDetails;

import java.util.Scanner;
import java.util.TreeMap;

public class MainBookingApplication {

    public static final Scanner scanner = new Scanner(System.in);
    public static final TreeMap<Integer, Taxi> taxiLists = new TreeMap<>();
    private static final int noOfTaxi = 4;

    public static void menu() {

        boolean isMenuActive = true;

        while (isMenuActive) {
            System.out.println("""
                    
                    --------------------------------
                    Taxi Booking Application
                    --------------------------------
                    1. Book Taxi
                    2. Print Taxi Details
                    3. Exit
                    
                    Enter the number from the above options
                    """);

            System.out.print("-> ");
            int userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {
                case 1 -> new TaxiBooking(taxiLists);
                case 2 -> {
                    PrintTaxiDetails printTaxiDetails = new PrintTaxiDetails();
                    printTaxiDetails.printTaxiDetails(noOfTaxi, taxiLists);
                }
                case 3 -> isMenuActive = false;
                default -> System.out.println("Invalid Input! Please Try Again.");
            }
        }
    }

    public static void main(String[] args) {

        InitializeTaxiList initializeTaxiList = new InitializeTaxiList();
        initializeTaxiList.initializeTaxiList(noOfTaxi, taxiLists);

        menu();

    }
}
