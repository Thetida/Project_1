package com;


import java.util.Date;

public class DateDemo {
    public void Calculate(){

        Date today=new Date();
        Date myDate=new Date(today.getYear(),today.getMonth()+1,today.getDay());
        System.out.println("My Date is"+" "+myDate);
        System.out.println("Today Date is"+" "+today);
        if(today.compareTo(myDate)<0)
            System.out.println("Today Date is Lesser than my Date");
        else if(today.compareTo(myDate)>0)
            System.out.println("Today Date is Greater than my date");
        else
            System.out.println("Both Dates are equal");
    }

        //Date date = new Date();
        //System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
}
