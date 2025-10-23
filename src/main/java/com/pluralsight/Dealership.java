package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;


    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        /*ArrayList<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if(vehicle.getPrice()>min && vehicle.getPrice()<max) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;*/
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
        /*ArrayList<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if(!make.isEmpty() && !model.isEmpty() &&
                vehicle.getMake().equalsIgnoreCase(make) &&
                vehicle.getModel().equalsIgnoreCase(model)){
                filteredVehicles.add(vehicle);
            }
            else if (vehicle.getMake().equalsIgnoreCase(make) ||
               vehicle.getModel().equalsIgnoreCase(model)) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;*/
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(double min, double max) {
        /*ArrayList<Vehicle> filteredVehicles = new ArrayList<>();
        return filteredVehicles;*/
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        /*ArrayList<Vehicle> filteredVehicles = new ArrayList<>();
        return filteredVehicles;*/
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(double min, double max) {
        /*ArrayList<Vehicle> filteredVehicles = new ArrayList<>();
        return filteredVehicles;*/
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        /*ArrayList<Vehicle> filteredVehicles = new ArrayList<>();
        return filteredVehicles;*/
        return null;
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public void removeVehicle(ArrayList<Vehicle> vehicle) {

    }

}
