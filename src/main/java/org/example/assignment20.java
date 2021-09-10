/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package org.example;
import java.util.Objects;
import java.util.Scanner;

public class assignment20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tax = 0;

        //ask for the order amount
        System.out.println("What is the order amount?");
        double order = scan.nextDouble();
        scan.nextLine();
        //ask for the state user lives in
        System.out.println("What state do you live in?");
        String state = scan.nextLine();

        //figures out tax from state/county
        if(Objects.equals(state,"Wisconsin")) {
            //ask for what county inside wisconsin
            System.out.println("What county do you live in?");
            String county = scan.nextLine();

            if(Objects.equals(county,"Eau Claire")) {
                tax = 0.055;
            } else if (Objects.equals(county, "Dunn")) {
                tax = 0.054;
            } else {
                tax = 0.05;
            }

        }
        else if (Objects.equals(state,"Illinois")) {
            tax = 0.08;
        }

        //do math and path for math
        double taxForOrder = order * tax;
        double total = order + taxForOrder;

        //prints out answer
        System.out.println("The tax is $" + String.format("%.2f", (double)Math.round(((order * tax)) * 100) /100) + "\n"+
                "The total is $" + String.format("%.2f",(double)Math.round((order + (order * tax)) * 100) /100));

    }
}
