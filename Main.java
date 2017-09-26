package com;
import databasequeries.Queries;
import models.Vehicle;
import sort.Alphanumeric;

import java.sql.Connection;
import java.util.List;

/**
 * Created by thetida on 9/20/17.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        ConnectJdbc example= new ConnectJdbc();
        Connection connectDb =example.Connectiondb();

        Queries example5= new Queries();
        example5.getVehiclesByTimeframe(connectDb);

        DateDemo example1=new DateDemo();
        example1.Calculate();

        Data example2=new Data();
        example2.Input();

        Utils example3=new Utils();
        List<Vehicle> vehicleList = example3.ReadCsv();


        Alphanumeric example4=new Alphanumeric();
        example4.sorting(vehicleList);


    }
}
