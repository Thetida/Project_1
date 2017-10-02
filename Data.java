package com;
import databasequeries.Queries;
import export.ExpForm;
import models.Vehicle;
import sort.Alphanumeric;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by thetida on 9/21/17.
 */
public class Data{




    public void Input() throws SQLException, FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        Scanner sk = new Scanner(System.in);


        String csvFile = "/home/thetida/Desktop/vehicles.csv";

        String line = "";
        String cvsSplitBy = "-";

        System.out.println("         1* Vihicle insurance status" + "     2* Forecoming Expiries" + "    3* Expiries by plate");

        int num = Integer.parseInt(sc.nextLine());
        int num2=0;
       ;

        if (num == 1) {

                Scanner input = new Scanner(System.in);

                System.out.print("write the number of your car(you should write something like this" + "   ABC-1234) > ");

                String inputString = input.nextLine();

            Csv example3=new Csv();
            List<Vehicle> vehicleList = example3.ReadCsv();

            for(int i=0; i<vehicleList.size(); i++) {

                Vehicle vehicle = vehicleList.get(i);
                if (inputString.equals(vehicle.getPlate())) {
                    System.out.println("Exists In Cv");
                }
            }


            System.out.print("You entered : ");

                System.out.println(inputString);



                for (int i = 0; i < inputString.length(); i++) {


                    if (inputString.length() != 8) {
                        System.out.println("Wrong Number");
                        return;

                    }
                    if (i == 3) {
                        if (inputString.charAt(i) != '-') {

                            System.out.println("Wrong Number2");
                            return;
                        }


                    }

                    if (i < 3) {


                        if (!Character.isLetter(inputString.charAt(i))) {
                            System.out.println("Error2 ");
                            return;

                        }

                    }
                }

                DateDemo example1 = new DateDemo();
                example1.Calculate();

        }

        else if(num==2){
            Scanner kb = new Scanner(System.in);
            System.out.println("---Enter export type:   "+"        1* File"+"       2* Console" );
            num2 = kb.nextInt();

            if (num2==1){


                ConnectJdbc example= new ConnectJdbc();
                Connection connectDb =example.Connectiondb();

                ExpForm example6=new ExpForm();
                example6.doGet(connectDb);

               // System.out.println("You choosed File");
                //System.out.println("Write the days you want to see");

            }
            else if (num2 == 2) {

                Csv example3=new Csv();
                List<Vehicle> vehicleList = example3.ReadCsv();

                Alphanumeric example4=new Alphanumeric();
                example4.sorting(vehicleList);

                for(int i=0; i<vehicleList.size(); i++ ){
                    Vehicle input= vehicleList.get(i);
                    System.out.println("Plate:"+ input.getPlate());
                }
                //System.out.println("You choosed Console");
            }
            else{

                System.out.println("You did it wrong");
            }

        }
        else if(num==3){


            ConnectJdbc example= new ConnectJdbc();
            Connection connectDb =example.Connectiondb();

            Queries example5= new Queries();
            example5.getVehiclesByTimeframe(connectDb);





            // System.out.println("eisai sto 3" );

        }
        else{

            System.out.println("You did it wrong");
        }
    }
}

