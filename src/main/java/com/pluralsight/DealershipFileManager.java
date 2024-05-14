package com.pluralsight;

import java.awt.geom.Arc2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {
    public static String getDealership(){
        try (BufferedReader buff = new BufferedReader(new FileReader("dealership.csv"))) {
            String line;
            while ((line = buff.readLine()) != null);
            String[] deal = line.split("\\|");
            if (deal.length == 8) {
                int vin = Integer.parseInt(deal[0].trim());
                int year  = Integer.parseInt(deal[1].trim());
                String make = deal[2].trim();
                String model = deal[3].trim();
                String vechileType = deal[4].trim();
                String color = deal[5].trim();
                Double odomoter = Double.parseDouble(deal[6].trim());
                Double price = Double.parseDouble(deal[7].trim());
                Vehicle vehicle = new Vehicle(vin, year, make, model, vechileType, color, odomoter, price);
                vehicle.add();



        }

    } catch (IOException e) {
            throw new RuntimeException(e);
        }
