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
public class SpeedEnforcement {
     public static void main(String[] args) {
           
        final int minSpeedLimit = 40, maxSpeedLimit = 55;
        
        int perpSpeed;
        
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.println("Hello Officer, how fast was the perp going? ");
        
        perpSpeed = userInputScanner.nextInt();
        
        if (perpSpeed < minSpeedLimit){
            System.out.println("Grandma must be out for a Sunday stroll!");
        }
            else if (perpSpeed > maxSpeedLimit){
                System.out.println("Car is traveling at an unsafe rate of speed!");
            
            } else System.out.println("Car is within appropriate speed range");
            
        
            
        }
    }    

