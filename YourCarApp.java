/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diana
 */
/************************************************************************
* Programmer: Diana Cardona
*
* Course: CSCI 1471
*
* Date: 02/15/2024
*
* Assignment: Program #3: YourCarApp
*
* Environment: Java with Netbeans IDE
*
* Files Included: YourCarApp
*
* Purpose: Write an application that will take your car from point A to point B,
* Calculate the total distance, how long it will take to get there, and check if 
* gas is needed.
*
* Input: Yes = 1, No = 0), Distance, Speed 
*
* Preconditions/Assumptions: Amounts are positive, car averages 20 miles per gallon
*
* Output: Ask user if going on a trip, Leg distance, Leg speed, total miles 
* traveled and time, whether or not gas is needed.
*
*
* Algorithm:
* Ask user if they are going on a trip( Yes = 1, No = 0).
* Prompt user for gas amount
* Prompt user for distance
* Prompt user for speed
* Calculate MPH
* Calculate gallons per mile
* Prompt user for another leg added to trip.
* If user inputs 1, loop will restart
* else user inputs 0, exits loop
* Output miles traveled in a certain amount message
* Output if gas is needed message
***********************************************************************/
package yourcarapp;

import java.util.Scanner;


public class YourCarApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        double distance = 0.0;
        double speed = 0.0;
        double fuel = 0.0;
        double time = 0.0;
        
        Scanner input = new Scanner ( System.in );
        
        System.out.print("Are you going on a trip? (Yes = 1 or No = 0)\n");
        int choice = input.nextInt();
        
        System.out.print("How many gallons of gas is in your tank? (1-20)");
            fuel = input.nextDouble();
            fuel++;
        
        if (choice < 0);
                System.out.print("Choice must be 1 or 0");
        if (choice > 1);
                System.out.print("Choice must be 1 or 0");
        
        while (choice == 1)
            
            System.out.print("How many miles are you going to travel?");
            distance = input.nextDouble();
            distance++;
            
            System.out.print("Enter Speed: ");
            speed = input.nextDouble();
            
            System.out.print("Want to add another leg to your trip? (Yes = 1 or No = 0)\n");
            choice = input.nextInt();
            
            
            time = distance / speed*60;
            fuel = fuel - distance/20;
        
    }
    
    System.out.print("You traveled about " + distance + " miles in about" + time + "minutes.")
    
    if (fuel > 0)
    System.out.print("You have enough fuel to return.");            
    
    else
    System.out.print("Your car will need more fuel to return.");
        
}
