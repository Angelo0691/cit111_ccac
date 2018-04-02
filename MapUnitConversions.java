/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_methods2;
import java.util.Scanner;

/**
 *
 * @author angal
 * This program is designed to convert Degrees Minutes Seconds to Decimal Degrees.
 * I chose this because of my mapping background and as a slight refresher...
 * plus I thought it might be handy in the future
 */
public class MapUnitConversions {
    public static void main(String[] args) {
        //create Scanner object to collect userInput throughout this program
        Scanner userInput = new Scanner(System.in);
        
        double degrees, minutes, seconds;
        //double minDIVsec, dd1, dd2;
        
        System.out.println("Welcome to the Coordinate Converter 3000!");
        System.out.println();
        System.out.println("1 - Degrees Minutes Seconds to Decimal Degrees");
        System.out.println("2 - Decimal Degrees to Degrees Minutes Seconds");
        System.out.println();
        System.out.println("From the list above, please choose the corresponding"
                + " method of coordinate conversion: ");        
        //assigns userInput to a selector variable to be used in the following
        //switch statement
        int selector = userInput.nextInt();
        
        if (selector == 1) {
            System.out.println("Please enter the amount of Degrees Northing you wish to convert: ");
            degrees = userInput.nextDouble();
            
            System.out.println("Please enter the amount of Minutes Northing you wish to convert: ");
            minutes = userInput.nextDouble();
            
            System.out.println("Please enter the amount of Seconds Northing you wish to convert: ");
            seconds = userInput.nextDouble();
            
            double northingDD = DMStoDD(degrees, minutes, seconds);
            
            System.out.println("Please enter the amount of Degrees Easting you wish to convert: ");
            degrees = userInput.nextDouble();
            
            System.out.println("Please enter the amount of Minutes Easting you wish to convert: ");
            minutes = userInput.nextDouble();
            
            System.out.println("Please enter the amount of Seconds Easting you wish to convert: ");
            seconds = userInput.nextDouble();
            
            double eastingDD = DMStoDD(degrees, minutes, seconds);
            
            System.out.println("Your converted Decimal Degrees Northing is: " +
                    northingDD + " N");
            System.out.println("Your converted Decimal Degrees Easting is: " +
                    eastingDD + " E");
        }
        else if (selector == 2) {
            System.out.println("Coming soon!  As soon as I figure out how to"
                    + " correctly parse the integer and fractional values from"
                    + " a double!");
        }
        else {
            System.out.println("You were given two options to choose from yet"
                    + " here we are...");
        }
        
    }//close main method
    
    public static double DMStoDD(double degrees, double minutes, double seconds) {
        
        //assigns the decimal conversion of seconds to the variable secDIVsixty
        //that will be added to the passed in value of minutes in the following line
        double secDIVsixty = seconds / 60;
        double minSUMsec = secDIVsixty + minutes;
        
        //assigns the decimal conversion of minutes (to include the addition of
        //the decimal conversion of seconds from above) to the variable minSecDecimal
        //which will then be used to add to the userInput passed in value of 
        //degrees thus giving us the Decimal Degrees (Northing) conversion of
        //Degrees Minutes Seconds which will then be returned to user via the
        //main method
        double minSecDecimal = minSUMsec / 60;
        double DD = degrees + minSecDecimal;
        
        //returning a double value Northing in the converted form of Decimal Degrees
        return DD;
        
    }
    
    public static double DDtoDMS(double latitude, double longitude) {
        
        
        return 0.0;
    }
    
}//close MapUnitConversion class
