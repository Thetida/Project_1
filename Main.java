package com;

import models.Vehicle;

import java.util.List;

/**
 * Created by thetida on 9/20/17.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        ConnectJdbc example= new ConnectJdbc();
        example.Connectiondb();

        DateDemo example1=new DateDemo();
        example1.Calculate();

        Data example2=new Data();
        example2.Input();

        Utils example3=new Utils();
        example3.ReadCsv();

    }
}
