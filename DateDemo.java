package com;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {
    public void Calculate(){



        DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        Date today=new Date();
        Date myDate=new Date(today.getYear(),today.getMonth()-2,today.getDay());

        System.out.println("Plate Expiration Date is"+" "+sdf.format(myDate)); //1
        System.out.println("Today Date is"+" "+sdf.format(today));

        if (myDate.compareTo(today) > 0) {
            System.out.println("Expiration Day > Today");
            System.out.println("H asfaleia soy einai energh");
        } else if (myDate.compareTo(today) < 0) {
            System.out.println("myDate < today");
            System.out.println("H asfaleia soy prepei na ananew8ei kai plhrwse prostimo");

            System.out.println("Dwse Timi Prostimoy");
            Scanner scanner = new Scanner(System.in);
            int cost = scanner.nextInt();

            long diff = today.getTime() - myDate.getTime();              //briskei thn diafora apo tis hmeronhnies  se lepta
            long diffDays = diff /(24*60*60*1000);                    //metatroph se hmeres
            System.out.println("meres metaksu toys "+ diffDays );
            Integer diffDaysi = (int) diffDays;                   //metroph toy long se integer
            int fee = diffDaysi * cost;                          //ypologismow toy prostimoy
            System.out.println("to prostimo soy einai " + fee + " euro." );
        } else if (myDate.compareTo(today) == 0) {
            System.out.println("Eisai entaksei alla prepei na ananewseis thn asfaleia soy.Shmera lhgei");
        } else {
            System.out.println("Something go wrong, try again");
        }
    }

    //Date date = new Date();
    //System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
}
