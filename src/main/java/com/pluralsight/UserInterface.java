package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public UserInterface(Dealership dealership) {
        this.dealership = dealership;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the Car Dealership application!" );
            System.out.println("Choose the action:");
            System.out.println("1 - Find vehicles within a price range\n" +
                    "2 - Find vehicles by make / model\n" +
                    "3 - Find vehicles by year range\n" +
                    "4 - Find vehicles by color\n" +
                    "5 - Find vehicles by mileage range\n" +
                    "6 - Find vehicles by type (car, truck, SUV, van)\n" +
                    "7 - List ALL vehicles\n" +
                    "8 - Add a vehicle\n" +
                    "9 - Remove a vehicle\n" +
                    "99 - Quit");

            String input = scanner.nextLine().trim();

            switch (input) {
                case "1" -> processGetByPriceRequest();
                case "2" -> processGetByMakeModelRequest();
                case "3" -> processGetByYearRequest();
                case "4" -> processGetByColorRequest();
                case "5" -> processGetByMileageRequest();
                case "6" -> processGetByVehicleTypeRequest();
                case "7" -> processGetAllVehiclesRequest();
                case "8" -> processAddVehicleRequest();
                case "9" -> processRemoveVehicleRequest();
                case "99" -> running = false;
                default -> System.out.println("Invalid option");
            }
        }
        scanner.close();
    }

    private void processGetAllVehiclesRequest() {

        displayVehicles(dealership.getAllVehicles());
    }

    private void processAddVehicleRequest() {
    }

    private void processRemoveVehicleRequest() {
    }

    private  void processGetByVehicleTypeRequest() {
    }

    private void processGetByMileageRequest() {
    }

    private  void processGetByColorRequest() {

    }

    private void processGetByYearRequest() {

    }
    private void processGetByMakeModelRequest() {

    }
    private void processGetByPriceRequest() {

    }

    private void init() {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        this.dealership = dealershipFileManager.getDealership();
    }
    private void displayVehicles(ArrayList<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }



}
