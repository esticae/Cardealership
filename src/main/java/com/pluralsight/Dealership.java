package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private ArrayList<Vehicle> inventory;
    private String name;
    private String address;
    private Double phone;

    public Dealership(String name, String address, double phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<Vehicle>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPhone() {
        return phone;
    }

    public void setPhone(Double phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max){
        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }
    public List<Vehicle> getVehicleByYear(double min, double max){
        return null;
    }
    public List<Vehicle> getVehicleByColor(String color){
        return null;
    }
    public List<Vehicle> getVehicleByMileage(int mileage){
        return null;
    }
    public List<Vehicle> getVehicleByType(String vehicleType){
        return null;
    }
    public List<Vehicle> getAllVehicles(){
        return null;
    }

    public void addVehicle(Vehicle){
        return null;

    }
    public void removeVehicle(){

    }


    public void add() {
    }
}
