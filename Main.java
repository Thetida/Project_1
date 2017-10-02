package com;
import export.ExpForm;
import models.Vehicle;

import java.sql.Connection;
import java.util.List;

/**
 * Created by thetida on 9/20/17.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        Data example2=new Data();
        example2.Input();

        ConnectJdbc example= new ConnectJdbc();
        Connection connectDb =example.Connectiondb();

        //Queries example5= new Queries();
        //example5.getVehiclesByTimeframe(connectDb);

        //DateDemo example1=new DateDemo();
        //example1.Calculate();



       Csv example3=new Csv();
        List<Vehicle> vehicleList = example3.ReadCsv();
        /*
        Alphanumeric example4=new Alphanumeric();
        example4.sorting(vehicleList);

        for(int i=0; i<vehicleList.size(); i++ ){
            Vehicle input= vehicleList.get(i);
            System.out.println("Plate:"+ input.getPlate());


        }  */
        ExpForm example6=new ExpForm();
        example6.doGet(connectDb);
    }
}
