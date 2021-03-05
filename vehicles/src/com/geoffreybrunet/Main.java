package com.geoffreybrunet;

import java.util.ArrayList;
import java.util.List;

public class Main {

    List<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        this.vehicleList.add(vehicle);
    }

    public void deleteVehicle(Vehicle vehicle) {
        this.vehicleList.remove(vehicle.name);
    }

    public void changeVehicle(Vehicle vehicle) {
        this.vehicleList.set(vehicle.serialNumber, vehicle);
    }

    public void printVehicles(Vehicle vehicle) {
        System.out.println(this.vehicleList);
    }

    public void printVehicleByName(Vehicle vehicle) {
        this.vehicleList.indexOf(vehicle.name);
    }

    public void printVehicleByBrand(Vehicle vehicle) {
        this.vehicleList.indexOf(vehicle.brand);
    }

    public void printVehicleByModel(Vehicle vehicle) {
        this.vehicleList.indexOf(vehicle.model);
    }

}
