/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.util.Scanner;
/**
 *
 * @author aalbanese
 */
public class OutOfGas {
    public static void main(String[] args) {
        //declare const variable to store my truck's avg mpg
        final int MPG = 17;
        /**Declare uninitialized variables to store the user input for gallons 
         * of fuel remaining and distance to the next service station
         */
        double gasRemain, distToGas;
        //create a new scanner object to collect user input
        Scanner userInputScanner = new Scanner(System.in);
        
        /**Output the name of the program and prompt the user to enter how much 
         * fuel remains in their vehicle
         */
        System.out.println("******** Will I Make It? ********");
        System.out.println("How many gallons of gas remain in your tank?");
        //assign the value entered by the user to the variable gasRemain
        gasRemain = userInputScanner.nextDouble();
        
        //Prompt the user to enter how far it is to the next Service Station
        System.out.println("How many miles to the next Gas Station?");
        //assign the value entered by the user to the variable distToGas
        distToGas = userInputScanner.nextDouble();
        
        /**if the amount of fuel divided by the vehicles mpg (stored in MPG)
         * is greater than or equal to the distance to the next Service Station
         * (stored in distToGas) then I output to the console a message letting
         * them know that they're gonna make it.  Otherwise, the message I send
         * to the console tells them that they are not going to make it 
         */
        if ((gasRemain / MPG) >= distToGas) {
            System.out.println("Whew!  You're gonna make it to the next station!");
        }else {
            System.out.println("You're not gonna make it sucker!");
        }//closes if-else statement
    }//closes main method
}//closes class OutOfGas
