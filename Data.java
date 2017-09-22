package com;
import java.util.Scanner;

/**
 * Created by thetida on 9/21/17.
 */
public class Data {

    public void Input(){
        Scanner sc = new Scanner(System.in);
        Scanner sk = new Scanner(System.in);

        System.out.println("         1* Vihicle insurance status" + "     2* Forecoming Expiries" + "    3* Expiries by plate");

        int num = Integer.parseInt(sc.nextLine());
        int num2=0;


        if (num == 1) {

            //Scanner
            Scanner input = new Scanner(System.in);

            System.out.print("write the number of your car(you should write something like this" + "   ABC1234) > ");

            String inputString = input.nextLine();


            System.out.print("You entered : ");

            System.out.println(inputString);


            for (int i = 0; i < inputString.length(); i++) {
                if(i<3){


                    if(!Character.isLetter(inputString.charAt(i)) ){
                        System.out.println("Error " );
                        return;
                    }

                }else{
                    if(!Character.isDigit(inputString.charAt(i)) ){
                        System.out.println("Error " );
                        return;
                    }
                }
            }

            System.out.println("All Correct" );
        }

        else if(num==2){
            Scanner kb = new Scanner(System.in);
            System.out.println("---Enter export type:   "+"        1* File"+"       2* Console" );
            num2 = kb.nextInt();

            if (num2==1){
                System.out.println("You choosed File");
                System.out.println("Write the days you want to see");

            } else if (num2 == 2) {
                System.out.println("You choosed Console");
            }

        }
        else if(num==3){

            System.out.println("eisai sto 3" );

                       }
        }
    }

