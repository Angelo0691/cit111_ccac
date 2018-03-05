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
public class RideHeight {
    public static void main(String[] args) {
           
        final int minHeight = 90;
        
        int riderHeight;
        
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Phantom Train ride!  Enter your"
                + " height in CM: ");
        
        riderHeight = userInputScanner.nextInt();
        
        if (riderHeight < minHeight){
            System.out.println("Sorry, you're too short!");
        }
            else {
            System.out.println("Your height of: " + riderHeight + "cm means you're"
                + " tall enough! Enjoy your ride!");
        }
    }    
}

