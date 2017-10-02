package com;
import models.Vehicle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by thetida on 9/22/17.
 */
public class Csv {

    public List<Vehicle> ReadCsv() {

        String csvFile = "/home/thetida/Desktop/vehicles.csv";

        String line = "";
        String cvsSplitBy = ",";

        List<Vehicle> vehicleList=new LinkedList();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] csvline = line.split(cvsSplitBy);

                Vehicle vehicle=new Vehicle();
                vehicle.fromCsvRow(csvline);       //[4,5]--> (vehicle)

              //  System.out.println("Insurances [Id= " + vehicle.getId() + " , Plate=" + vehicle.getPlate() + ",Expiration Date= "+vehicle.getDate() +"]");

                vehicleList.add(vehicle);


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vehicleList;
    }

}

