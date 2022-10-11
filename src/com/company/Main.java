package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age,flightKm;
        double pricePerKm=0.10;
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        /**
         * validates input as a integer
         * */
        do {
            System.out.println("Please enter your age value as a number! (please positive value)");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a positive number!");
                sc.next();
            }
             age = sc.nextInt();
        } while (age <= 0);

        /**
         * validates input as a integer
         * */
        do {
            System.out.println("Please enter your aimed destination flight km");
            while (!sc.hasNextInt()) {
                System.out.println("Enter positive value!");
                sc.next();
            }
            flightKm = sc.nextInt();
        } while (flightKm <= 0);


        System.out.println("Please enter your trip type (1 => One Way , 2 => Two Way )");
        int flightType=scanner.nextInt();

        double flightPrice=flightKm*pricePerKm;

        double flightPriceAccordingToAge=flightPriceDiscount(age,flightPrice);

        if(flightType==1){
            double flightPriceAccordingToType=flightPriceAccordingToAge-(flightPriceAccordingToAge*(0.2));
            System.out.println("Flight price is "+flightPriceAccordingToType );
        }
        else{
            System.out.println("Flight price is "+flightPriceAccordingToAge );
        }

    }



    public static double flightPriceDiscount(double age,double flightPrice){
        if(age<12){
            flightPrice-=(flightPrice*(0.5));
        }
        else if(age>12 && age<24){
            flightPrice-=(flightPrice*(0.1));
        }
        else if(age>65){
            flightPrice-=(flightPrice*(0.3));
        }
    return flightPrice;
    }
}
