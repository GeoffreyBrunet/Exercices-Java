package com.geoffreybrunet;

public class Vehicle {
    String name;
    static String brand;
    static String model;
    static int serialNumber;
    String color;
    static int startingDate;
    static String registration;
    int mileage;
    static int motor;
    static String fuel;

    public Vehicle() {
    }

    public Vehicle(String name, String color, int mileage) {
        this.name = name;
        this.color = color;
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        Vehicle.brand = brand;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Vehicle.model = model;
    }

    public static int getSerialNumber() {
        return serialNumber;
    }

    public static void setSerialNumber(int serialNumber) {
        Vehicle.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getStartingDate() {
        return startingDate;
    }

    public static void setStartingDate(int startingDate) {
        Vehicle.startingDate = startingDate;
    }

    public static String getRegistration() {
        return registration;
    }

    public static void setRegistration(String registration) {
        Vehicle.registration = registration;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public static int getMotor() {
        return motor;
    }

    public static void setMotor(int motor) {
        Vehicle.motor = motor;
    }

    public static String getFuel() {
        return fuel;
    }

    public static void setFuel(String fuel) {
        Vehicle.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
